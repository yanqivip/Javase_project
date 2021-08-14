package com.yanqi.task03;
/*
    编程实现位运算符的使用
 */
public class BitTest {

    public static void main(String[] args) {

        // 1.声明两个byte类型的变量并初始化
        byte b1 = 11;
        byte b2 = 13;
        // 2.打印变量的数值
        System.out.println("b1 = " + b1); // b1 = 11
        System.out.println("b2 = " + b2); // b2 = 13

        System.out.println("---------------------------------------------------");
        // 3.实现位运算符的使用
        // b1的二进制为： 0000 1011
        // b2的二进制为： 0000 1101
        System.out.println( b1 & b2);  // 按位与：同1为1，一0为0      按位与后的二进制为：0000 1001  => 转为十进制是：9
        System.out.println( b1 | b2);  // 按位或：一1为1，同0为0      按位或后的二进制为：0000 1111  => 转为十进制是：15
        System.out.println( b1 ^ b2);  // 按位异或：相同为0，不同为1  按位异或的二进制为：0000 0110  => 转为十进制是：6
        System.out.println( ~ b1);     // 按位取反：1为0,0为1         按位取反的二进制为：1111 0100
        // 二进制1111 0100转为十进制 => 先减1: 1111 0011 => 按位取反：0000 1100 => 转为十进制：12  => 添加负号：-12
    }
}