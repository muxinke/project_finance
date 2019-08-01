package com.finance.www;

import com.finance.www.service.QueryBigLoadService;
import com.finance.www.vo.ApplyMoney;
import com.google.common.collect.PeekingIterator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Configuration("com.finance.www.service")
public class QueryBigload10006ApplicationTests {
	@Autowired
	private QueryBigLoadService queryBigLoadService;
	@Test
	public void contextLoads() {
	}
}
