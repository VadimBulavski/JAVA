package com.vadim;

import java.awt.*;

/**
 * Created by admin on 14.01.2017.
 */
public class Student {
    int age;
    String fio;
    Color skin;

    public Student() {
    }

    public Student(int age, String fio, Color skin) {
        this.age = age;
        this.fio = fio;
        this.skin = skin;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Color getSkin() {
        return skin;
    }

    public void setSkin(Color skin) {
        this.skin = skin;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", fio='" + fio + '\'' +
                ", skin=" + skin +
                '}';
    }
}
