package com.gao.object;

public class Equals {
    public static void main(String[] args) {

        String aa = "aaaqwerty";
        String bb = "aaaqwerty";

        System.out.println(aa.equals(bb));


        int aaa = 1;
        int bbb = 2;//aaa、bbb是基本数据类型，不能用equals方法不叫
        System.out.println(aaa==bbb);
    }
}

class A{
        //下面的这个方法equals1()是Object类的
        //双等号比较引用类型，比较的是内存地址是否相等
    public boolean equals1(Object obj) {
        return (this == obj);
    }
}
