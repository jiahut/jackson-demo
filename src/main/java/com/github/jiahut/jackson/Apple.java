package com.github.jiahut.jackson;

public class Apple implements Fruit {
    private String name;
    private Integer size;

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public Integer getSize() {
        return size;
    }

}
