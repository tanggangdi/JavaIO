package com;

public class EncodDemo {

    public static void main(String[] args) throws Exception{
        String s="javaIO流";
        //转换成字节序列,是工具自带的编码
        byte[] bytes=s.getBytes();
        for(byte b:bytes){
            //把字节转换成了int，以16进制的方式显示
            System.out.print(Integer.toHexString(b &0xff)+" ");
        }
        System.out.println();


        byte[] bytes1=s.getBytes("gbk");
        //在gbk中，中文占两个字节，英文占用一个字节
        for(byte b:bytes1){
            //把字节转换成了int，以16进制的方式显示
            System.out.print(Integer.toHexString(b &0xff)+" ");
        }
        System.out.println();

        //在utf-8中，中文占用三个字节，英文占用一个字节
        byte[] bytes2=s.getBytes("utf-8");
        for(byte b:bytes2){
            //把字节转换成了int，以16进制的方式显示
            System.out.print(Integer.toHexString(b &0xff)+" ");
        }
        System.out.println();


        //utf-16be中文占用2个字节，英文占用2个字节
        byte[] bytes3=s.getBytes("utf-16be");
        for(byte b:bytes3){
            //把字节转换成了int，以16进制的方式显示
            System.out.print(Integer.toHexString(b &0xff)+" ");
        }
        System.out.println();

        /**
         * 当你的字节序列是某种编码时，这个时候想把字节序列变成字符串，也需要这种编码方式，否则会出现乱码。
         */
        String str1=new String(bytes);
        System.out.println(str1);

        String str2=new String(bytes1,"gbk");
        System.out.println(str2);

        String str3=new String(bytes2,"utf-8");
        System.out.println(str3);

        String str4=new String(bytes3,"utf-16be");
        System.out.println(str4);
    }
}
