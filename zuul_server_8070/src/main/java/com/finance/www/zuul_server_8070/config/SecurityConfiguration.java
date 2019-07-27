package com.finance.www.zuul_server_8070.config;

import com.finance.www.pojo.Memeber;
import com.finance.www.pojo.MemeberExample;
import com.finance.www.zuul_server_8070.service.MemeberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.List;

/**
 * @author ：邓一凡
 * @date ：Created in 2019/7/25 14:10
 * @description ：
 */

@Configuration


public class SecurityConfiguration extends WebSecurityConfigurerAdapter {


    // 请配置这个，以保证在刷新Token时能成功刷新

    @Autowired

    public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {

        // 配置用户来源于数据库

        // 配置密码加密方式  BCryptPasswordEncoder，添加用户加密的时候请也用这个加密

        auth.userDetailsService(userDetailsService()).passwordEncoder(new BCryptPasswordEncoder());



        System.out.println("------------------------");
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String password = passwordEncoder.encode("971103");
        System.err.println("password = " + password);
    }

    @Bean(name = BeanIds.AUTHENTICATION_MANAGER)
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired

    MemeberService memeberService;

    @Bean

    @Override

    protected UserDetailsService userDetailsService() {

        // #####################实际开发中在下面写从数据库获取数据###############################


        return new UserDetailsService() {

            @Override
            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

                // 通过用户名获取用户信息
                MemeberExample memeberExample = new MemeberExample();
                MemeberExample.Criteria criteria = memeberExample.createCriteria();
                criteria.andUsernameEqualTo(username);

                List<Memeber> memebers = memeberService.selectByExample(memeberExample);


                boolean isUserExist = memebers != null && memebers.size() > 0;

                if (isUserExist) {
                    Memeber memeber = memebers.get(0);
                    //创建spring security安全用户和对应的权限（从数据库查找）

                    return new User(memeber.getUsername(), memeber.getPassword(),

                            AuthorityUtils.createAuthorityList("admin", "manager"));

                } else {

                    throw new UsernameNotFoundException("用户[" + username + "]不存在");

                }

            }

        };


    }


    @Override

    protected void configure(HttpSecurity http) throws Exception {

//         @formatter:off

        http.requestMatchers().anyRequest()
                .and()
                .authorizeRequests()
                .antMatchers("/oauth/*")
                .permitAll();

        // @formatter:on

    }

}
