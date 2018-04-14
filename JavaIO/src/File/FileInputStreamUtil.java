package File;

import java.io.IOException;

public class FileInputStreamUtil {
    /**
     * 读取指定文件内容，按照16进制输出到控制台中
     * 并且每输出10个byte换行
     * @param fileName
     */
    public static void printHex(String fileName )throws IOException{
        java.io.FileInputStream in=new java.io.FileInputStream(fileName);
        int b;
        int i=1;
        while ((b=in.read())!=-1){
            System.out.print(Integer.toHexString(b)+" ");
            if(i++%10==0){
                System.out.println();
            }
        }
        //关闭文件流
        in.close();
    }

    public  static void printHexByByteArray(String fileName) throws IOException{
        java.io.FileInputStream in=new java.io.FileInputStream(fileName);
        byte[] buf=new byte[20*1024];
        int j=1;
        /**
         * 从in中批量读取字节，放入到buf中，从0位置开始放，最多放buf.length个，返回的是读到的字节的个数
         */
          int b=0;
          while((b=in.read(buf,0,buf.length))!=-1){
              for(int i=0;i<b;i++){
                System.out.print(Integer.toHexString(buf[i] & 0xff)+" ");
              }
              if(j++%10==0){
              System.out.println();
              }
          }
          in.close();
//        int b=in.read(buf,0,buf.length);//一次性读完
//        for(int i=0;i<b;i++){
//            System.out.print(Integer.toHexString(buf[i])+" ");
//            if(j++%10==0){
//                System.out.println();
//            }
//        }
    }
    public static void main(String[] args)throws IOException{
        FileInputStreamUtil.printHex("E:\\test\\javaio.txt");
        FileInputStreamUtil.printHexByByteArray("E:\\test\\javaio.txt");
    }
}
