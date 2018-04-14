package File;

import java.io.FileReader;
import java.io.FileWriter;

public class FrAndFwUtil {
    public static void main(String[] args)throws Exception{
        FileReader fr=new FileReader("javaio\\a.txt");
        FileWriter fw=new FileWriter("javaio\\a2.txt",true);//true表示新增的内容append到源文件中

        char[] buff=new char[8*1024];
        int b;
        while((b=fr.read(buff,0,buff.length))!=-1){
            fw.write(buff,0,b);
            fw.flush();
        }
        fr.close();
        fw.close();
    }
}
