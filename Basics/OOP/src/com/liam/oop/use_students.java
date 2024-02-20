package com.liam.oop;

public class use_students {
    public static void main(String[] args) {

        //类名 对象名= new 类名 ();
        students students = new students();

        //使用对象属性
        //对象.实例变量
        students.name = "张三";
        students.age = 18;
        students.gender = '男';
        System.out.println("姓名为：" + students.name + "  年龄为：" + students.age + "  性别为：" + students.gender);

        //使用对象方法
        students.study();
        students.eat();
    }
}
