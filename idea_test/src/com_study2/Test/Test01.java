package com_study2.Test;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        String s = fanZhuan(line);
        System.out.println("反转后为："+s);
    }
    public static String fanZhuan(String line){
//    StringBuilder sb = new StringBuilder(line);
//    sb.reverse();
//    String ss = sb.toString();
       return new StringBuilder(line).reverse().toString();
//        return ss;
    }
}
