package com.zhiyou100;
//三目运算符  ? :
public class Demo06_Operator {
    public static void main(String[] args) {
        /*
            三目运算符 ? :
            语法格式：
                    布尔类型值(表达式) ? 该布尔类型值为真的结果值 : 该布尔类型值为假的结果值
            结果值要依据布尔类型值表达式，当表达式为真，结果就是紧邻问号"?"后面的结果值
            当表达式为假的时候，结果就是冒号":"后面的结果值
        */
        // 第一种用法：直接在输出语句中使用
        System.out.println(13>12?"大":"小");
        int a = 10;
        int b = 20;
        System.out.println(a > b ? "a > b? "  : "a < b √" );
        System.out.println(a < b ? true : false);
        System.out.println(a <= b ? "a <= b √" : false);
        System.out.println(a >= b ? a : b);
        //第二种用法：在语句中使用(不是输出语句) 赋值运算中
        int c = a > b ? a : b;//获取的是a、b的最大值
        String d = a > b ? "是真的吗？" : "你是假的!";
        System.out.println(c);//20
        System.out.println(d);//你是假的!
        //说明：如果三目运算符是在输出语句中，那么对三目运算符的结果值真假的数据类型不要求
        //如果不是在输出语句中，在其他的语句中，如赋值语句，那么就需要严格控制三目运算符的结果值真假的数据类型
        //真假的结果值类型要一致，保持和赋值运算中的变量数据类型一致。

    }
}
