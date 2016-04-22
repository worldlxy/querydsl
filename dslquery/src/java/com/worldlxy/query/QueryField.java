package com.worldlxy.query;

public class QueryField {

    public static SimpleQueryExp field(String field) {
        return new SimpleQueryExp(field);
    }
}
