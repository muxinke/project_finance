package com.finance.www.oauth_server_8050.config;


import com.finance.www.oauth_server_8050.service.MemeberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;
import javax.sql.DataSource;
import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/7/25 14:08
 * @description ： 配置认证服务器
 */
@Configuration
@EnableAuthorizationServer
public class AuthServerConfig extends AuthorizationServerConfigurerAdapter {

    // 资源ID

    private static final String SOURCE_ID = "order";

    private static final int ACCESS_TOKEN_TIMER = 60 * 60;

    private static final int REFRESH_TOKEN_TIMER = 60 * 60 * 24;

    @Autowired
    MemeberService memeberService;

    @Autowired
    PasswordEncoder passwordEncoder;

//    @Autowired
//    AuthenticationManager authenticationManager;

    @Autowired
    RedisConnectionFactory redisConnectionFactory;

    @Autowired
    private DataSource dataSource;

    @Bean
    public ClientDetailsService jdbcClientDetails() {
        // 基于 JDBC 实现，需要事先在数据库配置客户端信息
        return new JdbcClientDetailsService(dataSource);
    }

//    @Bean
//    public TokenStore tokenStore() {
//        // 基于redis 实现 令牌保存到缓存数据库
//        return new RedisTokenStore(redisConnectionFactory);
//    }

    @Bean
    public TokenStore tokenStore() {
        // 基于 jdbc 实现，令牌保存
        return new JdbcTokenStore(dataSource);
    }



    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints){
        // 设置令牌
        endpoints.tokenStore(tokenStore());
    }



    @Override

    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        // 读取客户端配置
        clients.withClientDetails(jdbcClientDetails());

    }


/*    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        // 访问令牌转换器
        endpoints.accessTokenConverter(accessTokenConverter());
        // 令牌存储
//        endpoints.tokenStore(tokenStore()).authenticationManager(authenticationManager);
//        endpoints.authenticationManager(authenticationManager).allowedTokenEndpointRequestMethods(HttpMethod.GET, HttpMethod.POST);
    }*/

    @Override
    public void configure(AuthorizationServerSecurityConfigurer oauthServer) {
        // 允许表单认证
        oauthServer.allowFormAuthenticationForClients();
        // 允许check_token访问
        oauthServer.checkTokenAccess("permitAll()");
    }




/*

    // JWT
    @Bean
    public JwtAccessTokenConverter accessTokenConverter() {
        JwtAccessTokenConverter accessTokenConverter = new JwtAccessTokenConverter() {

             重写增强token方法,用于自定义一些token总需要封装的信息


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
        KeyStoreKeyFactory keyStoreKeyFactory = new KeyStoreKeyFactory(new ClassPathResource("easydai.jks"), "easydai".toCharArray());
        accessTokenConverter.setKeyPair(keyStoreKeyFactory.getKeyPair("easydai"));
        return accessTokenConverter;
    }

*/




}

