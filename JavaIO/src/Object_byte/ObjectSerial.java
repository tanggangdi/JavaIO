package Object_byte;

import java.io.*;

public class ObjectSerial {
    public static void main(String[] args)throws IOException ,ClassNotFoundException{
        String file="javaio\\obj.dat";

        //对象的序列化
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(file));

        Student stu=new Student("tgd","1254",20);
        oos.writeObject(stu);
        oos.flush();
        oos.close();


        //对象的反序列化
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));

        Student student=(Student) ois.readObject();
        System.out.println(student);
        ois.close();
    }
}
