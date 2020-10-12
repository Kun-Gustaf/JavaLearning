package com.zhiyou100;
//String
public class Demo09_Var {
    public static void main(String[] args) {
        /*
        * String 字符串 描述一个或多个文本信息的时候使用
        * 语法格式：
        *       String 变量名 = "文本信息值";
        *       对于String字符串来说，字符串变量值中的双引号内容可以为空
        *       当双引号里面无任何信息时，表示的是空字符串，它是字符串值的其中一种
        *       String 变量名 = "";空字符串
        *       String 变量名 = " "; 一个空格字符串
        *
        * 算法 + 数据结构 = 程序 尼古拉斯·沃斯 威茨  获得图灵奖
        *
        *
        * */
        //描述一个人的姓名
        String name = "张三";
        //描述一个人的成绩
        double score = 78.9;
        //张三的成绩为78.9
        System.out.println(name+"的成绩为："+score);
        // 描述一个人的国籍
        String country = "中国";
        //描述一个人的民族
        String nation = "汉族";
        //描述一句话夸夸自己
        String word = "我是一个很有潜力的小伙";
        //描述一个人的性别
        String sex = "男性";
        //描述一个人的年龄
        int age = 22;

        System.out.println(name);
        System.out.println(score);
        System.out.println(country);
        System.out.println(nation);
        System.out.println(word);
        System.out.println(sex);
        System.out.println(age);
        //快捷键冲突  图像选项-->快捷键--->禁用
        //快速复制上一行代码到下一行中 ctrl+alt+down() eclipse
        //alt+down/up将整行向上/向下移动
        //java.exe   解释
        //javac.exe  编译
        String empty = "";//空字符串
        String space = " ";// 一个空格字符串
        String str = "null";
        System.out.println(empty);
        System.out.println(space);
        System.out.println(str);
        // 运算符 连接多个变量(前提条件该变量一定是含有值的），使多个变量在运行过程中按照某种规则运行
        //name score, 此时我们需要用到 "+" 运算符
        //语法格式： 变量1+变量2+变量3+......
        //         变量1+"文本信息"+变量2+变量3+......
        //张三的成绩为78.9
        //name+"的成绩为"+score
        System.out.println(name+"的成绩为:"+score);
        /*
        * 等价于
        * System.out.print(name);
        * System.out.print("的成绩为:");
        * System.out.print(score);
        * */
        //张三的成绩为78.9，同时他还是个男性
        //name+"的成绩为"+score+"，同时他还是个"+sex
        System.out.println(name+"的成绩为"+score+"，同时他还是个"+sex);
        /*
         * 等价于
         * System.out.print(name);
         * System.out.print("的成绩为");
         * System.out.print(score);
         * System.out.print("，同时他还是个");
         * System.out.print(sex);
         * */

        //张三的年龄为24，他是中国国籍，民族为汉族
        System.out.println(name+"的年龄为"+age+"，他是"+country+"国籍，民族为"+nation);
    }
}
