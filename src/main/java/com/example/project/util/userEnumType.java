package com.example.project.util;

public enum userEnumType {
    DIRECT("1", "direct"),
    MEMBER("2", "member"),
    AGENT("3", "agent"),
    ;

    String value;
    String msg;
    userEnumType(String val, String msg) {
        value = val;
        msg = msg;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
