package com.dream.libra.enums;

public enum QuestionQueryField {

    OPTION("option", "题目选项"),
    PROPERTY("property", "题目属性"),
    ;

    public final String fieldName;
    public final String desc;

    QuestionQueryField(String fieldName, String desc){
        this.fieldName  = fieldName;
        this.desc = desc;
    }
}
