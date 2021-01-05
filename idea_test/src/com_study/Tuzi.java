package com_study;


//有一对兔子，每三个月生一对小兔子，假设兔子不死，20个月后有多少对兔子
public class Tuzi {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0]=1;
        arr[1]=1;
        for ( int x = 2;x<arr.length;x++){
            arr[x]=arr[x-2]+arr[x-1];
            System.out.println("第"+(x+1)+"个月："+arr[x]);
        }
    }
}
