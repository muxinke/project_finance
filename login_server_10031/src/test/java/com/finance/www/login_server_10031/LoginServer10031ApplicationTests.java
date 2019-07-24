package com.finance.www.login_server_10031;

import com.finance.www.login_server_10031.service.MemeberService;
import com.finance.www.pojo.Memeber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginServer10031ApplicationTests {


    @Autowired
    MemeberService service;

    @Test
    public void contextLoads() {
        Memeber memeber = new Memeber();
        memeber.setMobile("1111111111");
        int i = service.insertSelective(memeber);
        System.err.println("i = " + i);

    }

}
