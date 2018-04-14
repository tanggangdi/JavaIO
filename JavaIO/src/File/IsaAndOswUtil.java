package File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IsaAndOswUtil {
    public static void main(String[] args) throws Exception{
        FileInputStream fileInputStream=new FileInputStream("javaio\\a.txt");
        InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream,"gbk");//默认项目的编码

        FileOutputStream fileOutputStream=new FileOutputStream("javaio\\a1.txt");
        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream,"gbk");
        //字符char
//        int c;
//        while((c=inputStreamReader.read())!=-1){
//            System.out.print((char) c);
//        }

        //批量读取，放入到buff这个字符数组中，从0位置开始放，读buff.length的长度
        char[] buff=new char[8*1024];
        int c;
        while((c=inputStreamReader.read(buff,0,buff.length))!=-1){
            String s=new String(buff,0,c);
            System.out.println(s);
            outputStreamWriter.write(buff,0,c);
            outputStreamWriter.flush();
        }
        inputStreamReader.close();
        outputStreamWriter.close();
    }
}
