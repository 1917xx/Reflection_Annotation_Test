package cn.yangbian.reflection;
//测试class类的创建方式有哪些
public class TestClass {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person  = new Student();
        System.out.println("这个人是："+person.name);
        //方式一：通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());
        //方式二：通过forname获得
        Class c2 = Class.forName("cn.yangbian.reflection.Student");
        System.out.println(c2.hashCode());
        //方式一：通过对象获得
    }
}
class Person{
   public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Student extends Person{
    public Student() {
        this.name = "学生";
    }
}
class Teacher extends Person{
    public Teacher() {
        this.name = "老师";
    }
}