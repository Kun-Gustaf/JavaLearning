package com.zhiyou100;

public class Homework {
    public static void main(String[] args) {

        //  第一道题:
        /*int a = 20;
        int b = 7;
        double c = 5;
        int d = a / b;//求商数 2
        System.out.println(a + "/" +b + "=" + (a /b));// 20 / 7 = 2
        System.out.println(a + "%" + b + "=" + (a % b));// 20 % 7 = 6
        System.out.println(a + "/" + c + "=" + (a / c));//  20 / 5 = 4.0
        System.out.println(a + "%" + c + "=" + (a % c));//  20 % 5 = 0.0*/

        //第二道题：
        /*int x = 20;
        int a = x + x ++;
        System.out.println("a = "+ a);//40
        System.out.println("x="+x);//21
        int b = x + ++x;//21 + 22 = 43
        System.out.println("b="+b);
        System.out.println("x="+x);
        int c = x + x--;
        System.out.println("c="+c);
        System.out.println("x="+x);
        int d = x + --x;
        System.out.println("d ="+d);
        System.out.println("x="+x);*/

        //第三道题
        /*boolean w,x,y,z;
        int a = 15;
        int b = 2;
        double c = 15;
        w = a > b && a == c || b > c;// boolean true/false
        x = a > b;//    true
        y = a < b;//    false
        z = a != b;//   true
        System.out.println("w="+w);
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);*/


        //第四道题
        /*int a = 15;
        int b = 2;
        int x = a & b;
        int y = a | b;
        int z = a ^ b;
        System.out.println(a + "&"+b +"="+x);
        System.out.println(a + "|"+b + "="+y);
        System.out.println(a + "^" + b + "=" + z);*/

        //第五道题
        int i = 5;
        int j = 5;
        int m = 5;
        int n = 5;
        i++;
        j= j+1;
        m--;
        n = n-1;
        System.out.println(i);
        System.out.println(i++);
        System.out.println(++i);
        System.out.println(i--);
        System.out.println();
        System.out.println(j);
        System.out.println(j++);
        System.out.println(j--);
        System.out.println(--j);
        System.out.println();
    }
}
