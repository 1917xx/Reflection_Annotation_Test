package cn.yangbian.reflection;

public class Reflect extends Object{
    public static void main(String[] args) throws ClassNotFoundException {
        //通过反射获取类的class对象
        Class c1 = Class.forName("cn.yangbian.reflection.User");
        System.out.println(c1);
        Class c2 = Class.forName("cn.yangbian.reflection.User");
        Class c3 = Class.forName("cn.yangbian.reflection.User");
        Class c4 = Class.forName("cn.yangbian.reflection.User");
        //判断是否是同一个类，通过打印他们的哈希code
        //一个类在内存中只有一个class对象
        //一个类被加载后，类的整个结构都会被封装在class对象中
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());

    }
}
//实体类： pojo ;entity 与数据库真是映射
class User{
    private String name;
    private int id;
    private int age;

    public User() {
    }

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
