package com.flipkart.databuilderframework;

import com.flipkart.databuilderframework.model.Data;

public class TestDataY extends Data {
    private String value;

    public TestDataY(String value) {
        super("X");
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
