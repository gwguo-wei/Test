package com_study;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int height[] = {60,120,180,170,168,198,200,40};
        int Max =  height[0];
        int Min = height[5];
        Scanner sc = new Scanner(System.in);

        for (int i=0;i<height.length;i++){
            if (height[i]>Max) {
                Max = height[i];
                System.out.println("目前最大值是：" + Max);
            }
            if (height[i]<Min){
                Min = height[i];
                System.out.println("目前最小值是："+ Min);
            }
        }
    }
}
