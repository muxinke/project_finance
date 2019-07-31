package com.finance.www.ProduitTest;

import com.finance.www.mapper.ProduitMapper;
import com.finance.www.pvo.JieKuanXxVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by 杜碧天 on 2019/7/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Configuration("com.finance.www.mapper.ProduitMapper")
public class ppTest {
    @Autowired
    ProduitMapper produitMapper;
    @Test
    public void test1(){
        JieKuanXxVo jieKuanXxVo = produitMapper.chajkXx(1);
        System.out.println(jieKuanXxVo);
    }
}
