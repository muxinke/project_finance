package com.finance.www.zuul_server_8070.config;

import com.alibaba.fastjson.JSON;
import com.finance.www.pojo.Memeber;
import com.finance.www.pojo.MemeberExample;
import com.finance.www.zuul_server_8070.service.MemeberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationManager;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/7/25 14:08
 * @description ：
 */

@Configuration



public class AuthServerConfig extends AuthorizationServerConfigurerAdapter {

    // 资源ID

    private static final String SOURCE_ID = "order";

    private static final int ACCESS_TOKEN_TIMER = 60 * 60 * 24;

    private static final int REFRESH_TOKEN_TIMER = 60 * 60 * 24 * 30;


    @Autowired

    AuthenticationManager authenticationManager;

    @Autowired

    RedisConnectionFactory redisConnectionFactory;


    @Override

    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
       PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        clients.inMemory().withClient("myapp").resourceIds(SOURCE_ID).authorizedGrantTypes("password", "refresh_token")

                .scopes("all").authorities("ADMIN").secret(passwordEncoder.encode("lxapp")).accessTokenValiditySeconds(ACCESS_TOKEN_TIMER)

                .refreshTokenValiditySeconds(REFRESH_TOKEN_TIMER);

    }


    @Override

    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {

        endpoints.accessTokenConverter(accessTokenConverter());

        endpoints.tokenStore(tokenStore()).authenticationManager(authenticationManager);

    }


    @Override

    public void configure(AuthorizationServerSecurityConfigurer oauthServer) {

        // 允许表单认证

        oauthServer.allowFormAuthenticationForClients();

    }

    @Autowired

    MemeberService memeberService;


    // JWT

    @Bean

    public JwtAccessTokenConverter accessTokenConverter() {

        JwtAccessTokenConverter accessTokenConverter = new JwtAccessTokenConverter() {

            /***
             * 重写增强token方法,用于自定义一些token总需要封装的信息

             */

            @Override

            public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {

                String userName = authentication.getUserAuthentication().getName();

                // 得到用户名，去处理数据库可以拿到当前用户的信息和角色信息（需要传递到服务中用到的信息）

                final Map<String, Object> additionalInformation = new HashMap<>();

                ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(additionalInformation);

                return super.enhance(accessToken, authentication);

            }

        };

        // 测试用,资源服务使用相同的字符达到一个对称加密的效果,生产时候使用RSA非对称加密方式

        accessTokenConverter.setSigningKey("SigningKey");

        return accessTokenConverter;

    }


    @Bean

    public TokenStore tokenStore() {

        return new RedisTokenStore(redisConnectionFactory);

    }


}

