package com.worldlxy.query;

public enum Op {
    and(" and "),
    or(" or "),
    eq("="),
    notEq("!="),
    lt("<"),
    gt(">");

    private String expr;

    Op(String expr) {
        this.expr = expr;
    }

    public String getExpr() {
        return expr;
    }
}
