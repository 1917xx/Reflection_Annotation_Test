package cn.yangbian.reflection;

public class TestClassInitWhen {
    static {
        System.out.println("main 类被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
//        //1.主动引用
//        Son son = new Son();
//        //反射也会产生主动引用
//        Class.forName("cn.yangbian.reflection.Son");



        //不会产生类的引用方法
//        System.out.println(Son.b);
//        Son[] array = new Son[5];
        System.out.println(Son.M);
    }
}
class Father{
    static int b = 2;
    static {
        System.out.println("父类被加载");
    }
}
class Son extends Father{
    static {
        System.out.println("子类被加载");
        m = 300;
    }
    static int m = 100;
    static final int M = 1;
}
