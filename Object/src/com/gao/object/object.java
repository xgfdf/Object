package com.gao.object;

public class object {
    public static void main(String[] args) {

        System.out.println("abc".equals("abc"));
        String a = "sdf";
        String b = "sdf";
        System.out.println(a.equals(b));

        AA aa = new AA();
        aa.setName("afdss");
        System.out.println(aa);
        BB bb = new BB();
        bb.setName("afdss");
        System.out.println(aa.getName().equals(bb.getName()));
        //aa.getName().equals(bb.getName())从比较这两个可以看出，
        //String类的equals方法重写了Object方法，比较的是值是否相等



        /*源码:

        *  public boolean equals(Object anObject) {
        if (this == anObject) {//this指的是调这方法的对象(也就是equals前面的那个字符串)
        //谁调用这个方法，this就指向谁
            return true;
        }
        if (anObject instanceof String) {
            String anotherString = (String)anObject;
            int n = value.length;
            if (n == anotherString.value.length) {
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while (n-- != 0) {
                    if (v1[i] != v2[i])
                        return false;
                    i++;
                }
                return true;
            }
        }
        return false;
    }*/

    }
}
class AA{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class BB{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
