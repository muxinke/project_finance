package com.finance.www.pojo;

import java.io.Serializable;
import java.util.Date;

public class Produit implements Serializable {
    private Integer id;
    //投资类型
    private Integer investmentType;
    /**
     *产品等级
     */
    private Integer produitsOrdre;
    /**
     *投标金额
     */
    private String montantDeOffre;
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
    private Integer remboursementsGuise;
    /**
     *
     项目状态

     */
    private Integer isCondition;
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
     *创建时间

     */
    private Date createTime;
    /**
     *最后更改时间

     */
    private Date updateTime;
    /**
     * 是否同意借款协议&征信授权协议

     */
    private Integer isConsent;
    /**
     * 年利率

     */
    private String yearInterestRate;
    /**
     *
     未还本息

     */
    private String haveNotPrincipaInterest;
    /**
     * 已还本息

     */
    private String hasAlsoPrincipaInterest;
    /**
     * 应还本息

     */
    private String shouldCallPrincipaInterest;
    /**
     * 借款标题

     */
    private String borrowingTitle;
    /**
     *发布时间
     */
    private Date releaseTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInvestmentType() {
        return investmentType;
    }

    public void setInvestmentType(Integer investmentType) {
        this.investmentType = investmentType;
    }

    public Integer getProduitsOrdre() {
        return produitsOrdre;
    }

    public void setProduitsOrdre(Integer produitsOrdre) {
        this.produitsOrdre = produitsOrdre;
    }

    public String getMontantDeOffre() {
        return montantDeOffre;
    }

    public void setMontantDeOffre(String montantDeOffre) {
        this.montantDeOffre = montantDeOffre == null ? null : montantDeOffre.trim();
    }

    public String getInvestmentAmount() {
        return investmentAmount;
    }

    public void setInvestmentAmount(String investmentAmount) {
        this.investmentAmount = investmentAmount == null ? null : investmentAmount.trim();
    }

    public Integer getProduitDureeDes() {
        return produitDureeDes;
    }

    public void setProduitDureeDes(Integer produitDureeDes) {
        this.produitDureeDes = produitDureeDes;
    }

    public Integer getProduitMarque() {
        return produitMarque;
    }

    public void setProduitMarque(Integer produitMarque) {
        this.produitMarque = produitMarque;
    }

    public Integer getRemboursementsExpires() {
        return remboursementsExpires;
    }

    public void setRemboursementsExpires(Integer remboursementsExpires) {
        this.remboursementsExpires = remboursementsExpires;
    }

    public Integer getRemboursementsGuise() {
        return remboursementsGuise;
    }

    public void setRemboursementsGuise(Integer remboursementsGuise) {
        this.remboursementsGuise = remboursementsGuise;
    }

    public Integer getIsCondition() {
        return isCondition;
    }

    public void setIsCondition(Integer isCondition) {
        this.isCondition = isCondition;
    }

    public Date getDateDeValeur() {
        return dateDeValeur;
    }

    public void setDateDeValeur(Date dateDeValeur) {
        this.dateDeValeur = dateDeValeur;
    }

    public String getNatureDuSujet() {
        return natureDuSujet;
    }

    public void setNatureDuSujet(String natureDuSujet) {
        this.natureDuSujet = natureDuSujet == null ? null : natureDuSujet.trim();
    }

    public String getSecteurActivite() {
        return secteurActivite;
    }

    public void setSecteurActivite(String secteurActivite) {
        this.secteurActivite = secteurActivite == null ? null : secteurActivite.trim();
    }

    public String getRevenuAnnuel() {
        return revenuAnnuel;
    }

    public void setRevenuAnnuel(String revenuAnnuel) {
        this.revenuAnnuel = revenuAnnuel == null ? null : revenuAnnuel.trim();
    }

    public String getCreditFruit() {
        return creditFruit;
    }

    public void setCreditFruit(String creditFruit) {
        this.creditFruit = creditFruit == null ? null : creditFruit.trim();
    }

    public String getTotalEngagements() {
        return totalEngagements;
    }

    public void setTotalEngagements(String totalEngagements) {
        this.totalEngagements = totalEngagements == null ? null : totalEngagements.trim();
    }

    public String getAutresEmprunts() {
        return autresEmprunts;
    }

    public void setAutresEmprunts(String autresEmprunts) {
        this.autresEmprunts = autresEmprunts == null ? null : autresEmprunts.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getIsConsent() {
        return isConsent;
    }

    public void setIsConsent(Integer isConsent) {
        this.isConsent = isConsent;
    }

    public String getYearInterestRate() {
        return yearInterestRate;
    }

    public void setYearInterestRate(String yearInterestRate) {
        this.yearInterestRate = yearInterestRate == null ? null : yearInterestRate.trim();
    }

    public String getHaveNotPrincipaInterest() {
        return haveNotPrincipaInterest;
    }

    public void setHaveNotPrincipaInterest(String haveNotPrincipaInterest) {
        this.haveNotPrincipaInterest = haveNotPrincipaInterest == null ? null : haveNotPrincipaInterest.trim();
    }

    public String getHasAlsoPrincipaInterest() {
        return hasAlsoPrincipaInterest;
    }

    public void setHasAlsoPrincipaInterest(String hasAlsoPrincipaInterest) {
        this.hasAlsoPrincipaInterest = hasAlsoPrincipaInterest == null ? null : hasAlsoPrincipaInterest.trim();
    }

    public String getShouldCallPrincipaInterest() {
        return shouldCallPrincipaInterest;
    }

    public void setShouldCallPrincipaInterest(String shouldCallPrincipaInterest) {
        this.shouldCallPrincipaInterest = shouldCallPrincipaInterest == null ? null : shouldCallPrincipaInterest.trim();
    }

    public String getBorrowingTitle() {
        return borrowingTitle;
    }

    public void setBorrowingTitle(String borrowingTitle) {
        this.borrowingTitle = borrowingTitle == null ? null : borrowingTitle.trim();
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }
}