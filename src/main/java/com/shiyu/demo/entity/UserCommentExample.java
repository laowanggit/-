package com.shiyu.demo.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserCommentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public UserCommentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andShopidIsNull() {
            addCriterion("shopid is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("shopid is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(Integer value) {
            addCriterion("shopid =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(Integer value) {
            addCriterion("shopid <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(Integer value) {
            addCriterion("shopid >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopid >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(Integer value) {
            addCriterion("shopid <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(Integer value) {
            addCriterion("shopid <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<Integer> values) {
            addCriterion("shopid in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<Integer> values) {
            addCriterion("shopid not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(Integer value1, Integer value2) {
            addCriterion("shopid between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(Integer value1, Integer value2) {
            addCriterion("shopid not between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Integer value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Integer value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Integer value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Integer value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Integer value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Integer> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Integer> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Integer value1, Integer value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andFlavorIsNull() {
            addCriterion("flavor is null");
            return (Criteria) this;
        }

        public Criteria andFlavorIsNotNull() {
            addCriterion("flavor is not null");
            return (Criteria) this;
        }

        public Criteria andFlavorEqualTo(Integer value) {
            addCriterion("flavor =", value, "flavor");
            return (Criteria) this;
        }

        public Criteria andFlavorNotEqualTo(Integer value) {
            addCriterion("flavor <>", value, "flavor");
            return (Criteria) this;
        }

        public Criteria andFlavorGreaterThan(Integer value) {
            addCriterion("flavor >", value, "flavor");
            return (Criteria) this;
        }

        public Criteria andFlavorGreaterThanOrEqualTo(Integer value) {
            addCriterion("flavor >=", value, "flavor");
            return (Criteria) this;
        }

        public Criteria andFlavorLessThan(Integer value) {
            addCriterion("flavor <", value, "flavor");
            return (Criteria) this;
        }

        public Criteria andFlavorLessThanOrEqualTo(Integer value) {
            addCriterion("flavor <=", value, "flavor");
            return (Criteria) this;
        }

        public Criteria andFlavorIn(List<Integer> values) {
            addCriterion("flavor in", values, "flavor");
            return (Criteria) this;
        }

        public Criteria andFlavorNotIn(List<Integer> values) {
            addCriterion("flavor not in", values, "flavor");
            return (Criteria) this;
        }

        public Criteria andFlavorBetween(Integer value1, Integer value2) {
            addCriterion("flavor between", value1, value2, "flavor");
            return (Criteria) this;
        }

        public Criteria andFlavorNotBetween(Integer value1, Integer value2) {
            addCriterion("flavor not between", value1, value2, "flavor");
            return (Criteria) this;
        }

        public Criteria andServiceIsNull() {
            addCriterion("service is null");
            return (Criteria) this;
        }

        public Criteria andServiceIsNotNull() {
            addCriterion("service is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEqualTo(Integer value) {
            addCriterion("service =", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotEqualTo(Integer value) {
            addCriterion("service <>", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThan(Integer value) {
            addCriterion("service >", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("service >=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThan(Integer value) {
            addCriterion("service <", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceLessThanOrEqualTo(Integer value) {
            addCriterion("service <=", value, "service");
            return (Criteria) this;
        }

        public Criteria andServiceIn(List<Integer> values) {
            addCriterion("service in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotIn(List<Integer> values) {
            addCriterion("service not in", values, "service");
            return (Criteria) this;
        }

        public Criteria andServiceBetween(Integer value1, Integer value2) {
            addCriterion("service between", value1, value2, "service");
            return (Criteria) this;
        }

        public Criteria andServiceNotBetween(Integer value1, Integer value2) {
            addCriterion("service not between", value1, value2, "service");
            return (Criteria) this;
        }

        public Criteria andEnviormentIsNull() {
            addCriterion("enviorment is null");
            return (Criteria) this;
        }

        public Criteria andEnviormentIsNotNull() {
            addCriterion("enviorment is not null");
            return (Criteria) this;
        }

        public Criteria andEnviormentEqualTo(Integer value) {
            addCriterion("enviorment =", value, "enviorment");
            return (Criteria) this;
        }

        public Criteria andEnviormentNotEqualTo(Integer value) {
            addCriterion("enviorment <>", value, "enviorment");
            return (Criteria) this;
        }

        public Criteria andEnviormentGreaterThan(Integer value) {
            addCriterion("enviorment >", value, "enviorment");
            return (Criteria) this;
        }

        public Criteria andEnviormentGreaterThanOrEqualTo(Integer value) {
            addCriterion("enviorment >=", value, "enviorment");
            return (Criteria) this;
        }

        public Criteria andEnviormentLessThan(Integer value) {
            addCriterion("enviorment <", value, "enviorment");
            return (Criteria) this;
        }

        public Criteria andEnviormentLessThanOrEqualTo(Integer value) {
            addCriterion("enviorment <=", value, "enviorment");
            return (Criteria) this;
        }

        public Criteria andEnviormentIn(List<Integer> values) {
            addCriterion("enviorment in", values, "enviorment");
            return (Criteria) this;
        }

        public Criteria andEnviormentNotIn(List<Integer> values) {
            addCriterion("enviorment not in", values, "enviorment");
            return (Criteria) this;
        }

        public Criteria andEnviormentBetween(Integer value1, Integer value2) {
            addCriterion("enviorment between", value1, value2, "enviorment");
            return (Criteria) this;
        }

        public Criteria andEnviormentNotBetween(Integer value1, Integer value2) {
            addCriterion("enviorment not between", value1, value2, "enviorment");
            return (Criteria) this;
        }

        public Criteria andEvaluateIsNull() {
            addCriterion("evaluate is null");
            return (Criteria) this;
        }

        public Criteria andEvaluateIsNotNull() {
            addCriterion("evaluate is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluateEqualTo(String value) {
            addCriterion("evaluate =", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateNotEqualTo(String value) {
            addCriterion("evaluate <>", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateGreaterThan(String value) {
            addCriterion("evaluate >", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateGreaterThanOrEqualTo(String value) {
            addCriterion("evaluate >=", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateLessThan(String value) {
            addCriterion("evaluate <", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateLessThanOrEqualTo(String value) {
            addCriterion("evaluate <=", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateLike(String value) {
            addCriterion("evaluate like", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateNotLike(String value) {
            addCriterion("evaluate not like", value, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateIn(List<String> values) {
            addCriterion("evaluate in", values, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateNotIn(List<String> values) {
            addCriterion("evaluate not in", values, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateBetween(String value1, String value2) {
            addCriterion("evaluate between", value1, value2, "evaluate");
            return (Criteria) this;
        }

        public Criteria andEvaluateNotBetween(String value1, String value2) {
            addCriterion("evaluate not between", value1, value2, "evaluate");
            return (Criteria) this;
        }

        public Criteria andCommentimgIsNull() {
            addCriterion("commentimg is null");
            return (Criteria) this;
        }

        public Criteria andCommentimgIsNotNull() {
            addCriterion("commentimg is not null");
            return (Criteria) this;
        }

        public Criteria andCommentimgEqualTo(String value) {
            addCriterion("commentimg =", value, "commentimg");
            return (Criteria) this;
        }

        public Criteria andCommentimgNotEqualTo(String value) {
            addCriterion("commentimg <>", value, "commentimg");
            return (Criteria) this;
        }

        public Criteria andCommentimgGreaterThan(String value) {
            addCriterion("commentimg >", value, "commentimg");
            return (Criteria) this;
        }

        public Criteria andCommentimgGreaterThanOrEqualTo(String value) {
            addCriterion("commentimg >=", value, "commentimg");
            return (Criteria) this;
        }

        public Criteria andCommentimgLessThan(String value) {
            addCriterion("commentimg <", value, "commentimg");
            return (Criteria) this;
        }

        public Criteria andCommentimgLessThanOrEqualTo(String value) {
            addCriterion("commentimg <=", value, "commentimg");
            return (Criteria) this;
        }

        public Criteria andCommentimgLike(String value) {
            addCriterion("commentimg like", value, "commentimg");
            return (Criteria) this;
        }

        public Criteria andCommentimgNotLike(String value) {
            addCriterion("commentimg not like", value, "commentimg");
            return (Criteria) this;
        }

        public Criteria andCommentimgIn(List<String> values) {
            addCriterion("commentimg in", values, "commentimg");
            return (Criteria) this;
        }

        public Criteria andCommentimgNotIn(List<String> values) {
            addCriterion("commentimg not in", values, "commentimg");
            return (Criteria) this;
        }

        public Criteria andCommentimgBetween(String value1, String value2) {
            addCriterion("commentimg between", value1, value2, "commentimg");
            return (Criteria) this;
        }

        public Criteria andCommentimgNotBetween(String value1, String value2) {
            addCriterion("commentimg not between", value1, value2, "commentimg");
            return (Criteria) this;
        }

        public Criteria andAveragepriceIsNull() {
            addCriterion("averageprice is null");
            return (Criteria) this;
        }

        public Criteria andAveragepriceIsNotNull() {
            addCriterion("averageprice is not null");
            return (Criteria) this;
        }

        public Criteria andAveragepriceEqualTo(BigDecimal value) {
            addCriterion("averageprice =", value, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceNotEqualTo(BigDecimal value) {
            addCriterion("averageprice <>", value, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceGreaterThan(BigDecimal value) {
            addCriterion("averageprice >", value, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("averageprice >=", value, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceLessThan(BigDecimal value) {
            addCriterion("averageprice <", value, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("averageprice <=", value, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceIn(List<BigDecimal> values) {
            addCriterion("averageprice in", values, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceNotIn(List<BigDecimal> values) {
            addCriterion("averageprice not in", values, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("averageprice between", value1, value2, "averageprice");
            return (Criteria) this;
        }

        public Criteria andAveragepriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("averageprice not between", value1, value2, "averageprice");
            return (Criteria) this;
        }

        public Criteria andMenuidIsNull() {
            addCriterion("menuid is null");
            return (Criteria) this;
        }

        public Criteria andMenuidIsNotNull() {
            addCriterion("menuid is not null");
            return (Criteria) this;
        }

        public Criteria andMenuidEqualTo(Integer value) {
            addCriterion("menuid =", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotEqualTo(Integer value) {
            addCriterion("menuid <>", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThan(Integer value) {
            addCriterion("menuid >", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("menuid >=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThan(Integer value) {
            addCriterion("menuid <", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidLessThanOrEqualTo(Integer value) {
            addCriterion("menuid <=", value, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidIn(List<Integer> values) {
            addCriterion("menuid in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotIn(List<Integer> values) {
            addCriterion("menuid not in", values, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidBetween(Integer value1, Integer value2) {
            addCriterion("menuid between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andMenuidNotBetween(Integer value1, Integer value2) {
            addCriterion("menuid not between", value1, value2, "menuid");
            return (Criteria) this;
        }

        public Criteria andCarIsNull() {
            addCriterion("car is null");
            return (Criteria) this;
        }

        public Criteria andCarIsNotNull() {
            addCriterion("car is not null");
            return (Criteria) this;
        }

        public Criteria andCarEqualTo(String value) {
            addCriterion("car =", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarNotEqualTo(String value) {
            addCriterion("car <>", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarGreaterThan(String value) {
            addCriterion("car >", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarGreaterThanOrEqualTo(String value) {
            addCriterion("car >=", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarLessThan(String value) {
            addCriterion("car <", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarLessThanOrEqualTo(String value) {
            addCriterion("car <=", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarLike(String value) {
            addCriterion("car like", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarNotLike(String value) {
            addCriterion("car not like", value, "car");
            return (Criteria) this;
        }

        public Criteria andCarIn(List<String> values) {
            addCriterion("car in", values, "car");
            return (Criteria) this;
        }

        public Criteria andCarNotIn(List<String> values) {
            addCriterion("car not in", values, "car");
            return (Criteria) this;
        }

        public Criteria andCarBetween(String value1, String value2) {
            addCriterion("car between", value1, value2, "car");
            return (Criteria) this;
        }

        public Criteria andCarNotBetween(String value1, String value2) {
            addCriterion("car not between", value1, value2, "car");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("createdate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("createdate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("createdate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("createdate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("createdate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("createdate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("createdate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("createdate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("createdate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("createdate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("createdate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("createdate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCommenttopIsNull() {
            addCriterion("commenttop is null");
            return (Criteria) this;
        }

        public Criteria andCommenttopIsNotNull() {
            addCriterion("commenttop is not null");
            return (Criteria) this;
        }

        public Criteria andCommenttopEqualTo(Integer value) {
            addCriterion("commenttop =", value, "commenttop");
            return (Criteria) this;
        }

        public Criteria andCommenttopNotEqualTo(Integer value) {
            addCriterion("commenttop <>", value, "commenttop");
            return (Criteria) this;
        }

        public Criteria andCommenttopGreaterThan(Integer value) {
            addCriterion("commenttop >", value, "commenttop");
            return (Criteria) this;
        }

        public Criteria andCommenttopGreaterThanOrEqualTo(Integer value) {
            addCriterion("commenttop >=", value, "commenttop");
            return (Criteria) this;
        }

        public Criteria andCommenttopLessThan(Integer value) {
            addCriterion("commenttop <", value, "commenttop");
            return (Criteria) this;
        }

        public Criteria andCommenttopLessThanOrEqualTo(Integer value) {
            addCriterion("commenttop <=", value, "commenttop");
            return (Criteria) this;
        }

        public Criteria andCommenttopIn(List<Integer> values) {
            addCriterion("commenttop in", values, "commenttop");
            return (Criteria) this;
        }

        public Criteria andCommenttopNotIn(List<Integer> values) {
            addCriterion("commenttop not in", values, "commenttop");
            return (Criteria) this;
        }

        public Criteria andCommenttopBetween(Integer value1, Integer value2) {
            addCriterion("commenttop between", value1, value2, "commenttop");
            return (Criteria) this;
        }

        public Criteria andCommenttopNotBetween(Integer value1, Integer value2) {
            addCriterion("commenttop not between", value1, value2, "commenttop");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_comment
     *
     * @mbggenerated do_not_delete_during_merge Fri Apr 26 19:29:00 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user_comment
     *
     * @mbggenerated Fri Apr 26 19:29:00 CST 2019
     */
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