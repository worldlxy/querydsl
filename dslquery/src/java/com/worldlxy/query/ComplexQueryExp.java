package com.worldlxy.query;

public class ComplexQueryExp implements QueryExp {
    private QueryExp left;
    private Op op;
    private QueryExp right;

    public ComplexQueryExp(QueryExp left, Op op, QueryExp right) {
        this.left = left;
        this.op = op;
        this.right = right;
    }

    @Override
    public String toString() {
        String leftCondition = buildCondition(left);
        String rightCondition = buildCondition(right);

        return "(" + leftCondition + op.getExpr() + rightCondition + ")";
    }

    private String buildCondition(QueryExp queryExp) {
        if(queryExp instanceof SimpleQueryExp) {
            return queryExp.toString();
        }

        ComplexQueryExp complexQueryExp = (ComplexQueryExp) queryExp;

        return "(" + buildCondition(complexQueryExp.left) + complexQueryExp.op.getExpr()
                + buildCondition(complexQueryExp.right) + ")";
    }

}
