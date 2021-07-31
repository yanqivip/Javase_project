package com.yanqi.task03;
/*
    编程实现移位运算符的使用
 */
public class MoveBitTest {

    public static void main(String[] args) {

        // 1.声明一个byte类型的变量并初始化
        byte b1 = 13;
        // 2.打印变量的数值
        System.out.println("b1 = " + b1); // b1 = 13

        System.out.println("---------------------------------------------------");
        // 3.移位运算符的使用
        // 13的二进制是：... 0000 1101  => 左移1位的结果是：... 0001 1010 => 换算为十进制整数是：26
        //byte b2 = b1 << 1; // 错误: 不兼容的类型: 从int转换到byte可能会有损失   自动提升为int类型，也就是32位二进制
        byte b2 = (byte)(b1 << 1);
        System.out.println("b2 = " + b2); // 26
        System.out.println(b1 << 1); // 26    左移1位相当于当前整数的数值*2
        System.out.println(b1 << 2); // 52    左移2位相当于当前整数的数值*4

        System.out.println("---------------------------------------------------");
        // 13的二进制是：... 0000 1101 => 右移1位的结果是：... 0000 0110 => 换算为十进制整数是：6
        System.out.println(b1 >> 1); // 6     右移1位相当于当前整数的数值/2
        System.out.println(b1 >> 2); // 3     右移2位相当于当前整数的数值/4

        System.out.println("---------------------------------------------------");
        // 逻辑右移   对于非负数来说，逻辑右移和右移的效果一致
        System.out.println(b1 >>> 2); // 3
    }
}