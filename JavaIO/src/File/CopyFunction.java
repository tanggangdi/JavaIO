package File;

import java.io.*;

public class CopyFunction {

    /**
     * 可以用FileOutputStream输出流和FileInputStream输入流来写一个copy功能
     *
     */
    public static void copyFile(File srcFile, File dstFile)throws IOException {
        if(!srcFile.exists()){
            throw new IllegalArgumentException("文件"+srcFile+"不存在");
        }
        if(!srcFile.isFile()){
            throw new IllegalArgumentException(srcFile+"不是文件");
        }
        FileInputStream in=new FileInputStream(srcFile);
        FileOutputStream out=new FileOutputStream(dstFile);
        byte[] buf=new byte[8*1024];
        int b;
        while((b=in.read(buf,0,buf.length))!=-1){
            out.write(buf,0,b);
            out.flush();
        }
        in.close();;
        out.close();
    }

    /**
     * 进行文件的copy，利用缓冲区的字节流
     * @param srcfile
     * @param dstFile
     */
    public static void copyFileByBuffer(File srcfile,File dstFile)throws IOException{
        if(!srcfile.exists()){
            throw new IllegalArgumentException("文件"+srcfile+"不存在");
        }
        if(!srcfile.isFile()){
            throw new IllegalArgumentException(srcfile+"不是文件");
        }
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream(srcfile));
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(dstFile));

        int c;
        while((c=bis.read())!=-1){
            bos.write(c);
            bos.flush();//刷新缓冲区
        }
        bis.close();
        bos.close();
    }
}
