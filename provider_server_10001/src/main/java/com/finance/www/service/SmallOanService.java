package com.finance.www.service;

import com.finance.www.vo.MemberSmallBorrow;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2019/7/25.
 */
public interface SmallOanService {
    /**记录用户小额借款
     *
     * @param memberSmallBorrow
     * @return
     */
    public boolean addRecord(MemberSmallBorrow memberSmallBorrow);

    /**
     * 记录用户小额借款，打给个人账户
     * @param memberSmallBorrow
     * @return
     */
    boolean insertRecord(MemberSmallBorrow memberSmallBorrow);
}
