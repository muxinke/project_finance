package com.finance.www.pojo;

import java.util.Date;

public class Produit {
    private Integer id;

    private Integer investmentType;

    private Integer produitsOrdre;

    private String montantDeOffre;

    private String investmentAmount;

    private Integer produitDureeDes;

    private Integer produitMarque;

    private Integer remboursementsExpires;

    private Integer remboursementsGuise;

    private Integer isCondition;

    private Date dateDeValeur;

    private String natureDuSujet;

    private String secteurActivite;

    private String revenuAnnuel;

    private String creditFruit;

    private String totalEngagements;

    private String autresEmprunts;

    private Date createTime;

    private Date updateTime;

    private Integer isConsent;

    private String yearInterestRate;

    private String haveNotPrincipaInterest;

    private String hasAlsoPrincipaInterest;

    private String shouldCallPrincipaInterest;

    private String borrowingTitle;

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