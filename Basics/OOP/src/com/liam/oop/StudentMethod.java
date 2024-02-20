package com.liam.oop;

public class StudentMethod {
    //方法1:无参数，无返回值方法
    public void study(){
        System.out.println("这是学习方法");
    }

    //方法2：有参数，无返回值方法
    public void studyTime(int time,String name){
        System.out.println("studyTime时长：" + time + "    姓名：" + name);
    }

    //方法3：无参数，有返回值方法
    public String studyname(){
        System.out.println("学习的科目是：？？？");
        return "没有查询到";
    }

    //方法4：有参数有返回值方法
    public String studynameC(String name){
        System.out.println("学习的科目是：" + name);
        return "查询到了学习科目是：" + name;
    }

    //静态方法-类方法
    public static void hell(){

    }

    //非静态方法-实例方法
    public void hello2(){

    }

}