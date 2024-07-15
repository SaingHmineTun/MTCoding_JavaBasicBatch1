package com.saimao.Lesson56_Enum;

public enum Priority {
    HIGH("High"), MEDIUM("Medium"), LOW("Low");
    private final String value;

    Priority(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void printValue() {
        System.out.println("Value - " + value);
    }

}
