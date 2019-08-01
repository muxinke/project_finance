package com.finance.www.service.impl;

import com.finance.www.mapper.MemberAccountMapper;
import com.finance.www.mapper.MemberLimitMapper;
import com.finance.www.mapper.SmallOanMapper;
import com.finance.www.pojo.MemberAccount;
import com.finance.www.pojo.MemberLimit;
import com.finance.www.pojo.MemberLimitExample;
import com.finance.www.pojo.SmallOanExample;
import com.finance.www.service.SmallOanService;
import com.finance.www.vo.MemberSmallBorrow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;


/**
 * Created by Administrator on 2019/7/25.
 */
@Service
@EnableTransactionManagement
public class SmallOanServiceImpl implements SmallOanService {
    @Autowired
    private SmallOanMapper smallOanMapper;
    @Autowired
    private MemberAccountMapper memberAccountMapper;
    @Autowired
    private MemberLimitMapper memberLimitMapper;
    /**
     * 开启事物，增加记录 修改可借余额
     * @param memberSmallBorrow
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean addRecord(MemberSmallBorrow memberSmallBorrow) {
        //增加记录
       smallOanMapper.addRecord(memberSmallBorrow);
        long l = Long.parseLong(memberSmallBorrow.getBorrowMoney())*100;
      //修改用户可借余额
        memberLimitMapper.updateEdu(memberSmallBorrow.getMemberId(),l);
        return true;
    }

    /**
     *  开启事物，同时操作
     * @param memberSmallBorrow
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean insertRecord(MemberSmallBorrow memberSmallBorrow) {
        try {
            /**记录数据*/
            smallOanMapper.addRecord(memberSmallBorrow);
            long l = Long.parseLong(memberSmallBorrow.getBorrowMoney())*100;

            /**修改用户可借余额*/
            memberLimitMapper.updateEdu(memberSmallBorrow.getMemberId(),l);
            /**第一步在数据库中查找当前用户的账户是否在之前的本地账户中有记录*/
           MemberAccount memberAccount= memberAccountMapper.queryById(memberSmallBorrow.getMemberId());
            /**如果不存在直接将钱存到本地账户数据库*/
           if(memberAccount==null){
                memberAccountMapper.add(memberSmallBorrow.getMemberId(),l);
            }else {
               /**如果存在修改原来的金额*/
                long newl = l+memberAccount.getAccountBalance();
                memberAccountMapper.updateAccount(memberSmallBorrow.getMemberId(),newl);
            }
            return true;
        } catch (Exception e) {
            /**手动设置回滚*/
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
        return false;
    }
}
