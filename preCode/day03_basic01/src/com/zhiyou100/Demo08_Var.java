package com.zhiyou100;
//char 字符型
public class Demo08_Var {
    public static void main(String[] args) {
        /*
         char 字符型 一般只能表示一个字符
         描述一个文本信息
         注意：当在char类型变量中定义多个字符值时，程序会抛出错误
         */
        //描述一个汉字
        char  ch='张';
        char ch02 = '三';
        System.out.println(ch);
        System.out.println(ch02);
        //描述一个英文字母
        char letter = 'a';
        System.out.println(letter);

        //描述一个数字
        char number = '1';
        System.out.println(number);

        //描述一个符号
        char symbol = '$';
        System.out.println(symbol);
    }
}
