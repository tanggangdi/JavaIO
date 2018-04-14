package File;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException{
        //创建目录和文件
        File file=new File("javaio");
        if(!file.exists()){
            file.mkdir();
        }
        File file1=new File(file,"a.txt");
        if(!file1.exists()){
            file1.createNewFile();
        }
        //设置文件权限
        java.io.RandomAccessFile raf=new java.io.RandomAccessFile(file1,"rw");
        //查看指针的位置
        System.out.println(raf.getFilePointer());

        //对文件进行写入,一次性只能读进一个字节
        raf.write('A');
        raf.write('B');
        System.out.println(raf.getFilePointer());//2

        int i=0x7ffffff;
        //用write（）方法只能写一个字节,下面的代码与raf.writeInt(i);等价
        /*
        raf.write(i>>>24);//高8位
        raf.write(i>>>16);
        raf.write(i>>>8);
        raf.write(i);
        */
        raf.writeInt(i);
        String s="文件";
        byte[] bytes=s.getBytes("gbk");
        raf.write(bytes);
        System.out.println(raf.length());   //10

        //读文件，必须要先把文件指针移到头部
        raf.seek(0);
        //一次性读取，把文件中的内容都读到数组当中去
        byte[] bytes1=new byte[(int) raf.length()]; //length()返回的是long型
        raf.read(bytes1);
        System.out.println(Arrays.toString(bytes1));
        //以十六进制的方式输出
        for(byte bt:bytes){
            System.out.print(Integer.toHexString(bt &0xff)+",");
        }
        //关闭文件
        raf.close();
    }
}
