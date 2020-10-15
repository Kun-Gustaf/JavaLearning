package com.zhiyou;
//作业
public class Homework {
    public static  void w(double  weight, double standard){
        if(weight < standard * 0.8){
            System.out.println("你当前的体重不足");
        }else if(weight < standard *0.9){
            System.out.println("你当前的体重有点偏瘦");
        }else  if (weight < standard * 1.1){
            System.out.println("你身材不错哦！");
        }else if(weight < standard * 1.2){
            System.out.println("你当前的身材有点偏胖！");
        }else {
            System.out.println("你就是一个胖子！");
        }
    }
    public static void main(String[] args) {
        /*
            第一道题：给定一个年份判断是闰年还是平年？农历 公历
            是否闰年的判断规则：年份能够被4整除并且不能被100整除的年份
                            或者能被400整除的年份
             第二道题：给定身高体重判断身材比例是否正常？
             第三道题：给定一个年份，一个月份，这个月的第几天，判断改天是该年的第几天？
             分析：

         */
        //第一道题
        /*int year = 2020;//闰年
        if(year % 4 == 0 && year %100 !=0 || year % 400 == 0){
            //表明该年是一个闰年
            System.out.println(year+"是一个闰年");
        }*/

        //第二道题  此处出现的代码的冗余性问题
       /* boolean sex= true;
        int height = 180;//1.8米
        double weight = 70;//70kg
        double standard;
        //判断性别
        if(sex == true){
            //表明你是男性
            standard = (height - 80) * 0.7;
            w(weight ,standard);
        }else {
            //表明你是一个女性
            standard = (height - 60) * 0.7;
            w(weight ,standard);
        }*/

        //  第三道题
        int year = 2020;
        int month = 10;
        int day = 15;
        int today = 0;//today是该年中的第几天
        // 选择结构/分支机构 if else / switch case


        // 第四道题：百分制转换成等级制


        //第五道题
        int number = 565;
        //获取该数字的个位数和百位数


    }
}
