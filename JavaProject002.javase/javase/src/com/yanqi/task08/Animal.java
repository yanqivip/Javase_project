package com.yanqi.task08;

public class Animal {
    private  String name;
    private String color;

    public Animal() {
    }
    public Animal(String name, String color) {
        setName(name);
        setName(color);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void show() {
        System.out.println("名字：" + getName() + ",颜色：" + getColor());
    }
}
