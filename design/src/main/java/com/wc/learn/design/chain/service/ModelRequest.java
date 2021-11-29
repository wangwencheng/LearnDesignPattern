package com.wc.learn.design.chain.service;

public class ModelRequest {
    private Integer number;
    private String message;
    private String name;
    public String age;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public ModelRequest(Integer number, String message, String name, String age) {
        this.number = number;
        this.message = message;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ModelRequest{" +
                "number=" + number +
                ", message='" + message + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
