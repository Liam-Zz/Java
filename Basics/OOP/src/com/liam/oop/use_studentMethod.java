package com.liam.oop;

public class use_studentMethod {

    public static void main(String[] args) {

        StudentMethod studentMethod = new StudentMethod();

        //调用无参无返回值方法
        studentMethod.study();
        System.out.println("------");

        //调用有参无返回值方法
        studentMethod.studyTime(10,"张三");
        System.out.println("------");

        //调用无参有返回值方法
        //studentMethod.studyname();
        //String sn = studentMethod.studyname();
        //System.out.println("sn:" + sn);
        System.out.println(studentMethod.studyname());
        System.out.println("------");

        //调用有参有返回值方法
        System.out.println(studentMethod.studynameC("数学"));


    }
}
