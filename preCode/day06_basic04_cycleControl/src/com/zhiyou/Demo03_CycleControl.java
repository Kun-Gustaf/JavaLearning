package com.zhiyou;
// do-while 循环
public class Demo03_CycleControl {
    public static void main(String[] args) {
        /*
            do-while 循环
                本质就是一个while循环结构
                语法结构：
                        1.初始化部分
                        do{

                            3.循环体代码
                            4.迭代部分
                        }while(2.循环条件);
                 区别： do-while循环结构中的循环体代码会先执行一次，然后再判断循环条件是否成立
                       如果循环条件成立，那么程序会再次进入while循环结构中，执行循环体代码
                       如果循环条件不成立，那么循环结构语句结束，程序跳出该循环结构
                 执行过程
                        1--》3--》4--》2--》3--》4--》2--》3--》4--》......--》2 循环结束

         */
         //需求：求前100项能被3整除或者能被5整除或者能被7整除的但是不能被2整除的数的和
        int sum = 0;
        int i = 1;
        do{
            if( i % 2 != 0){
                if(i % 3 == 0 || i % 5 == 0 || i %7 ==0 ){
                    sum += i;
                }
            }
            i++;
        }while (i <= 100);
        System.out.println("前100项能被3整除或者能被5整除或者能被7整除的但是不能被2整除的数的和为:"+sum);
    }
}
