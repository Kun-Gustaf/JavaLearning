package com.zhiyou100;
//double 双精度
public class Demo07_Var {
    public static void main(String[] args) {
        /*
         double 8个字节  [-1.798E308,1.798E308)
         备注：double类型值 可以自由选择在小数的后面添加字母d（大小写都行）
         double类型一般作为浮点数的默认类型
        */
        //描述工资 单位是k
        double wage = 17.5;
        System.out.println(wage);
        //描述体重  单位是kg
        double weight = 89.14;
        System.out.println(weight);

    }
}
