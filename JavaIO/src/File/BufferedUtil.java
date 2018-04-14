package File;

import java.io.*;

public class BufferedUtil {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("javaio\\a.txt")));
        //BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("javaio\\buffered.txt")));

        PrintWriter pw=new PrintWriter("javaio\\buffered1.txt");//底层就是封装了BufferedWriter
        String line;
        while((line=br.readLine())!=null){
            System.out.print(line);
            pw.println(line);
            pw.flush();
//            bw.write(line);//一次读一行 但是不能识别换行
//            //换行工作
//            bw.newLine();
//            bw.flush();
        }
        br.close();
        //bw.close();
        pw.close();
    }
}
