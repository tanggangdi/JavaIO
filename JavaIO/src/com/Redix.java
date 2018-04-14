package com;

public class Redix {
    public static void main(String[] args){
        //十进制转换成其他进制
        System.out.println(Integer.toHexString(112));//十六进制
        System.out.println(Integer.toOctalString(112));
        System.out.println(Integer.toBinaryString(112));

        //其他进制转换成十进制
        System.out.println(Integer.parseInt("A6",16));
        System.out.println(Integer.parseInt("76",8));
        System.out.println(Integer.parseInt("110011",2));
        //parseInt和vlaueOf().toString()方法一样
        System.out.println(Integer.valueOf("A6",16).toString());
        System.out.println(Integer.valueOf("76",8).toString());
        System.out.println(Integer.valueOf("110011",2).toString());
    }
}
