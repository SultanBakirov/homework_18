package com.company;

public class Horse extends Animal{
    private String color;

    public Horse(int weight, int age, String gender, String nickName, String color) {
        super(weight, age, gender, nickName);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void method1() {
        System.out.println(getWeight() + " " + getAge() + " " + getGender() + " " + getNickName() + " " + getColor());
    }
}
