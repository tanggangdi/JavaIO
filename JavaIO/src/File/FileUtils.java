package File;

import java.io.File;
import java.io.IOException;

/**
 * 列出File的一些常用操作
 */
public class FileUtils {

    /**
     * 遍历目录（包括子目录下的）
     * @param dir
     */
    public static void listDirectory(File dir)throws IOException{
        if(!dir.exists()){
            throw new  IllegalArgumentException("目录"+dir+"不存在");
        }
        if(!dir.isDirectory()){
            throw new IllegalArgumentException(dir+"不是目录");
        }
        /*
        String[] filename=dir.list();//list（）方法用于列出当前目录下的子目录和文件，不包含子目录下的内容
        for(String str:filename){
            System.out.println(str);
        }
        */

        //如果要遍历子目录下的内容，就需要构造成File对象做递归操作
        File[] files=dir.listFiles();//返回File对象
        if(files!=null&&files.length>0){
            for(File file:files){
                if(file.isDirectory()){
                    //递归
                    listDirectory(file);
                }
                else {
                    System.out.println(file);
                 }
             }
        }
    }

    public static void FileMethod(){
        //了解构造函数的情况
        File file=new File("E:\\IOtest\\javaio.txt");
        //判断文件存在不存在
        System.out.println(file.exists());
        /*
        if(!file.exists()){
            file.createNewFile(); //创建文件
        }
        else
            file.delete();//删除文件
        */
        System.out.println(file.isDirectory());//判断是不是一个目录,如果是目录，则返回true，如果不是目录或者不存在，则返回false
        System.out.println(file.isFile());//判断是不是一个文件

        //常用的File对象的API
        System.out.println(file);
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());
        System.out.println(file.getParent());
    }
    public static void main(String[] args) throws IOException{
            FileUtils.FileMethod();
            File file=new File("E:\\structs");
            FileUtils.listDirectory(file);
         }
}
