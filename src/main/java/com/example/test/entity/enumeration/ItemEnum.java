package com.example.test.entity.enumeration;

public enum ItemEnum {
    Tea("Tea"),
    Sugar("Sugar"),
    Salt("Salt");

    private final String item;

    ItemEnum(String item) {
        this.item = item;
    }

    public static Boolean findByItem(String item) {
        for (ItemEnum prj : values()) {
            if (prj.getValue().equals(item)) {
                return true;
            }
        }
        return false;
    }

    public String getValue() {
        return item;
    }
}
