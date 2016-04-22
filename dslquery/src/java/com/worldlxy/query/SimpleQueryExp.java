package com.worldlxy.query;

class SimpleQueryExp implements QueryExp {
    private String field;
    private String op;
    private String condition;

    SimpleQueryExp(String field) {
        this.field = field;
    }

    public QueryExp eq(String condition) {
        this.op = Op.eq.getExpr();
        this.condition = condition;

        return this;
    }

    public QueryExp notEq(String condition) {
        this.op = Op.notEq.getExpr();
        this.condition = condition;

        return this;
    }

    public QueryExp lt(String condition) {
        this.op = Op.lt.getExpr();
        this.condition = condition;

        return this;
    }

    public QueryExp gt(String condition) {
        this.op = Op.gt.getExpr();
        this.condition = condition;

        return this;
    }

    @Override
    public String toString() {
        return "(" + field + op + condition +")";
    }
}
