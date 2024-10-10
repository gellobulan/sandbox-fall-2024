package com.sandbox.comparable;

public class Orange extends Fruit {


    public Orange(String type, String color, int size) {
        super(type, color, size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Orange {");
        sb.append("types'").append(type).append('\'');
        sb.append(", colors='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}