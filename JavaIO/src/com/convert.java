package com;

public class convert {

    /**
     * int转换为Bytes[]
     * @param id
     */
    public static byte[] intToBytes(int id){
        byte[] arr=new byte[4];
        for(int i=0;i<arr.length;i++){
            arr[i]=(byte)((int)(id>>i*8 &0xff));
        }
        return arr;
    }

    /**
     * byte[]转换为int型
     * @param arr
     * @return
     */
    public static int byteToInt(byte[] arr){
        int result=0;
        for(int i=0;i<arr.length;i++){
            result +=(int)((arr[i]& 0xff) <<i*8);
        }
        return result;
    }

    public static void main(String[] args){
        byte[] arr=convert.intToBytes(8143);
        System.out.println(arr[0]+","+arr[1]+","+arr[2]+","+arr[3]);
        System.out.println(convert.byteToInt(arr));
    }
}
