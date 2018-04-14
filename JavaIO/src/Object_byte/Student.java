package Object_byte;

import java.io.IOException;
import java.io.Serializable;

public class Student implements Serializable{//对象要继承实例化接口
    private String name;
    private String number;
    private transient  int age;//该元素不会被jvm默认序列化
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(String name, String number, int age) {
        this.name = name;
        this.number = number;
        this.age = age;
    }

    //序列化
    private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException{
        s.defaultWriteObject();//把jvm能默认序列化的元素进行序列化操作
        s.writeInt(age);//自己完成age的序列化
    }

    //反序列化
    private void readObject(java.io.ObjectInputStream s)throws IOException,ClassNotFoundException{
        s.defaultReadObject();
        this.age=s.readInt();
    }
}
