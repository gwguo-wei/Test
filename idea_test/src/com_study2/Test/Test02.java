package com_study2.Test;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("郭");
        array.add("威");
        //IndexOutOfBoundsException 索引越界
//        System.out.println(array.get(2));
        for (int i=0;i<array.size();i++){
            String s = array.get(i);
            System.out.println(s);
        }
    }
}
