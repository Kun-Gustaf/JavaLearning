package com.zhiyou100;

public class Demo01_Var {
    public static void main(String[] args) {
        /* 多行注释
            变量：
                变量的数据类型 变量名 = 变量值；
                数据类型
                  基本型：
                     数值型（整数）
                     布尔型 boolean
                     浮点型 float  double
                     字符型 char 张 / 三
                  引用型：
                     String 字符串
                数值型（整数）：
                     0-128 19  20 (0,128) 小括号不包含该值
                                  [0,128)   中括号包含该值
                     byte 字节 1个字节  1byte=8bit 2^7=128
                     short 短整型 2个字节 2^15 32768
                     int integer 整数 2^31 21开头的10位数  2 147 483 648
                     long 长整型 整数 2^63  922 3372 0368 5477 5808 9开头的19位数
                     整数类型取值范围从小到大
                     byte < short < int < long
                布尔型：
                    boolean 定义开关
                    该类型只有两种结果值
                    true 真
                    false 假
                    当满足某一种情形时，走true结果值
                    当不满足某种情形时，走false结果值
                浮点型：小数型
                    单精度型 float -3.403E38~3.403E38 E代表的是10 E后面的数字是10的指数 100 = 10^2
                                  描述的是整个该数字=整数+后面的小数
                    双精度型 double -1.798E308~1.798E308 E代表的是10 E后面的数字是10的指数 100 = 10^2
                                  描述的是整个该数字=整数+后面的小数
                字符型：char character
                      char类型的变量中值 只能填写一个字符 不能为空 语法格式：'字符值'
                引用型：
                    String 字符串

         */
        byte age = 20;
        // 把age变量值输出到控制台中
        //单行注释 注释的内容要写到双斜杠的右面
        System.out.println("这是我人生中的第n段代码");
        System.out.println(age);
        byte weight = 70;
        System.out.println(weight);
        byte wage = 12;
        System.out.println(wage);
        byte height = 127;
        System.out.println(height);
        // 备注 对于byte类型 [0,128) 赋值不能超出该范围

    }
}
