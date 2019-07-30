package com.finance.www.oauth_server_8050.config;

import com.finance.www.oauth_server_8050.service.MemeberService;
import com.finance.www.pojo.Memeber;
import com.finance.www.pojo.MemeberExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.KeyStoreKeyFactory;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/7/25 14:08
 * @description ：配置客户端详情信息（Client Details)
 */

@Configuration
public class AuthServerConfig extends AuthorizationServerConfigurerAdapter {

    // 资源ID

    private static final String SOURCE_ID = "order";

    private static final int ACCESS_TOKEN_TIMER = 60 * 60;

    private static final int REFRESH_TOKEN_TIMER = 60 * 60 * 24;


    @Autowired

    AuthenticationManager authenticationManager;

    @Autowired

    RedisConnectionFactory redisConnectionFactory;

    @Autowired

    PasswordEncoder passwordEncoder;


    @Override

    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        //

        clients.inMemory()
                // 客户端id  相当于APPID
                .withClient("login")
                /* 资源id 我们可以为每一个Resource Server（一个微服务实例）设置一个resourceid。再给client授权的时候，
                 可以设置这个client可以访问哪一些微服务实例，如果没设置，就是对所有的resource都有访问权限。*/
                //  .resourceIds(SOURCE_ID)
                // 授权类型 第二个是更新令牌的令牌
                //  .authorizedGrantTypes("password")
                .authorizedGrantTypes("code", "refresh_token")
                // 回调地址 授权模式
                .redirectUris("http://localhost:8888/login")
                // 回调地址 授权模式
                .authorizedGrantTypes("authorization_code")
                // 范围
                .scopes("all")
                /* 密钥    相当于 App SecretKey
                如果你用的是5.0.7的版本，那么在设置secret的是需要加密的，正确的赋值方式.secret(passwordEncoder.encode("你的值"))。
                 */
                .secret(passwordEncoder.encode("loginsecret"))
                // 访问令牌有效性秒
                .accessTokenValiditySeconds(ACCESS_TOKEN_TIMER)
                // 刷新令牌有效性秒
                .refreshTokenValiditySeconds(REFRESH_TOKEN_TIMER)
                // 一个配置结束 连接下一个配置
                .and()

                .withClient("dyf")

                .secret(passwordEncoder.encode("secret"))

                .scopes("read")

                .authorizedGrantTypes("password", "refresh_token");

    }


    @Override

    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {

        // 访问令牌转换器
        endpoints.accessTokenConverter(accessTokenConverter());
        // 令牌存储
//        endpoints.tokenStore(tokenStore()).authenticationManager(authenticationManager);
        endpoints.authenticationManager(authenticationManager).allowedTokenEndpointRequestMethods(HttpMethod.GET, HttpMethod.POST);

    }


    @Override

    public void configure(AuthorizationServerSecurityConfigurer oauthServer) {

        // 允许表单认证

        oauthServer.allowFormAuthenticationForClients();

        // 允许check_token访问
        oauthServer.checkTokenAccess("permitAll()");

    }

    @Autowired

    MemeberService memeberService;


    // JWT

    @Bean

    public JwtAccessTokenConverter accessTokenConverter() {

        JwtAccessTokenConverter accessTokenConverter = new JwtAccessTokenConverter() {

            /**
             * 重写增强token方法,用于自定义一些token总需要封装的信息

             */

            @Override

            public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
                String userName = authentication.getUserAuthentication().getName();
                System.err.println("userName = " + userName);
                // 得到用户名，去处理数据库可以拿到当前用户的信息和角色信息（需要传递到服务中用到的信息）
                final Map<String, Object> additionalInformation = new HashMap<>();
                MemeberExample memeberExample = new MemeberExample();
                memeberExample.createCriteria().andUsernameEqualTo(userName);
                List<Memeber> memebers = memeberService.selectByExample(memeberExample);
                Memeber memeber = memebers.get(0);
                additionalInformation.put("userName", userName);
                additionalInformation.put("userId", memeber.getId());
                additionalInformation.put("Email", memeber.getEmail());
                additionalInformation.put("Mobile", memeber.getMobile());
                additionalInformation.put("CreateTime", memeber.getCreateTime());
                ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(additionalInformation);
                return super.enhance(accessToken, authentication);
            }

        };

        // 生产时候使用RSA非对称加密方式

        KeyStoreKeyFactory keyStoreKeyFactory =
                new KeyStoreKeyFactory(new ClassPathResource("easydai.jks"), "easydai".toCharArray());
        accessTokenConverter.setKeyPair(keyStoreKeyFactory.getKeyPair("easydai"));


        return accessTokenConverter;

    }


    @Bean

    public TokenStore tokenStore() {

        return new RedisTokenStore(redisConnectionFactory);

    }


}

