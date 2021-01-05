package com_study2;

/*
 * 学生类
 * */
public class Student {
    private String name;
    private int age;

    public  Student(){}
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
