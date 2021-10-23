package cn.yangbian.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//自定义注解
public class DefiendAnnotation {
    @MyAnnotation(name = "nihao")
    public void test(){

    }

}
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
    //注解的参数：参数类型+参数名()；
    String name();

}