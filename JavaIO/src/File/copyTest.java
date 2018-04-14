package File;

import java.io.File;

public class copyTest {
    public static void main(String[] args){
        //FileStream copy test
        try{
            CopyFunction.copyFile(new File("javaio\\a.txt"),new File("javaio\\b.txt"));
        }catch (Exception e){
            e.printStackTrace();
        }


        //bufferStream copy test
        try{
            CopyFunction.copyFileByBuffer(new File("javaio\\a.txt"),new File("javaio\\c.txt"));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
