package File;

import java.io.*;

public class DateStream {

    /**
     * 数据流写入
     * @throws IOException
     */
    public static void dataOutputStream() throws IOException{
        String file="javaio/date.dat";
        DataOutputStream dos=new DataOutputStream(new FileOutputStream(file));
        dos.writeInt(10);
        dos.writeInt(-10);
        dos.writeLong(10l);
        dos.writeDouble(10.5);
        //采用utf-8编码写出
        dos.writeUTF("数据流");
        //采用utf-16be编码写出
        dos.writeChars("输出流");
        dos.close();
    }

    /**
     * 数据流读出
     * @throws IOException
     */
    public static void dataInputStream() throws IOException{
        String file="javaio/date.dat";
        DataInputStream dis=new DataInputStream(new FileInputStream(file));
        int i=dis.readInt();
        System.out.println(i);
        i=dis.readInt();
        System.out.println(i);
        long l=dis.readLong();
        System.out.println(l);
        double d=dis.readDouble();
        System.out.println(d);
        String s=dis.readUTF();
        System.out.println(s);
        char a=dis.readChar();
        System.out.println(a);
        dis.close();
    }

    public static void main(String[] args) {
        try {
            DateStream.dataOutputStream();
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            DateStream.dataInputStream();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
