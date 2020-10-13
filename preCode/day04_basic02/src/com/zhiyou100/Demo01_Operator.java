package com.zhiyou100;
import java.math.*;
//运算符
public class Demo01_Operator {

    public static void main(String[] args){
        /*
        *   运算符 程序中的一种很特殊的符号 连接程序中需要参与运算的变量(前提条件是该变量有值)
        *   "" '' ; - _ ,
        *   算术运算符 + - * / %
        *   ++i  i++ i自加1
        *   --i  i-- i自减1
        *   赋值运算符   += -= *= /= %=
        *   比较运算符(关系运算符) 数字(整数/小数) 表达式(变量+运算符)
        *   逻辑运算符   与& 或| 非!
        *   位运算符    1个字节 = 8 bit(位)
        *   三目(元)运算符   ? :
        *
        * 算术运算符：
        *         + - * / %
        *
        *
        *
        * */
        // + 第一个作用：连接变量(变量的类型：基本+引用(String)) 通常情况下进行字符串拼接
        String name = "张三";
        int age = 20;
        System.out.println(name+age);
        //+ 第二个作用：相加运算
        int a = 10;
        int b = 20;
        int c = a + b ;//30
        System.out.println(c);

        int a1 = 15;
        int b1 = 38;
        int c1 = a1 + b1;
        System.out.println(c1);

        double a200 = 48.02541254;
        double b200 = 69.54125544;
        System.out.println(a200+b200);
        //+ 第三个作用： 正数 > 0(0是自然数，0也是整数)
        int a2 = 10;
        int b2 = +a2;
        System.out.println(a2);
        System.out.println(b2);
        // -  第一个作用：相减运算
        int a3 = 20;
        int b3 = 10;
        int c3 = a3 - b3;
        System.out.println(c3);
        // - 第二个作用：负数 <0
        int a4 = 20;
        int b4 = -20;//-20
        //int c4 = |b4| 语法不成立
        int c4 = Math.abs(b4);

        System.out.println(b4);
        System.out.println(c4);
        //* 重量级 作用：乘法运算
        int a5 = 10;
        int b5 = 20;
        int c5 = a*b;
        System.out.println(c5);
        int a6 = 12334;
        int b6 = 2345;
        int c6 = a6*b6;
        System.out.println(c6);

        //  / 作用：除法运算 求商数(保留整数)
        int a7 = 13;
        int b7 = 5;
        float  c7 = a7 / b7; //3
        System.out.println(c7);

        // % 作用：除法运算 求余数(取模)
        int a8 = 13;
        int b8 = 5;
        int c8 = a8 % b8;
        System.out.println(c8);

        // / 正数 除以 负数
        int c9 = a7 / -b7;
        System.out.println(c9);//-2

        int c10 = -a7 % -b7;
        System.out.println(c10);//-3
        //在除法运算中，余数正负随着被除数走，但是商数的正负(只要除数和被除数其中有且仅有一个为负数即为负数)，否则为正数。

        // ++ 自加运算符
        int number = 10;
        number +=5;// number 自身相加5
        System.out.println(number);

        int number2 = 10;
        number2++;// 等价于 number2 = number2 + 1;等价于 number2 += 1;

        System.out.println(number2);//11

        int num3 = 10;
        // num3++5; 此时语法不成立
        // 5++num3;
        int plus = 5;
        //num3 = num3 + plus++;
        //等价于 num3 += plus++;
        num3 += plus++;
        // 如果变量在++运算符的左边，那么在运算过程中，先进行++运算符左边的运算，在执行++的运算
        System.out.println(num3);//15
        System.out.println(plus);//6

        //变量在++运算符的右边
        int num4 = 10;
        int plus2 = 5;
        num4 += ++plus2;
        System.out.println(num4);//16
        System.out.println(plus2);//6
        //备注：如果变量在++运算符的右边，那么在运算过程中，先进行++运算符，再运行其他运算
        //说明：不管变量是在++运算符的左边还是右边，对于该变量本身都会做自加1运算。

        //-- 自减运算符 运算等同于 ++
        int num5 = 10;
        int reduction = 5;


        //num5 -= reduction--;
        //num5--;
        --num5;
        System.out.println(num5);//5
        //备注：如果--运算符和其他运算符混合使用，那么执行的原理等同于++运算符

    }

}
