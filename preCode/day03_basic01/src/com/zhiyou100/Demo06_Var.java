package com.zhiyou100;
//float
public class Demo06_Var {
    public static void main(String[] args) {
        /*
        * float 单精度 [-3.403E38,3.403E38)
        * 当在程序中定义一个浮点数（小数）时，程序会解析成double类型
        * 此时需要声明为float类型，那么需要转换格式：在数字的后面添加字母f(大小写都行)
        * */

        //描述圆周率Π
        float Π = 3.14f;
        System.out.println(Π);
        //描述科学数字
        float snt=3.1415927f;
        System.out.println(snt);//3.1415925
        float mol = 6.02214076E23f;

        System.out.println(mol);

        float sns = 3333333333.1415926f;//3*10^9 --->3.33333325E9 = 3.33333325*10^9
        System.out.println(sns);
    }
}
