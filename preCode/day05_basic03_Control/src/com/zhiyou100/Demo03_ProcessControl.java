package com.zhiyou100;
//switch case 语句

public class Demo03_ProcessControl {

    public static void main(String[] args) {
        /*
         switch case 语句
         语法结构：
               switch(表达式/变量){
                   case 值1(就是具体的数据)：
                       语句1/代码1；
                   case 值2(同上):
                       语句2/代码2；
                   case 值3(同上)：
                       语句3/代码3；
                   ......
                   case 值n(同上)：
                       语句n/代码n;
                   default:
                       语句n+1/代码n+1;
               }
               备注： 1.如果switch(变量) 需要在switch语句上面先定义或者声明出来；
                     当变量的值等于值1的时候，程序就会执行值1冒号后面的内容；
                     当变量的值等于值2的时候，程序就会执行值2冒号后面的内容；
                     以此类推下去
                     当变量的值等于值n的时候，程序就会执行值冒号后面的内容；
                     当变量的值都不满足以上所有的情形时，程序执行default冒号后面的内容。
                     2.case后面的值的数据类型要和switch(变量)的数据类型保持一致
                     3.避免穿透现象，需要跳出语句    break continue
                       需要显式的声明在case情形语句中的最后一行。通常使用break进行程序的跳出
                     4.switch(表达式/变量)中的值的数据类型可以是以下：
                       byte short int char String 枚举
                     5.case 后面的值 不能是不确定的值，必须是很确定的值。
                     5.case 情形之间也是一种互斥关系。非你即我。

         */
        //  描述一个人的一生的状态
        String status = "成长期";

        switch (status){
            case "婴幼期":
                System.out.println("吃奶。。。"); break;
            case "成长期":
                System.out.println("拥有强烈的好奇心"); break;
            case "成熟期":
                System.out.println("看淡人世间的名与利"); break;
            case "衰老期":
                System.out.println("颐养天年,走走看看人世间的花花绿绿");break;
            case "死亡期":
                System.out.println("看淡一切");break;
            default:
                System.out.println("长生不老");

        }
        // 动物的寿命
        int life = 15;
        switch (life){
            case 1:
                System.out.println("只能活1年");
                break;
            case 10:
                System.out.println("只能活10年");
                break;
            case 15:
                System.out.println("只能活15年");
                break;
            case 100:
                System.out.println("只能活100年");
            case 800:
                System.out.println("你的寿命能达到800年");
                break;
            default:
                System.out.println("你不在自然界之中");
        }

        //Servlet = Server + Applet
    }
}
