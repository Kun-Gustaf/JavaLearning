package com.zhiyou100;
//long 长整数
public class Demo04_Var {
    public static void main(String[] args) {
        /*
            long 长整型 8个字节 9开头的19位数
            在程序中你定义的整数，一般程序会把它当成int类型
            int类型就是整数的默认类型
            对于long类型整数，表示的时候需要在数字后面添加l字母（大小写都行）
          */
        long phone = 18838894881l;
        System.out.println(phone);
        //描述马云资产
        long property = 171000000000l;
        System.out.println(property);
    }
}
