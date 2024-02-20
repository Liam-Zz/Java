package com.liam.ooptest;
import com.liam.oop.*;
//此为跨包演示类
public class use_students {
    public static void main(String[] args) {
        students students = new students();
        students.name = "李四";
        students.age = 18;
        students.gender = '男';

        System.out.println("姓名为：" + students.name + "  年龄为：" + students.age + "  性别为：" + students.gender);

        students.study();
        students.eat();
    }
}
