package com.zhiyou100;
//位运算符
public class Demo05_Operator {
    public static void main(String[] args) {
        /*
            位运算符    位
            位 bit   计算机中最小的信息单位为bit(位) 一个bit上存储的是0或者1
            计算机中最小的存储单位是byte(字节) 1byte=8bit
            二进制的运算
            与 位运算 &
            或 位运算 |
            非 位运算 × 没有
            异或 位运算 ^
            移位位运算  >> 右移  << 左移  >>> 无符号右移  <<< --> ×没有
            十进制 满10进1
            二进制 满2进1
         */
        // 与位运算 &

        int a = 13;//二进制值 13= 2^3+2^2+2^0=8+4+1= 1101
        int b = 5;//二进制值 101
        int c = a & b;
        System.out.println(c);
        //说明，在与位运算中，如果参与运算的二进制值中，有一个为0，那么运算的结果即为0
        //当前后运算的二进制值的长度不一致时，那么程序会在短的那一放高位补0，短几位就补几个0，保持长度一致

        // 或位运算符 | 参照逻辑运算符中或的规律
        int a1 = 28;//  28 = 011100
        int b1 = 36;//  36 = 100100
        int c1 = a1 | b1;//= 111100 = 60
        System.out.println(c1);

        //异或位运算符 ^ 参照逻辑运算符异或的规律
        int a2 = 123;// 123 = 01111011
        int b2 = 134;// 134 = 10000110
        int c2 = a2 ^ b2;// = 11111101=253
        System.out.println(c2);


        int d = a >> b;
        int e = a << b;
        System.out.println(d);
        System.out.println(e);

    }
}
