package com.example.project.util;

public enum userEnumType {
    MEMEBER("member"),
    ADMIN("admin"),
    ;

    String value = "";
    userEnumType(String val) {
        value = val;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
