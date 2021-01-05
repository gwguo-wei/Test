package com_study;

import java.util.Comparator;
import java.util.TreeSet;

public class StudentDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
               int num = s2.getSum()-s1.getSum();
               int num2 = num==0?s2.getChinese()-s1.getChinese():num;
               int num3 = num2==0?s2.getName().compareTo(s1.getName()):num2;
                return num3;
            }
        });
        Student s1 = new Student("张三",100,50);
        Student s2 = new Student("李四",80,70);
        Student s3 = new Student("王二",90,50);
        Student s4 = new Student("小杜",100,50);
        Student s5 = new Student("小郭",10,5);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (Student s:ts){
            System.out.println(s.getName()+","+s.getChinese()+","+s.getMath()+","+s.getSum());
        }
    }
}
