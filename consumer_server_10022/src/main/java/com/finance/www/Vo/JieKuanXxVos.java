package com.finance.www.Vo;

import lombok.Data;


/**
 * Created by 杜碧天 on 2019/7/25.
 */
@Data
public class JieKuanXxVos {
    private Integer pid;
    //投资类型
    private String  investmentType;
    /**
     *产品等级
     */
    private String  produitsOrdre;
    /**
     *投标金额
     */
    private String  montantDeOffre;
    /**
     *
     已投金额
     */
    private String investmentAmount;
    /**
     *产品期限
     */
    private Integer produitDureeDes;
    /**
     * 产品标号

     */
    private Integer produitMarque;
    /**
     *还款期限

     */
    private Integer remboursementsExpires;
    /**
     *
     还款方式
     */
    private String  remboursementsGuise;
    /**
     *
     项目状态

     */
    private String  isCondition;
    /**
     *起息时间

     */
    private String dateDeValeur;
    /**
     * 剩余时间
     */
    private  String dateShengyu;
    /**
     *主体性质

     */
    private String natureDuSujet;
    /**
     *所属行业

     */
    private String secteurActivite;
    /**
     * 年收入情况

     */
    private String revenuAnnuel;
    /**
     *征信报告核查结果信息

     */
    private String creditFruit;
    /**
     * 负债情况

     */
    private String totalEngagements;
    /**
     *其他借款情况

     */
    private String autresEmprunts;


    /**
     * 年利率

     */
    private String yearInterestRate;
    /**
     * 借款标题

     */
    private String borrowingTitle;
    /**
     * 可投金额
     */
    private String ketou;
    /**
     * 完成率
     */
    private  String wanchenglv;
    /**
     * 完成%
     */
    private String wcbaifenbi;
    /**
     * 成功借款次数
     */
    private Integer numberSuccess;

    /**
     * 流标次数
     */
    private Integer flowStandardNumber;

    /**
     * 成功还款次数
     */
    private Integer successPaymentNumber;

    /**
     * 30天内逾期数
     */
    private Integer daysOverdue;

    /**
     * 逾期未还款期数
     */
    private Integer overdueBillsNumber;

    /**
     * 提前还款期数
     */
    private Integer prepaymentPeriodsNumber;

    /**
     * 超过30天的逾期期数
     */
    private Integer more30daysOverdue;
    /**
     * 待还款次数
     */
    private Integer daihuancs;
    /**
     * 债务人详情
     */
    private String debtorParticulars;

    /**
     * 担保人详情
     */
    private String guarantorDetails;

    /**
     * 贷款用途
     */
    private String loansUsed;

    /**
     * 还款来源
     */
    private String sourceRepayment;
    /**
     * 标识小字
     */
    private String biaoShiXiaoZi;
    /**
     * 终审意见
     */
    private String finalOpinion;
}
