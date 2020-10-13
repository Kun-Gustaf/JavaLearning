package com.zhiyou100;
//比较运算符 compare
public class Demo03_Operator {
    public static void main(String[] args) {
        /*
            比较运算符
            >       <       ==      >=         <=         !=
            大于    小于     等于   大于等于    小于等于      不等于

            备注：1.比较运算符中"等于"符号 是 "==" ,而不是"="。
                 2.比较运算符运算的结果就是布尔类型值，要么是true,要么是false。
                 3.比较运算符可以连接表达式或者语句
        */
        int a = 10;
        int b = 20;
        System.out.println(a > b);//false
        System.out.println(a < b);//true
        System.out.println(a != b);//true
        System.out.println(a == b);//false
        System.out.println(a >= b);//false
        System.out.println(a <= b);//true
        //备注： ">=" "<="该运算符运算过程中只要满足其中一种情形结果即为true。
        //比较运算符前后是语句
        System.out.println(a++ > b--);//false
    }
}
