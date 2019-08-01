package com.finance.www.oauth_server_8050;

import com.finance.www.oauth_server_8050.mapper.MemeberMapper;
import com.finance.www.oauth_server_8050.service.MemeberService;
import com.finance.www.pojo.Memeber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OauthServer8050ApplicationTests {

    @Autowired
    MemeberMapper service;

    @Test
    public void contextLoads() {
        System.err.println(new BCryptPasswordEncoder().encode("mxkresources2"));


    }


}
