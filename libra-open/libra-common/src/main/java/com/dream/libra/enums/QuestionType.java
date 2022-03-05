package com.dream.libra.enums;

import java.util.Arrays;

public enum QuestionType {
    
    SINGLE((byte) 1, "单选"),
    MULTIPLE((byte) 2, "多选"),
    JUDGE((byte) 3, "判断"),
    NOTHING((byte) 0, "未知");

    public final Byte code;
    public final String text;

    QuestionType(Byte code, String txt) {
        this.code = code;
        this.text = txt;
    }

    public static QuestionType match(Byte code) {
        for (QuestionType questionType : QuestionType.values()) {
            if (questionType.code.equals(code)) {
                return questionType;
            }
        }

        return NOTHING;
    }

    public static QuestionType match(String text) {
        for (QuestionType questionType : QuestionType.values()) {
            if (questionType.text.equals(text)) {
                return questionType;
            }
        }

        return NOTHING;
    }

    public static boolean contain(Byte code) {
        return Arrays.stream(values()).anyMatch(type -> type.code.equals(code));
    }
}
