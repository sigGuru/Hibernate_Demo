package com.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Hosteller {

    @Id
    int hid;
    String name;
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    @Override
    public String toString() {
        return "Hosteller{" +
                "id=" + hid +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
