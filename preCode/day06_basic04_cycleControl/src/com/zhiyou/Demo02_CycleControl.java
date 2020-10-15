package com.zhiyou;
//while循环
public class Demo02_CycleControl {
    public static void main(String[] args) {
        /*
               while循环
                    语法格式：
                      1.初始化部分
                      while(2.布尔类型的表达式 ){
                            3.循环体代码;
                            4.迭代部分；
                      }
                    执行过程：
                            1---》2---》3---》4---》2---》3---》4......---》2 循环结束，程序跳出循环
          */
        //需求1： 1+2-3+4-5+6-7+......+100;
        int i = 2;//1.初始化部分
        int sum = 1;
        while (i <= 100){//2.循环条件部分
            //奇数和偶数的判定 3.循环体代码
            if(i %2 != 0){
                sum -= i;
            }else {
                sum += i;
            }
            i++;//迭代部分
        }
        System.out.println(sum);

        //需求2：求一下任意给定的数是否为所有的质数。
        // 质数：除了1和本身能被整除之外，其余都不能整除的数就称为质数,1除外。
        //思路：；那这个数本身去除以从2开始的数，一直除到这个数本身 如果之间有任何一个数能被整除，那么该数字就不是质数
        //判定除的结果余数不能为0，
        int num = 59 ;
        int j = 2;
        boolean isPrime = true;// true 是质数  false 不是质数  开关技术
        while ( j < num ){
            //
            if(num % j == 0){
                isPrime = false;//不是质数
                break;//停止当前正在执行的语句结构
            }
            j++;//迭代部分
        }
        if(isPrime == true){

            System.out.println(num + "是一个质数。");
        }




    }
}
