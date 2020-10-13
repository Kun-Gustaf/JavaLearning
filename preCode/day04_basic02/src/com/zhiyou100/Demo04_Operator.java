package com.zhiyou100;
//逻辑运算符 logic
public class Demo04_Operator {
    public static void main(String[] args) {
        /*
            逻辑运算符 与&   或|    非!
            在程序中，运算的是布尔类型值(可以是具体的true或者false,也可以是布尔类型的表达式)
            结果依然是布尔类型值。
        */
        //与运算 &
        boolean bool = false;
        boolean bool2 = false;
        boolean bool3 = bool & bool2;//逻辑运算中的与运算

        System.out.println(bool3);//false / true / false / false
        //说明：与运算符 在程序运算过程中，只要有一个false,结果就是false，否则为true
        //或运算 |
        boolean var01 = false;
        boolean var02 = true;
        boolean var03 = var01 | var02;
        System.out.println(var03);//true   / true / true / false
        // 说明：或运算符，在程序运算过程中，只要有一个为true,结果就为true,否则为false。


        // 非运算 !
        boolean var04 = false;
        boolean var05 = true;
        boolean var06 = !var04;// true //  semicolon 分号 ;;;;;;;;
        System.out.println(var06);
        // 说明：  非运算符，在程序中运算中，一般只能连接一个布尔类型值，而且非运算符只能放在布尔类型值的左边
        //        结果就是对连接的该布尔类型值取相反结果。

        // 异或    ^ 异或运算符
        boolean var07 = false;
        boolean var08 = false;
        boolean result = var07 ^ var08;
        System.out.println(result);
        //说明：  异或运算符，在程序中运算中，同为false,异为true
        //       如果异或运算符连接的左右布尔类型变量(表达式)的值相同，结果为false
        //       如果异或运算符连接的左右布尔类型变量(表达式)的值不相同，结果为true
        //备注：如果和或运算符做对比，不同之处，当左右都为true的时候，结果为false。
        //拓展：与& && 或| || 非! !! 非非即为true  异或^   ^^-->不可以
        boolean bool4 = true;
        boolean bool5 = false;
        boolean bool6 = bool4 &&  bool5;
        System.out.println(bool6);
        //在程序中，与运算符，通常使用的双& &&
        //& 与 && 异同点：相同点：都是做与运算，不同点，&&可以实现断路(短路)
        //备注：短路效果，当&&符号左边的布尔类型值可以确定为false的时候，
        // 那么程序在执行到&&符号的时候，会发生跳跃，也就是&&后面的表达式程序不在执行了。
        // 或运算符 || 效果等同于 &&，在程序中，通常使用的是"||"
        boolean bool7 = true;
        boolean bool8 = false;
        boolean bool9 = bool7 || bool8;
        boolean bool10 = !!!!bool9;
        System.out.println(bool9);//true
        System.out.println(bool10);//false / true / false / true ......
        //备注：||运算符，在程序运算中，如果||连接的左边的布尔类型值为true,那么程序也会发生跳跃，形成短路现象。

    }
}
