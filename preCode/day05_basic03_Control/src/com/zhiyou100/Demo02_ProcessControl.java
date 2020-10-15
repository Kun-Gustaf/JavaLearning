package com.zhiyou100;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

//选择结构
public class Demo02_ProcessControl {
    public static void main(String[] args) {
        /*
            选择结构：程序有选择性的去执行某一行或某几行代码、
            有两种常用语句：if else语句   switch case语句
         */

        //if else 语句
        /*
         if 如果
           在if语句后面紧跟的是某一种情形或者条件 布尔类型的表达式
           语法规则：(布尔类型的表达式)
           {
                如果这种情形或者条件成立，那么程序就会进入到if后面紧邻的{}内部
                后面紧邻的花括号{}可以选择忽略不写，但是不推荐。
            }
            如果if后面跟的是一种情形，我们也成为if else中的单支(情形/条件）语句
            如果if后面跟的是多种情形，我们也称之为if else中的多支(情形/条件)语句，有else语句

        */

        //单支语句 if(条件语句){条件成立时，程序需要执行的代码}
        boolean isFree = false;//true 有空 false 没空
        if (isFree) {
            System.out.println("我去找你玩去。。。");
        }
        boolean isMoney = false;//false 没钱 true 有钱
        if (isMoney) {
            System.out.println("我就要资助贫困山区的孩子们！！！！");
        }
        //多支语句
        /*else 否则，其他
         * 语法结构：
         *       if(条件1/情形1){
         *          条件1/情形1成立时，程序需要执行的代码1...
         *           .
         *           .
         *       }else if(条件2/情形2){
         *           条件2/情形2成立时，程序需要执行的代码2...
         *           .
         *           .
         *       }else if(条件n/情形n){
         *           条件n/情形n成立时，程序需要执行的代码n...
         *           .
         *           .
         *       }
         * 备注：在多支语句中，这多种情形是一种互斥关系，非你即我，只有一种情形会成立，程序也只会执行条件里面的一种代码
         *      在多支语句中，如果最后一种情形包含了它以上情形之外的所有情形，那么该种情形也可以这样表达:省略if(条件)
         * */
        String traLight = "黄灯";// 红灯停，绿灯通行   黄灯 等待
        if (traLight == "红灯") {
            System.out.println("停下");
        } else if (traLight == "绿灯") {
            System.out.println("通行");
        } else {
            System.out.println("等待");
        }


        //嵌套语句：在某种情形下，内部又可以分化为多种情形
        String rule = "靠右行驶";
        if (traLight == "红灯") {
            System.out.println("停下");
        } else if (traLight == "绿灯") {
            System.out.println("通行安全");
        }
        if (rule == "靠右行驶") {
            System.out.println("通行安全");
        }

        String employee = "华为员工";
        String welfare = "缴纳五险一金";
        String all = "缴纳五险";

        if (employee == "华为员工") {
            if (welfare == "缴纳五险一金") {
                if (all == "缴纳五险") {
                    System.out.println("该公司真是好公司");
                } else {
                    System.out.println("该公司好坏啊！！！");
                }

            } else {
                System.out.println("该公司真黑啊！🐉🐍🐎🕷🐕🐖🐂🐏");
            }
        }
        /*
         练习题：
               1.
               60-70普通班
               70-80 珍珠班
               80-90 尖子班
               90-100 状元班
               100分 1v1 名师班
         */

        //第一道题
        int score = 85;//[0,100]
        // 第一步对数据的合法性验证
        if(score < 0 || score > 100){
            System.out.println("您的成绩不合法，请重新确认后再次录入。");
        }
        if(score < 60){
            System.out.println("进不去");
        }else if (score < 70) {
            System.out.println("普通班");
        } else if (score < 80) {
            System.out.println("珍珠班");
        } else if (score < 90) {
            System.out.println("尖子班");
        } else if (score < 100) {
            System.out.println("状元班");
        } else {
            System.out.println("名师班");
        }

        //第二道题
        int a = 25;
        int b = 16;
        int c = 19;
        if (a >= b) {
            if (a >= c) {
                System.out.println("最大值是" + a);
            } else {
                System.out.println("最大值是" + c);
            }
        } else {
            if (b >= c) {
                System.out.println("最大值是" + b);
            } else {
                System.out.println("最大值是" + c);
            }
        }

        //第三道题
        String sex = "男性";
        int income = 30000;
        if (sex == "男性") {
            if (income >= 8000) {
                System.out.println("你可以找另一半结婚了");
                if (income >= 20000) {
                    System.out.println("你就是女性眼中的高富帅");
                }
            } else {
                System.out.println("你就是女性眼中的屌丝");
                System.out.println("你不具备结婚条件");
            }
        } else {
            if (income >= 3000) {
                System.out.println("你可以找另一半结婚了");
                if (income >= 12000) {
                    System.out.println("你就是男性眼中的白富美");
                }
            } else {
                System.out.println("你就是男性眼中的女屌丝");
                System.out.println("你不具备结婚条件");
            }
        }

        //  第四道题：
        String username = "likun";
        String pass = "adsdfagf";
        if (username == "likun") {
            if (pass == "adsdfag") {
                System.out.println("恭喜你登录成功!");
            } else {
                System.out.println("您输入的密码不正确，请重新输入!");
            }
        } else {
            System.out.println("您输入的用户名不正确，请快速注册去！");
        }

    }
}
