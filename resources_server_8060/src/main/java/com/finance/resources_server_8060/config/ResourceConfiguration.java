package com.finance.resources_server_8060.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;


/**
 * @author ：邓一凡
 * @date ：Created in 2019/7/25 15:46
 * @description ：
 */

@Configuration
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class ResourceConfiguration extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .exceptionHandling()
                .and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                // 以下为配置所需保护的资源路径及权限，需要与认证服务器配置的授权部分对应
//                .antMatchers("/**").hasAuthority("System")
//                .antMatchers("/view/**").hasAuthority("SystemUserView")
//                .antMatchers("/insert/**").hasAuthority("SystemUserInsert")
//                .antMatchers("/update/**").hasAuthority("SystemUserUpdate")
//                .antMatchers("/delete/**").hasAuthority("SystemUserDelete")
        ;
    }

}

