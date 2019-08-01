package com.finance.www.testmapper;

import com.finance.www.mapper.SmallOanMapper;
import com.finance.www.vo.MemberSmallBorrow;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Administrator on 2019/7/31.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Configuration("com.finance.www.mapper")
public class TestMapper {
    @Autowired
    private SmallOanMapper smallOanMapper;
    @Test
    public void test(){
        MemberSmallBorrow borrow = new MemberSmallBorrow();
        borrow.setIs_agreed(1);
        borrow.setMemberId(2);
        borrow.setBorrowStyle(1);
        borrow.setBorrowMoney("1000");
        int i = smallOanMapper.addRecord(borrow);
        System.out.println("borrow.getLoad_id() = " + borrow.getLoad_id());
    }
}
