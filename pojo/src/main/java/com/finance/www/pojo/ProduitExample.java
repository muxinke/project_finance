package com.finance.www.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProduitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProduitExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andInvestmentTypeIsNull() {
            addCriterion("investment_type is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentTypeIsNotNull() {
            addCriterion("investment_type is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentTypeEqualTo(Integer value) {
            addCriterion("investment_type =", value, "investmentType");
            return (Criteria) this;
        }

        public Criteria andInvestmentTypeNotEqualTo(Integer value) {
            addCriterion("investment_type <>", value, "investmentType");
            return (Criteria) this;
        }

        public Criteria andInvestmentTypeGreaterThan(Integer value) {
            addCriterion("investment_type >", value, "investmentType");
            return (Criteria) this;
        }

        public Criteria andInvestmentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("investment_type >=", value, "investmentType");
            return (Criteria) this;
        }

        public Criteria andInvestmentTypeLessThan(Integer value) {
            addCriterion("investment_type <", value, "investmentType");
            return (Criteria) this;
        }

        public Criteria andInvestmentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("investment_type <=", value, "investmentType");
            return (Criteria) this;
        }

        public Criteria andInvestmentTypeIn(List<Integer> values) {
            addCriterion("investment_type in", values, "investmentType");
            return (Criteria) this;
        }

        public Criteria andInvestmentTypeNotIn(List<Integer> values) {
            addCriterion("investment_type not in", values, "investmentType");
            return (Criteria) this;
        }

        public Criteria andInvestmentTypeBetween(Integer value1, Integer value2) {
            addCriterion("investment_type between", value1, value2, "investmentType");
            return (Criteria) this;
        }

        public Criteria andInvestmentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("investment_type not between", value1, value2, "investmentType");
            return (Criteria) this;
        }

        public Criteria andProduitsOrdreIsNull() {
            addCriterion("produits_ordre is null");
            return (Criteria) this;
        }

        public Criteria andProduitsOrdreIsNotNull() {
            addCriterion("produits_ordre is not null");
            return (Criteria) this;
        }

        public Criteria andProduitsOrdreEqualTo(Integer value) {
            addCriterion("produits_ordre =", value, "produitsOrdre");
            return (Criteria) this;
        }

        public Criteria andProduitsOrdreNotEqualTo(Integer value) {
            addCriterion("produits_ordre <>", value, "produitsOrdre");
            return (Criteria) this;
        }

        public Criteria andProduitsOrdreGreaterThan(Integer value) {
            addCriterion("produits_ordre >", value, "produitsOrdre");
            return (Criteria) this;
        }

        public Criteria andProduitsOrdreGreaterThanOrEqualTo(Integer value) {
            addCriterion("produits_ordre >=", value, "produitsOrdre");
            return (Criteria) this;
        }

        public Criteria andProduitsOrdreLessThan(Integer value) {
            addCriterion("produits_ordre <", value, "produitsOrdre");
            return (Criteria) this;
        }

        public Criteria andProduitsOrdreLessThanOrEqualTo(Integer value) {
            addCriterion("produits_ordre <=", value, "produitsOrdre");
            return (Criteria) this;
        }

        public Criteria andProduitsOrdreIn(List<Integer> values) {
            addCriterion("produits_ordre in", values, "produitsOrdre");
            return (Criteria) this;
        }

        public Criteria andProduitsOrdreNotIn(List<Integer> values) {
            addCriterion("produits_ordre not in", values, "produitsOrdre");
            return (Criteria) this;
        }

        public Criteria andProduitsOrdreBetween(Integer value1, Integer value2) {
            addCriterion("produits_ordre between", value1, value2, "produitsOrdre");
            return (Criteria) this;
        }

        public Criteria andProduitsOrdreNotBetween(Integer value1, Integer value2) {
            addCriterion("produits_ordre not between", value1, value2, "produitsOrdre");
            return (Criteria) this;
        }

        public Criteria andMontantDeOffreIsNull() {
            addCriterion("montant_de_offre is null");
            return (Criteria) this;
        }

        public Criteria andMontantDeOffreIsNotNull() {
            addCriterion("montant_de_offre is not null");
            return (Criteria) this;
        }

        public Criteria andMontantDeOffreEqualTo(String value) {
            addCriterion("montant_de_offre =", value, "montantDeOffre");
            return (Criteria) this;
        }

        public Criteria andMontantDeOffreNotEqualTo(String value) {
            addCriterion("montant_de_offre <>", value, "montantDeOffre");
            return (Criteria) this;
        }

        public Criteria andMontantDeOffreGreaterThan(String value) {
            addCriterion("montant_de_offre >", value, "montantDeOffre");
            return (Criteria) this;
        }

        public Criteria andMontantDeOffreGreaterThanOrEqualTo(String value) {
            addCriterion("montant_de_offre >=", value, "montantDeOffre");
            return (Criteria) this;
        }

        public Criteria andMontantDeOffreLessThan(String value) {
            addCriterion("montant_de_offre <", value, "montantDeOffre");
            return (Criteria) this;
        }

        public Criteria andMontantDeOffreLessThanOrEqualTo(String value) {
            addCriterion("montant_de_offre <=", value, "montantDeOffre");
            return (Criteria) this;
        }

        public Criteria andMontantDeOffreLike(String value) {
            addCriterion("montant_de_offre like", value, "montantDeOffre");
            return (Criteria) this;
        }

        public Criteria andMontantDeOffreNotLike(String value) {
            addCriterion("montant_de_offre not like", value, "montantDeOffre");
            return (Criteria) this;
        }

        public Criteria andMontantDeOffreIn(List<String> values) {
            addCriterion("montant_de_offre in", values, "montantDeOffre");
            return (Criteria) this;
        }

        public Criteria andMontantDeOffreNotIn(List<String> values) {
            addCriterion("montant_de_offre not in", values, "montantDeOffre");
            return (Criteria) this;
        }

        public Criteria andMontantDeOffreBetween(String value1, String value2) {
            addCriterion("montant_de_offre between", value1, value2, "montantDeOffre");
            return (Criteria) this;
        }

        public Criteria andMontantDeOffreNotBetween(String value1, String value2) {
            addCriterion("montant_de_offre not between", value1, value2, "montantDeOffre");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountIsNull() {
            addCriterion("investment_amount is null");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountIsNotNull() {
            addCriterion("investment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountEqualTo(String value) {
            addCriterion("investment_amount =", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountNotEqualTo(String value) {
            addCriterion("investment_amount <>", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountGreaterThan(String value) {
            addCriterion("investment_amount >", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountGreaterThanOrEqualTo(String value) {
            addCriterion("investment_amount >=", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountLessThan(String value) {
            addCriterion("investment_amount <", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountLessThanOrEqualTo(String value) {
            addCriterion("investment_amount <=", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountLike(String value) {
            addCriterion("investment_amount like", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountNotLike(String value) {
            addCriterion("investment_amount not like", value, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountIn(List<String> values) {
            addCriterion("investment_amount in", values, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountNotIn(List<String> values) {
            addCriterion("investment_amount not in", values, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountBetween(String value1, String value2) {
            addCriterion("investment_amount between", value1, value2, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andInvestmentAmountNotBetween(String value1, String value2) {
            addCriterion("investment_amount not between", value1, value2, "investmentAmount");
            return (Criteria) this;
        }

        public Criteria andProduitDureeDesIsNull() {
            addCriterion("produit_duree_des is null");
            return (Criteria) this;
        }

        public Criteria andProduitDureeDesIsNotNull() {
            addCriterion("produit_duree_des is not null");
            return (Criteria) this;
        }

        public Criteria andProduitDureeDesEqualTo(Integer value) {
            addCriterion("produit_duree_des =", value, "produitDureeDes");
            return (Criteria) this;
        }

        public Criteria andProduitDureeDesNotEqualTo(Integer value) {
            addCriterion("produit_duree_des <>", value, "produitDureeDes");
            return (Criteria) this;
        }

        public Criteria andProduitDureeDesGreaterThan(Integer value) {
            addCriterion("produit_duree_des >", value, "produitDureeDes");
            return (Criteria) this;
        }

        public Criteria andProduitDureeDesGreaterThanOrEqualTo(Integer value) {
            addCriterion("produit_duree_des >=", value, "produitDureeDes");
            return (Criteria) this;
        }

        public Criteria andProduitDureeDesLessThan(Integer value) {
            addCriterion("produit_duree_des <", value, "produitDureeDes");
            return (Criteria) this;
        }

        public Criteria andProduitDureeDesLessThanOrEqualTo(Integer value) {
            addCriterion("produit_duree_des <=", value, "produitDureeDes");
            return (Criteria) this;
        }

        public Criteria andProduitDureeDesIn(List<Integer> values) {
            addCriterion("produit_duree_des in", values, "produitDureeDes");
            return (Criteria) this;
        }

        public Criteria andProduitDureeDesNotIn(List<Integer> values) {
            addCriterion("produit_duree_des not in", values, "produitDureeDes");
            return (Criteria) this;
        }

        public Criteria andProduitDureeDesBetween(Integer value1, Integer value2) {
            addCriterion("produit_duree_des between", value1, value2, "produitDureeDes");
            return (Criteria) this;
        }

        public Criteria andProduitDureeDesNotBetween(Integer value1, Integer value2) {
            addCriterion("produit_duree_des not between", value1, value2, "produitDureeDes");
            return (Criteria) this;
        }

        public Criteria andProduitMarqueIsNull() {
            addCriterion("produit_marque is null");
            return (Criteria) this;
        }

        public Criteria andProduitMarqueIsNotNull() {
            addCriterion("produit_marque is not null");
            return (Criteria) this;
        }

        public Criteria andProduitMarqueEqualTo(Integer value) {
            addCriterion("produit_marque =", value, "produitMarque");
            return (Criteria) this;
        }

        public Criteria andProduitMarqueNotEqualTo(Integer value) {
            addCriterion("produit_marque <>", value, "produitMarque");
            return (Criteria) this;
        }

        public Criteria andProduitMarqueGreaterThan(Integer value) {
            addCriterion("produit_marque >", value, "produitMarque");
            return (Criteria) this;
        }

        public Criteria andProduitMarqueGreaterThanOrEqualTo(Integer value) {
            addCriterion("produit_marque >=", value, "produitMarque");
            return (Criteria) this;
        }

        public Criteria andProduitMarqueLessThan(Integer value) {
            addCriterion("produit_marque <", value, "produitMarque");
            return (Criteria) this;
        }

        public Criteria andProduitMarqueLessThanOrEqualTo(Integer value) {
            addCriterion("produit_marque <=", value, "produitMarque");
            return (Criteria) this;
        }

        public Criteria andProduitMarqueIn(List<Integer> values) {
            addCriterion("produit_marque in", values, "produitMarque");
            return (Criteria) this;
        }

        public Criteria andProduitMarqueNotIn(List<Integer> values) {
            addCriterion("produit_marque not in", values, "produitMarque");
            return (Criteria) this;
        }

        public Criteria andProduitMarqueBetween(Integer value1, Integer value2) {
            addCriterion("produit_marque between", value1, value2, "produitMarque");
            return (Criteria) this;
        }

        public Criteria andProduitMarqueNotBetween(Integer value1, Integer value2) {
            addCriterion("produit_marque not between", value1, value2, "produitMarque");
            return (Criteria) this;
        }

        public Criteria andRemboursementsExpiresIsNull() {
            addCriterion("remboursements_expires is null");
            return (Criteria) this;
        }

        public Criteria andRemboursementsExpiresIsNotNull() {
            addCriterion("remboursements_expires is not null");
            return (Criteria) this;
        }

        public Criteria andRemboursementsExpiresEqualTo(Integer value) {
            addCriterion("remboursements_expires =", value, "remboursementsExpires");
            return (Criteria) this;
        }

        public Criteria andRemboursementsExpiresNotEqualTo(Integer value) {
            addCriterion("remboursements_expires <>", value, "remboursementsExpires");
            return (Criteria) this;
        }

        public Criteria andRemboursementsExpiresGreaterThan(Integer value) {
            addCriterion("remboursements_expires >", value, "remboursementsExpires");
            return (Criteria) this;
        }

        public Criteria andRemboursementsExpiresGreaterThanOrEqualTo(Integer value) {
            addCriterion("remboursements_expires >=", value, "remboursementsExpires");
            return (Criteria) this;
        }

        public Criteria andRemboursementsExpiresLessThan(Integer value) {
            addCriterion("remboursements_expires <", value, "remboursementsExpires");
            return (Criteria) this;
        }

        public Criteria andRemboursementsExpiresLessThanOrEqualTo(Integer value) {
            addCriterion("remboursements_expires <=", value, "remboursementsExpires");
            return (Criteria) this;
        }

        public Criteria andRemboursementsExpiresIn(List<Integer> values) {
            addCriterion("remboursements_expires in", values, "remboursementsExpires");
            return (Criteria) this;
        }

        public Criteria andRemboursementsExpiresNotIn(List<Integer> values) {
            addCriterion("remboursements_expires not in", values, "remboursementsExpires");
            return (Criteria) this;
        }

        public Criteria andRemboursementsExpiresBetween(Integer value1, Integer value2) {
            addCriterion("remboursements_expires between", value1, value2, "remboursementsExpires");
            return (Criteria) this;
        }

        public Criteria andRemboursementsExpiresNotBetween(Integer value1, Integer value2) {
            addCriterion("remboursements_expires not between", value1, value2, "remboursementsExpires");
            return (Criteria) this;
        }

        public Criteria andRemboursementsGuiseIsNull() {
            addCriterion("remboursements_guise is null");
            return (Criteria) this;
        }

        public Criteria andRemboursementsGuiseIsNotNull() {
            addCriterion("remboursements_guise is not null");
            return (Criteria) this;
        }

        public Criteria andRemboursementsGuiseEqualTo(Integer value) {
            addCriterion("remboursements_guise =", value, "remboursementsGuise");
            return (Criteria) this;
        }

        public Criteria andRemboursementsGuiseNotEqualTo(Integer value) {
            addCriterion("remboursements_guise <>", value, "remboursementsGuise");
            return (Criteria) this;
        }

        public Criteria andRemboursementsGuiseGreaterThan(Integer value) {
            addCriterion("remboursements_guise >", value, "remboursementsGuise");
            return (Criteria) this;
        }

        public Criteria andRemboursementsGuiseGreaterThanOrEqualTo(Integer value) {
            addCriterion("remboursements_guise >=", value, "remboursementsGuise");
            return (Criteria) this;
        }

        public Criteria andRemboursementsGuiseLessThan(Integer value) {
            addCriterion("remboursements_guise <", value, "remboursementsGuise");
            return (Criteria) this;
        }

        public Criteria andRemboursementsGuiseLessThanOrEqualTo(Integer value) {
            addCriterion("remboursements_guise <=", value, "remboursementsGuise");
            return (Criteria) this;
        }

        public Criteria andRemboursementsGuiseIn(List<Integer> values) {
            addCriterion("remboursements_guise in", values, "remboursementsGuise");
            return (Criteria) this;
        }

        public Criteria andRemboursementsGuiseNotIn(List<Integer> values) {
            addCriterion("remboursements_guise not in", values, "remboursementsGuise");
            return (Criteria) this;
        }

        public Criteria andRemboursementsGuiseBetween(Integer value1, Integer value2) {
            addCriterion("remboursements_guise between", value1, value2, "remboursementsGuise");
            return (Criteria) this;
        }

        public Criteria andRemboursementsGuiseNotBetween(Integer value1, Integer value2) {
            addCriterion("remboursements_guise not between", value1, value2, "remboursementsGuise");
            return (Criteria) this;
        }

        public Criteria andIsConditionIsNull() {
            addCriterion("is_condition is null");
            return (Criteria) this;
        }

        public Criteria andIsConditionIsNotNull() {
            addCriterion("is_condition is not null");
            return (Criteria) this;
        }

        public Criteria andIsConditionEqualTo(Integer value) {
            addCriterion("is_condition =", value, "isCondition");
            return (Criteria) this;
        }

        public Criteria andIsConditionNotEqualTo(Integer value) {
            addCriterion("is_condition <>", value, "isCondition");
            return (Criteria) this;
        }

        public Criteria andIsConditionGreaterThan(Integer value) {
            addCriterion("is_condition >", value, "isCondition");
            return (Criteria) this;
        }

        public Criteria andIsConditionGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_condition >=", value, "isCondition");
            return (Criteria) this;
        }

        public Criteria andIsConditionLessThan(Integer value) {
            addCriterion("is_condition <", value, "isCondition");
            return (Criteria) this;
        }

        public Criteria andIsConditionLessThanOrEqualTo(Integer value) {
            addCriterion("is_condition <=", value, "isCondition");
            return (Criteria) this;
        }

        public Criteria andIsConditionIn(List<Integer> values) {
            addCriterion("is_condition in", values, "isCondition");
            return (Criteria) this;
        }

        public Criteria andIsConditionNotIn(List<Integer> values) {
            addCriterion("is_condition not in", values, "isCondition");
            return (Criteria) this;
        }

        public Criteria andIsConditionBetween(Integer value1, Integer value2) {
            addCriterion("is_condition between", value1, value2, "isCondition");
            return (Criteria) this;
        }

        public Criteria andIsConditionNotBetween(Integer value1, Integer value2) {
            addCriterion("is_condition not between", value1, value2, "isCondition");
            return (Criteria) this;
        }

        public Criteria andDateDeValeurIsNull() {
            addCriterion("date_de_valeur is null");
            return (Criteria) this;
        }

        public Criteria andDateDeValeurIsNotNull() {
            addCriterion("date_de_valeur is not null");
            return (Criteria) this;
        }

        public Criteria andDateDeValeurEqualTo(Date value) {
            addCriterion("date_de_valeur =", value, "dateDeValeur");
            return (Criteria) this;
        }

        public Criteria andDateDeValeurNotEqualTo(Date value) {
            addCriterion("date_de_valeur <>", value, "dateDeValeur");
            return (Criteria) this;
        }

        public Criteria andDateDeValeurGreaterThan(Date value) {
            addCriterion("date_de_valeur >", value, "dateDeValeur");
            return (Criteria) this;
        }

        public Criteria andDateDeValeurGreaterThanOrEqualTo(Date value) {
            addCriterion("date_de_valeur >=", value, "dateDeValeur");
            return (Criteria) this;
        }

        public Criteria andDateDeValeurLessThan(Date value) {
            addCriterion("date_de_valeur <", value, "dateDeValeur");
            return (Criteria) this;
        }

        public Criteria andDateDeValeurLessThanOrEqualTo(Date value) {
            addCriterion("date_de_valeur <=", value, "dateDeValeur");
            return (Criteria) this;
        }

        public Criteria andDateDeValeurIn(List<Date> values) {
            addCriterion("date_de_valeur in", values, "dateDeValeur");
            return (Criteria) this;
        }

        public Criteria andDateDeValeurNotIn(List<Date> values) {
            addCriterion("date_de_valeur not in", values, "dateDeValeur");
            return (Criteria) this;
        }

        public Criteria andDateDeValeurBetween(Date value1, Date value2) {
            addCriterion("date_de_valeur between", value1, value2, "dateDeValeur");
            return (Criteria) this;
        }

        public Criteria andDateDeValeurNotBetween(Date value1, Date value2) {
            addCriterion("date_de_valeur not between", value1, value2, "dateDeValeur");
            return (Criteria) this;
        }

        public Criteria andNatureDuSujetIsNull() {
            addCriterion("nature_du_sujet is null");
            return (Criteria) this;
        }

        public Criteria andNatureDuSujetIsNotNull() {
            addCriterion("nature_du_sujet is not null");
            return (Criteria) this;
        }

        public Criteria andNatureDuSujetEqualTo(String value) {
            addCriterion("nature_du_sujet =", value, "natureDuSujet");
            return (Criteria) this;
        }

        public Criteria andNatureDuSujetNotEqualTo(String value) {
            addCriterion("nature_du_sujet <>", value, "natureDuSujet");
            return (Criteria) this;
        }

        public Criteria andNatureDuSujetGreaterThan(String value) {
            addCriterion("nature_du_sujet >", value, "natureDuSujet");
            return (Criteria) this;
        }

        public Criteria andNatureDuSujetGreaterThanOrEqualTo(String value) {
            addCriterion("nature_du_sujet >=", value, "natureDuSujet");
            return (Criteria) this;
        }

        public Criteria andNatureDuSujetLessThan(String value) {
            addCriterion("nature_du_sujet <", value, "natureDuSujet");
            return (Criteria) this;
        }

        public Criteria andNatureDuSujetLessThanOrEqualTo(String value) {
            addCriterion("nature_du_sujet <=", value, "natureDuSujet");
            return (Criteria) this;
        }

        public Criteria andNatureDuSujetLike(String value) {
            addCriterion("nature_du_sujet like", value, "natureDuSujet");
            return (Criteria) this;
        }

        public Criteria andNatureDuSujetNotLike(String value) {
            addCriterion("nature_du_sujet not like", value, "natureDuSujet");
            return (Criteria) this;
        }

        public Criteria andNatureDuSujetIn(List<String> values) {
            addCriterion("nature_du_sujet in", values, "natureDuSujet");
            return (Criteria) this;
        }

        public Criteria andNatureDuSujetNotIn(List<String> values) {
            addCriterion("nature_du_sujet not in", values, "natureDuSujet");
            return (Criteria) this;
        }

        public Criteria andNatureDuSujetBetween(String value1, String value2) {
            addCriterion("nature_du_sujet between", value1, value2, "natureDuSujet");
            return (Criteria) this;
        }

        public Criteria andNatureDuSujetNotBetween(String value1, String value2) {
            addCriterion("nature_du_sujet not between", value1, value2, "natureDuSujet");
            return (Criteria) this;
        }

        public Criteria andSecteurActiviteIsNull() {
            addCriterion("secteur_activite is null");
            return (Criteria) this;
        }

        public Criteria andSecteurActiviteIsNotNull() {
            addCriterion("secteur_activite is not null");
            return (Criteria) this;
        }

        public Criteria andSecteurActiviteEqualTo(String value) {
            addCriterion("secteur_activite =", value, "secteurActivite");
            return (Criteria) this;
        }

        public Criteria andSecteurActiviteNotEqualTo(String value) {
            addCriterion("secteur_activite <>", value, "secteurActivite");
            return (Criteria) this;
        }

        public Criteria andSecteurActiviteGreaterThan(String value) {
            addCriterion("secteur_activite >", value, "secteurActivite");
            return (Criteria) this;
        }

        public Criteria andSecteurActiviteGreaterThanOrEqualTo(String value) {
            addCriterion("secteur_activite >=", value, "secteurActivite");
            return (Criteria) this;
        }

        public Criteria andSecteurActiviteLessThan(String value) {
            addCriterion("secteur_activite <", value, "secteurActivite");
            return (Criteria) this;
        }

        public Criteria andSecteurActiviteLessThanOrEqualTo(String value) {
            addCriterion("secteur_activite <=", value, "secteurActivite");
            return (Criteria) this;
        }

        public Criteria andSecteurActiviteLike(String value) {
            addCriterion("secteur_activite like", value, "secteurActivite");
            return (Criteria) this;
        }

        public Criteria andSecteurActiviteNotLike(String value) {
            addCriterion("secteur_activite not like", value, "secteurActivite");
            return (Criteria) this;
        }

        public Criteria andSecteurActiviteIn(List<String> values) {
            addCriterion("secteur_activite in", values, "secteurActivite");
            return (Criteria) this;
        }

        public Criteria andSecteurActiviteNotIn(List<String> values) {
            addCriterion("secteur_activite not in", values, "secteurActivite");
            return (Criteria) this;
        }

        public Criteria andSecteurActiviteBetween(String value1, String value2) {
            addCriterion("secteur_activite between", value1, value2, "secteurActivite");
            return (Criteria) this;
        }

        public Criteria andSecteurActiviteNotBetween(String value1, String value2) {
            addCriterion("secteur_activite not between", value1, value2, "secteurActivite");
            return (Criteria) this;
        }

        public Criteria andRevenuAnnuelIsNull() {
            addCriterion("revenu_annuel is null");
            return (Criteria) this;
        }

        public Criteria andRevenuAnnuelIsNotNull() {
            addCriterion("revenu_annuel is not null");
            return (Criteria) this;
        }

        public Criteria andRevenuAnnuelEqualTo(String value) {
            addCriterion("revenu_annuel =", value, "revenuAnnuel");
            return (Criteria) this;
        }

        public Criteria andRevenuAnnuelNotEqualTo(String value) {
            addCriterion("revenu_annuel <>", value, "revenuAnnuel");
            return (Criteria) this;
        }

        public Criteria andRevenuAnnuelGreaterThan(String value) {
            addCriterion("revenu_annuel >", value, "revenuAnnuel");
            return (Criteria) this;
        }

        public Criteria andRevenuAnnuelGreaterThanOrEqualTo(String value) {
            addCriterion("revenu_annuel >=", value, "revenuAnnuel");
            return (Criteria) this;
        }

        public Criteria andRevenuAnnuelLessThan(String value) {
            addCriterion("revenu_annuel <", value, "revenuAnnuel");
            return (Criteria) this;
        }

        public Criteria andRevenuAnnuelLessThanOrEqualTo(String value) {
            addCriterion("revenu_annuel <=", value, "revenuAnnuel");
            return (Criteria) this;
        }

        public Criteria andRevenuAnnuelLike(String value) {
            addCriterion("revenu_annuel like", value, "revenuAnnuel");
            return (Criteria) this;
        }

        public Criteria andRevenuAnnuelNotLike(String value) {
            addCriterion("revenu_annuel not like", value, "revenuAnnuel");
            return (Criteria) this;
        }

        public Criteria andRevenuAnnuelIn(List<String> values) {
            addCriterion("revenu_annuel in", values, "revenuAnnuel");
            return (Criteria) this;
        }

        public Criteria andRevenuAnnuelNotIn(List<String> values) {
            addCriterion("revenu_annuel not in", values, "revenuAnnuel");
            return (Criteria) this;
        }

        public Criteria andRevenuAnnuelBetween(String value1, String value2) {
            addCriterion("revenu_annuel between", value1, value2, "revenuAnnuel");
            return (Criteria) this;
        }

        public Criteria andRevenuAnnuelNotBetween(String value1, String value2) {
            addCriterion("revenu_annuel not between", value1, value2, "revenuAnnuel");
            return (Criteria) this;
        }

        public Criteria andCreditFruitIsNull() {
            addCriterion("credit_fruit is null");
            return (Criteria) this;
        }

        public Criteria andCreditFruitIsNotNull() {
            addCriterion("credit_fruit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditFruitEqualTo(String value) {
            addCriterion("credit_fruit =", value, "creditFruit");
            return (Criteria) this;
        }

        public Criteria andCreditFruitNotEqualTo(String value) {
            addCriterion("credit_fruit <>", value, "creditFruit");
            return (Criteria) this;
        }

        public Criteria andCreditFruitGreaterThan(String value) {
            addCriterion("credit_fruit >", value, "creditFruit");
            return (Criteria) this;
        }

        public Criteria andCreditFruitGreaterThanOrEqualTo(String value) {
            addCriterion("credit_fruit >=", value, "creditFruit");
            return (Criteria) this;
        }

        public Criteria andCreditFruitLessThan(String value) {
            addCriterion("credit_fruit <", value, "creditFruit");
            return (Criteria) this;
        }

        public Criteria andCreditFruitLessThanOrEqualTo(String value) {
            addCriterion("credit_fruit <=", value, "creditFruit");
            return (Criteria) this;
        }

        public Criteria andCreditFruitLike(String value) {
            addCriterion("credit_fruit like", value, "creditFruit");
            return (Criteria) this;
        }

        public Criteria andCreditFruitNotLike(String value) {
            addCriterion("credit_fruit not like", value, "creditFruit");
            return (Criteria) this;
        }

        public Criteria andCreditFruitIn(List<String> values) {
            addCriterion("credit_fruit in", values, "creditFruit");
            return (Criteria) this;
        }

        public Criteria andCreditFruitNotIn(List<String> values) {
            addCriterion("credit_fruit not in", values, "creditFruit");
            return (Criteria) this;
        }

        public Criteria andCreditFruitBetween(String value1, String value2) {
            addCriterion("credit_fruit between", value1, value2, "creditFruit");
            return (Criteria) this;
        }

        public Criteria andCreditFruitNotBetween(String value1, String value2) {
            addCriterion("credit_fruit not between", value1, value2, "creditFruit");
            return (Criteria) this;
        }

        public Criteria andTotalEngagementsIsNull() {
            addCriterion("total_engagements is null");
            return (Criteria) this;
        }

        public Criteria andTotalEngagementsIsNotNull() {
            addCriterion("total_engagements is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEngagementsEqualTo(String value) {
            addCriterion("total_engagements =", value, "totalEngagements");
            return (Criteria) this;
        }

        public Criteria andTotalEngagementsNotEqualTo(String value) {
            addCriterion("total_engagements <>", value, "totalEngagements");
            return (Criteria) this;
        }

        public Criteria andTotalEngagementsGreaterThan(String value) {
            addCriterion("total_engagements >", value, "totalEngagements");
            return (Criteria) this;
        }

        public Criteria andTotalEngagementsGreaterThanOrEqualTo(String value) {
            addCriterion("total_engagements >=", value, "totalEngagements");
            return (Criteria) this;
        }

        public Criteria andTotalEngagementsLessThan(String value) {
            addCriterion("total_engagements <", value, "totalEngagements");
            return (Criteria) this;
        }

        public Criteria andTotalEngagementsLessThanOrEqualTo(String value) {
            addCriterion("total_engagements <=", value, "totalEngagements");
            return (Criteria) this;
        }

        public Criteria andTotalEngagementsLike(String value) {
            addCriterion("total_engagements like", value, "totalEngagements");
            return (Criteria) this;
        }

        public Criteria andTotalEngagementsNotLike(String value) {
            addCriterion("total_engagements not like", value, "totalEngagements");
            return (Criteria) this;
        }

        public Criteria andTotalEngagementsIn(List<String> values) {
            addCriterion("total_engagements in", values, "totalEngagements");
            return (Criteria) this;
        }

        public Criteria andTotalEngagementsNotIn(List<String> values) {
            addCriterion("total_engagements not in", values, "totalEngagements");
            return (Criteria) this;
        }

        public Criteria andTotalEngagementsBetween(String value1, String value2) {
            addCriterion("total_engagements between", value1, value2, "totalEngagements");
            return (Criteria) this;
        }

        public Criteria andTotalEngagementsNotBetween(String value1, String value2) {
            addCriterion("total_engagements not between", value1, value2, "totalEngagements");
            return (Criteria) this;
        }

        public Criteria andAutresEmpruntsIsNull() {
            addCriterion("autres_emprunts is null");
            return (Criteria) this;
        }

        public Criteria andAutresEmpruntsIsNotNull() {
            addCriterion("autres_emprunts is not null");
            return (Criteria) this;
        }

        public Criteria andAutresEmpruntsEqualTo(String value) {
            addCriterion("autres_emprunts =", value, "autresEmprunts");
            return (Criteria) this;
        }

        public Criteria andAutresEmpruntsNotEqualTo(String value) {
            addCriterion("autres_emprunts <>", value, "autresEmprunts");
            return (Criteria) this;
        }

        public Criteria andAutresEmpruntsGreaterThan(String value) {
            addCriterion("autres_emprunts >", value, "autresEmprunts");
            return (Criteria) this;
        }

        public Criteria andAutresEmpruntsGreaterThanOrEqualTo(String value) {
            addCriterion("autres_emprunts >=", value, "autresEmprunts");
            return (Criteria) this;
        }

        public Criteria andAutresEmpruntsLessThan(String value) {
            addCriterion("autres_emprunts <", value, "autresEmprunts");
            return (Criteria) this;
        }

        public Criteria andAutresEmpruntsLessThanOrEqualTo(String value) {
            addCriterion("autres_emprunts <=", value, "autresEmprunts");
            return (Criteria) this;
        }

        public Criteria andAutresEmpruntsLike(String value) {
            addCriterion("autres_emprunts like", value, "autresEmprunts");
            return (Criteria) this;
        }

        public Criteria andAutresEmpruntsNotLike(String value) {
            addCriterion("autres_emprunts not like", value, "autresEmprunts");
            return (Criteria) this;
        }

        public Criteria andAutresEmpruntsIn(List<String> values) {
            addCriterion("autres_emprunts in", values, "autresEmprunts");
            return (Criteria) this;
        }

        public Criteria andAutresEmpruntsNotIn(List<String> values) {
            addCriterion("autres_emprunts not in", values, "autresEmprunts");
            return (Criteria) this;
        }

        public Criteria andAutresEmpruntsBetween(String value1, String value2) {
            addCriterion("autres_emprunts between", value1, value2, "autresEmprunts");
            return (Criteria) this;
        }

        public Criteria andAutresEmpruntsNotBetween(String value1, String value2) {
            addCriterion("autres_emprunts not between", value1, value2, "autresEmprunts");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andIsConsentIsNull() {
            addCriterion("is_consent is null");
            return (Criteria) this;
        }

        public Criteria andIsConsentIsNotNull() {
            addCriterion("is_consent is not null");
            return (Criteria) this;
        }

        public Criteria andIsConsentEqualTo(Integer value) {
            addCriterion("is_consent =", value, "isConsent");
            return (Criteria) this;
        }

        public Criteria andIsConsentNotEqualTo(Integer value) {
            addCriterion("is_consent <>", value, "isConsent");
            return (Criteria) this;
        }

        public Criteria andIsConsentGreaterThan(Integer value) {
            addCriterion("is_consent >", value, "isConsent");
            return (Criteria) this;
        }

        public Criteria andIsConsentGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_consent >=", value, "isConsent");
            return (Criteria) this;
        }

        public Criteria andIsConsentLessThan(Integer value) {
            addCriterion("is_consent <", value, "isConsent");
            return (Criteria) this;
        }

        public Criteria andIsConsentLessThanOrEqualTo(Integer value) {
            addCriterion("is_consent <=", value, "isConsent");
            return (Criteria) this;
        }

        public Criteria andIsConsentIn(List<Integer> values) {
            addCriterion("is_consent in", values, "isConsent");
            return (Criteria) this;
        }

        public Criteria andIsConsentNotIn(List<Integer> values) {
            addCriterion("is_consent not in", values, "isConsent");
            return (Criteria) this;
        }

        public Criteria andIsConsentBetween(Integer value1, Integer value2) {
            addCriterion("is_consent between", value1, value2, "isConsent");
            return (Criteria) this;
        }

        public Criteria andIsConsentNotBetween(Integer value1, Integer value2) {
            addCriterion("is_consent not between", value1, value2, "isConsent");
            return (Criteria) this;
        }

        public Criteria andYearInterestRateIsNull() {
            addCriterion("year_interest_rate is null");
            return (Criteria) this;
        }

        public Criteria andYearInterestRateIsNotNull() {
            addCriterion("year_interest_rate is not null");
            return (Criteria) this;
        }

        public Criteria andYearInterestRateEqualTo(String value) {
            addCriterion("year_interest_rate =", value, "yearInterestRate");
            return (Criteria) this;
        }

        public Criteria andYearInterestRateNotEqualTo(String value) {
            addCriterion("year_interest_rate <>", value, "yearInterestRate");
            return (Criteria) this;
        }

        public Criteria andYearInterestRateGreaterThan(String value) {
            addCriterion("year_interest_rate >", value, "yearInterestRate");
            return (Criteria) this;
        }

        public Criteria andYearInterestRateGreaterThanOrEqualTo(String value) {
            addCriterion("year_interest_rate >=", value, "yearInterestRate");
            return (Criteria) this;
        }

        public Criteria andYearInterestRateLessThan(String value) {
            addCriterion("year_interest_rate <", value, "yearInterestRate");
            return (Criteria) this;
        }

        public Criteria andYearInterestRateLessThanOrEqualTo(String value) {
            addCriterion("year_interest_rate <=", value, "yearInterestRate");
            return (Criteria) this;
        }

        public Criteria andYearInterestRateLike(String value) {
            addCriterion("year_interest_rate like", value, "yearInterestRate");
            return (Criteria) this;
        }

        public Criteria andYearInterestRateNotLike(String value) {
            addCriterion("year_interest_rate not like", value, "yearInterestRate");
            return (Criteria) this;
        }

        public Criteria andYearInterestRateIn(List<String> values) {
            addCriterion("year_interest_rate in", values, "yearInterestRate");
            return (Criteria) this;
        }

        public Criteria andYearInterestRateNotIn(List<String> values) {
            addCriterion("year_interest_rate not in", values, "yearInterestRate");
            return (Criteria) this;
        }

        public Criteria andYearInterestRateBetween(String value1, String value2) {
            addCriterion("year_interest_rate between", value1, value2, "yearInterestRate");
            return (Criteria) this;
        }

        public Criteria andYearInterestRateNotBetween(String value1, String value2) {
            addCriterion("year_interest_rate not between", value1, value2, "yearInterestRate");
            return (Criteria) this;
        }

        public Criteria andHaveNotPrincipaInterestIsNull() {
            addCriterion("have_not_principa_interest is null");
            return (Criteria) this;
        }

        public Criteria andHaveNotPrincipaInterestIsNotNull() {
            addCriterion("have_not_principa_interest is not null");
            return (Criteria) this;
        }

        public Criteria andHaveNotPrincipaInterestEqualTo(String value) {
            addCriterion("have_not_principa_interest =", value, "haveNotPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andHaveNotPrincipaInterestNotEqualTo(String value) {
            addCriterion("have_not_principa_interest <>", value, "haveNotPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andHaveNotPrincipaInterestGreaterThan(String value) {
            addCriterion("have_not_principa_interest >", value, "haveNotPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andHaveNotPrincipaInterestGreaterThanOrEqualTo(String value) {
            addCriterion("have_not_principa_interest >=", value, "haveNotPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andHaveNotPrincipaInterestLessThan(String value) {
            addCriterion("have_not_principa_interest <", value, "haveNotPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andHaveNotPrincipaInterestLessThanOrEqualTo(String value) {
            addCriterion("have_not_principa_interest <=", value, "haveNotPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andHaveNotPrincipaInterestLike(String value) {
            addCriterion("have_not_principa_interest like", value, "haveNotPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andHaveNotPrincipaInterestNotLike(String value) {
            addCriterion("have_not_principa_interest not like", value, "haveNotPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andHaveNotPrincipaInterestIn(List<String> values) {
            addCriterion("have_not_principa_interest in", values, "haveNotPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andHaveNotPrincipaInterestNotIn(List<String> values) {
            addCriterion("have_not_principa_interest not in", values, "haveNotPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andHaveNotPrincipaInterestBetween(String value1, String value2) {
            addCriterion("have_not_principa_interest between", value1, value2, "haveNotPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andHaveNotPrincipaInterestNotBetween(String value1, String value2) {
            addCriterion("have_not_principa_interest not between", value1, value2, "haveNotPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andHasAlsoPrincipaInterestIsNull() {
            addCriterion("has_also_principa_interest is null");
            return (Criteria) this;
        }

        public Criteria andHasAlsoPrincipaInterestIsNotNull() {
            addCriterion("has_also_principa_interest is not null");
            return (Criteria) this;
        }

        public Criteria andHasAlsoPrincipaInterestEqualTo(String value) {
            addCriterion("has_also_principa_interest =", value, "hasAlsoPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andHasAlsoPrincipaInterestNotEqualTo(String value) {
            addCriterion("has_also_principa_interest <>", value, "hasAlsoPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andHasAlsoPrincipaInterestGreaterThan(String value) {
            addCriterion("has_also_principa_interest >", value, "hasAlsoPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andHasAlsoPrincipaInterestGreaterThanOrEqualTo(String value) {
            addCriterion("has_also_principa_interest >=", value, "hasAlsoPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andHasAlsoPrincipaInterestLessThan(String value) {
            addCriterion("has_also_principa_interest <", value, "hasAlsoPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andHasAlsoPrincipaInterestLessThanOrEqualTo(String value) {
            addCriterion("has_also_principa_interest <=", value, "hasAlsoPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andHasAlsoPrincipaInterestLike(String value) {
            addCriterion("has_also_principa_interest like", value, "hasAlsoPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andHasAlsoPrincipaInterestNotLike(String value) {
            addCriterion("has_also_principa_interest not like", value, "hasAlsoPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andHasAlsoPrincipaInterestIn(List<String> values) {
            addCriterion("has_also_principa_interest in", values, "hasAlsoPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andHasAlsoPrincipaInterestNotIn(List<String> values) {
            addCriterion("has_also_principa_interest not in", values, "hasAlsoPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andHasAlsoPrincipaInterestBetween(String value1, String value2) {
            addCriterion("has_also_principa_interest between", value1, value2, "hasAlsoPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andHasAlsoPrincipaInterestNotBetween(String value1, String value2) {
            addCriterion("has_also_principa_interest not between", value1, value2, "hasAlsoPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andShouldCallPrincipaInterestIsNull() {
            addCriterion("should_call_principa_interest is null");
            return (Criteria) this;
        }

        public Criteria andShouldCallPrincipaInterestIsNotNull() {
            addCriterion("should_call_principa_interest is not null");
            return (Criteria) this;
        }

        public Criteria andShouldCallPrincipaInterestEqualTo(String value) {
            addCriterion("should_call_principa_interest =", value, "shouldCallPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andShouldCallPrincipaInterestNotEqualTo(String value) {
            addCriterion("should_call_principa_interest <>", value, "shouldCallPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andShouldCallPrincipaInterestGreaterThan(String value) {
            addCriterion("should_call_principa_interest >", value, "shouldCallPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andShouldCallPrincipaInterestGreaterThanOrEqualTo(String value) {
            addCriterion("should_call_principa_interest >=", value, "shouldCallPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andShouldCallPrincipaInterestLessThan(String value) {
            addCriterion("should_call_principa_interest <", value, "shouldCallPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andShouldCallPrincipaInterestLessThanOrEqualTo(String value) {
            addCriterion("should_call_principa_interest <=", value, "shouldCallPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andShouldCallPrincipaInterestLike(String value) {
            addCriterion("should_call_principa_interest like", value, "shouldCallPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andShouldCallPrincipaInterestNotLike(String value) {
            addCriterion("should_call_principa_interest not like", value, "shouldCallPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andShouldCallPrincipaInterestIn(List<String> values) {
            addCriterion("should_call_principa_interest in", values, "shouldCallPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andShouldCallPrincipaInterestNotIn(List<String> values) {
            addCriterion("should_call_principa_interest not in", values, "shouldCallPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andShouldCallPrincipaInterestBetween(String value1, String value2) {
            addCriterion("should_call_principa_interest between", value1, value2, "shouldCallPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andShouldCallPrincipaInterestNotBetween(String value1, String value2) {
            addCriterion("should_call_principa_interest not between", value1, value2, "shouldCallPrincipaInterest");
            return (Criteria) this;
        }

        public Criteria andBorrowingTitleIsNull() {
            addCriterion("borrowing_title is null");
            return (Criteria) this;
        }

        public Criteria andBorrowingTitleIsNotNull() {
            addCriterion("borrowing_title is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowingTitleEqualTo(String value) {
            addCriterion("borrowing_title =", value, "borrowingTitle");
            return (Criteria) this;
        }

        public Criteria andBorrowingTitleNotEqualTo(String value) {
            addCriterion("borrowing_title <>", value, "borrowingTitle");
            return (Criteria) this;
        }

        public Criteria andBorrowingTitleGreaterThan(String value) {
            addCriterion("borrowing_title >", value, "borrowingTitle");
            return (Criteria) this;
        }

        public Criteria andBorrowingTitleGreaterThanOrEqualTo(String value) {
            addCriterion("borrowing_title >=", value, "borrowingTitle");
            return (Criteria) this;
        }

        public Criteria andBorrowingTitleLessThan(String value) {
            addCriterion("borrowing_title <", value, "borrowingTitle");
            return (Criteria) this;
        }

        public Criteria andBorrowingTitleLessThanOrEqualTo(String value) {
            addCriterion("borrowing_title <=", value, "borrowingTitle");
            return (Criteria) this;
        }

        public Criteria andBorrowingTitleLike(String value) {
            addCriterion("borrowing_title like", value, "borrowingTitle");
            return (Criteria) this;
        }

        public Criteria andBorrowingTitleNotLike(String value) {
            addCriterion("borrowing_title not like", value, "borrowingTitle");
            return (Criteria) this;
        }

        public Criteria andBorrowingTitleIn(List<String> values) {
            addCriterion("borrowing_title in", values, "borrowingTitle");
            return (Criteria) this;
        }

        public Criteria andBorrowingTitleNotIn(List<String> values) {
            addCriterion("borrowing_title not in", values, "borrowingTitle");
            return (Criteria) this;
        }

        public Criteria andBorrowingTitleBetween(String value1, String value2) {
            addCriterion("borrowing_title between", value1, value2, "borrowingTitle");
            return (Criteria) this;
        }

        public Criteria andBorrowingTitleNotBetween(String value1, String value2) {
            addCriterion("borrowing_title not between", value1, value2, "borrowingTitle");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIsNull() {
            addCriterion("release_time is null");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIsNotNull() {
            addCriterion("release_time is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeEqualTo(Date value) {
            addCriterion("release_time =", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotEqualTo(Date value) {
            addCriterion("release_time <>", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeGreaterThan(Date value) {
            addCriterion("release_time >", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("release_time >=", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLessThan(Date value) {
            addCriterion("release_time <", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeLessThanOrEqualTo(Date value) {
            addCriterion("release_time <=", value, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeIn(List<Date> values) {
            addCriterion("release_time in", values, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotIn(List<Date> values) {
            addCriterion("release_time not in", values, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeBetween(Date value1, Date value2) {
            addCriterion("release_time between", value1, value2, "releaseTime");
            return (Criteria) this;
        }

        public Criteria andReleaseTimeNotBetween(Date value1, Date value2) {
            addCriterion("release_time not between", value1, value2, "releaseTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}