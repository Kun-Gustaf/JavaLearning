package com.zhiyou100;
import  java.util.Scanner;
public class Demo05_Homework {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*System.out.println("第一道题：");
        System.out.println("请输入年份：");
        int year = Integer.valueOf(sc.next());
        if(year%4 == 0){
            if(year%400 == 0 )
            {
                System.out.println("该年份是闰年");
            }else if(year%100 ==0){
                System.out.println("该年份是平年");
            }else {
                System.out.println("该年份是闰年");
            }
        }else {
            System.out.println("该年份是平年");
        }*/

        /*System.out.println("第二道题");
        System.out.println("请输入您的性别（true/false）：");
        Boolean sex =Boolean.valueOf(sc.next()) ;
        System.out.println("请输入身高（cm)");
        double height = Double.valueOf(sc.next());
        System.out.println("请输入体重（kg)");
        double weight = Double.valueOf(sc.next());
        double sw=0.0;
        double health = 0.0;
        System.out.println(sex);
        if(sex == true){
            sw =Math.abs(height-80) * 0.7;
            if( weight > sw){
                health = (weight - sw) / sw;
                if(health <= 0.1 ){
                    System.out.println("您的体重正常");
                }else if(health > 0.2){
                    System.out.println("您的体重为肥胖");
                }else{
                    System.out.println("您的体重为过重");
                }
            }else{
                health = (sw - weight) / sw;
                if(health <= 0.1 ){
                    System.out.println("您的体重正常");
                }else if(health > 0.2){
                    System.out.println("您的体重不足");
                }else{
                    System.out.println("您的体重过轻");
                }
            }
        }else {
            sw =Math.abs(height-70) * 0.6;
            if( weight > sw){
                health = (weight - sw) / sw;
                if(health <= 0.1 ){
                    System.out.println("您的体重正常");
                }else if(health > 0.2){
                    System.out.println("您的体重为肥胖");
                }else{
                    System.out.println("您的体重为过重");
                }
            }else{
                health = (sw - weight) / sw;
                if(health <= 0.1 ){
                    System.out.println("您的体重正常");
                }else if(health > 0.2){
                    System.out.println("您的体重不足");
                }else{
                    System.out.println("您的体重过轻");
                }
            }
        }*/


        /*System.out.println("第三道题");
        System.out.println("请输入年份");
        int year = Integer.valueOf(sc.next());
        System.out.println("请输入月份");
        int month = Integer.valueOf(sc.next());
        System.out.println("请输入是几号");
        int day = Integer.valueOf(sc.next());
        int february=28;
        int today=0;
        if( year % 400 ==0){
            february = 29;
        }else if(year % 4 == 0 && year % 100 != 0){
            february = 29;
        }
        switch (month){
            case 1:
                today =day +1;

                break;
            case 2:
                today = day +32;
                break;
            case 3:
                today = day+31+1+february;
                break;
            case 4:
                today = day+31*2+1+february;
                break;
            case 5:
                today = day+93+february;
                break;
            case 6:
                today = day+124+february;
                break;
            case 7:
                today = day+154+february;
                break;
            case 8:
                today = day+185+february;
                break;
            case 9:
                today = day+216+february;
                break;
            case 10:
                today = day+246+february;
                break;
            case 11:
                today = day+277+february;;
                break;
            case 12:
                today = day+307+february;
                break;
        }
        System.out.println("改天是该年的第"+today+ "天");*/


        /*System.out.println("第四道题");
        System.out.println("请输入分数[0-100]");
        int score = Integer.valueOf(sc.next());
        String grade;
        if(score >= 0 && score > 100){
            grade = "输入不正确";
        }else if(score < 60){
            grade = "不及格";
        }else if(score <70){
            grade = "合格";
        }else if(score < 90){
            grade = "良好";
        }else {
            grade = "优秀";
        }
        switch (grade){
            case "不及格":
                System.out.println("不及格");
                break;
            case "合格":
                System.out.println("合格");
                break;
            case "良好":
                System.out.println("良好");
                break;
            case "优秀":
                System.out.println("优秀");
                break;
            default:
                System.out.println("输入不正确");
        }*/

        /*System.out.println("第五道题");
        System.out.println("请输入一个三位的整数");
        int number = Integer.valueOf(sc.next());
        int n1 = number % 10 ;

        int n2 = number / 100;
        if(number < 99 && number > 1000){
            System.out.println("这个数字不是三位的整数");
        }else if(n1 == n2){
            System.out.println("这个数字是回文数字");
        }else{
            System.out.println("这个数字不是回文数字");
        }
        System.out.println(n1 == n2 ? "这个数字是回文数字" : "这个数字不是回文数字");
        */

        /*System.out.println("第六道题");
        System.out.println("请输入三角形的第一条边边长：");
        int sideA = Integer.valueOf(sc.next());
        System.out.println("请输入三角形的第二条边边长：");
        int sideB = Integer.valueOf(sc.next());
        System.out.println("请输入三角形的第三条边边长：");
        int sideC  = Integer.valueOf(sc.next());
        if(sideA + sideB > sideC && sideA+sideC > sideB && sideB+sideC > sideA){
            System.out.println("三角形的周长为" + (sideA+sideB+sideC));
        }else {
            System.out.println("给定的值不合法");
        }

        System.out.println(sideA + sideB > sideC && sideA+sideC > sideB && sideB+sideC > sideA? "三角形的周长为" + (sideA+sideB+sideC):"给定的值不合法");
*/



        System.out.println("第七道题：");//A、55
        int a = 10;
        int b = 3;
        int m = 5;
        if (a == b) {
            m += a;
        } else {
            m = ++ a * m;
            //m = a ++ * m;
        }
        /*
           变量在++运算符的左边，先进行其他运算，再进行自加运算
           变量在++运算符的右边，先进行自加运算，再进行其他运算
         */
        System.out.println(a);
        System.out.println(m);
    }
}
