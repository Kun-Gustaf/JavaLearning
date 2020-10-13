package com.zhiyou100;
//赋值运算符
public class Demo02_Operator {

    public static void main(String[] args) {
        /*
            赋值运算符，就是给变量赋值(初始化)
            = 等号代表的意思是把等号右边的数据赋值给等号左边的变量
            += 相加赋值，就是该运算符左边的变量相加运算符右边的数据的结果又赋值给该运算符左边的变量
            -= 相减赋值，意思等同上边
            *= 相乘赋值，意思等同上边
            /= 相除赋值，意思等同上边
            %= 取余赋值，意思等同上边
         */

        int a;
        a = 10;
        int a1 = 10;
        /*
            a1 = a1+10;//20
        等价于：
            a1 += 10;
        */
        a1 += 10;
        System.out.println(a1);//20

        int b1 = a1 + 10;//20
        // -=相减运算
        int a2 = 10;
        /*
            a2 = a2 - 5;//5
            等价于：
            a2 -= 5;//5
        */
        a2 -= 5;
        System.out.println(a2);


        // *= 相乘运算
        int a3 = 10;
        a3 = a3 * 5;
        //等价于 a3 *=5;
        System.out.println(a3);//50


        // /= 相除运算 求商数
        int a4 =13;
        a4 = a4 / 5;
        System.out.println(a4);//2
        //等价于 a4 /= 5;
        System.out.println(a4);//2


        // %= 求余运算 求余数
        int a5 = 13;
        a5 %= 5;
        //等价于 a5 = a5 % 5;
        System.out.println(a5);//3

    }
}
