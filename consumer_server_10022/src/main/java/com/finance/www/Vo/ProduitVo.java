package com.finance.www.Vo;

import lombok.Data;

import java.util.Date;

/**
 * Created by 杜碧天 on 2019/7/24.
 */
@Data
public class ProduitVo {
    private Integer id;
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
    private Date dateDeValeur;
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
    private  String wanchenglv;
    private String wcbaifenbi;
    /**
     * 标题小字
     */
    private String biaotizi;

}
