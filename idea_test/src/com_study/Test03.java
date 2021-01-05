package com_study;

import java.util.ArrayList;
import java.util.Iterator;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Hello");
        arr.add("world");

        for (String s:arr){
            System.out.println(s);
        }
        System.out.println("-----------");

        Iterator<String> i = arr.iterator();
        while(i.hasNext()){
            String next = i.next();
            System.out.println(next);
        }
    }
}
