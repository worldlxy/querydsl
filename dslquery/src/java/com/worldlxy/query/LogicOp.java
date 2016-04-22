package com.worldlxy.query;

public class LogicOp {

    public static QueryExp and(QueryExp left, QueryExp right) {
        return new ComplexQueryExp(left, Op.and, right);
    }

    public static QueryExp or(QueryExp left, QueryExp right) {
        return new ComplexQueryExp(left, Op.or, right);
    }

}
