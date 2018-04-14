package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamUtil {
    public static void main(String[] args) throws IOException{

        //如果该文件不存在，则直接创建，如果存在，删除后创建，可以在后面追加：true，表示如果存在，不删除
        FileOutputStream out=new FileOutputStream("javaio:\\out.dat");
        out.write('A');
        out.write('B');
        int a=10;//write只能写8位，则要进行四次写入
        out.write(a>>>24);
        out.write(a>>>18);
        out.write(a>>>8);
        out.write(a);
        //也可以用字节数组来进行写入
        String s="输出流";
        byte[] bytes=s.getBytes("gbk");
        out.write(bytes);
        out.close();
    }

}
