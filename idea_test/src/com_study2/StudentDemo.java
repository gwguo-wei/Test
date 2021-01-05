package com_study2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

/*
* 学生测试类
* */
public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
//        Student s1 = new Student("郭威",20);
//        Student s2 = new Student("杜澳美",20);
        addStudent(array);
        addStudent(array);

        for (int i = 0;i<array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getName() +" "+ s.getAge());
        }
    }
    public static void addStudent(ArrayList array){
        Student s = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        s.setName(name);
        System.out.println("请输入学生年龄：");
        int age = sc.nextInt();
        s.setAge(age);
        array.add(s);
    }
}
