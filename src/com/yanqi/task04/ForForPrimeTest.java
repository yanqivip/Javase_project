package com.yanqi.task04;
/*
    编程使用双重for循环打印2 ~ 100之间的所有素数
 */
public class ForForPrimeTest {

    public static void main(String[] args) {

        // 1.使用for循环打印2 ~ 100之间的所有整数
        for(int i = 2; i <= 100; i++) {

            // 3.声明一个boolean类型的变量作为是否为素数的标记
            boolean flag = true;
            // 2.针对每一个当前的整数都要判断是否为素数，若是素数则打印，否则不打印
            // 判断一个数是否为素数的方法是：若该数不能被2到它本身-1之间的所有整数整除时，则证明该数是素数
            // 使用内层for循环用于控制2到该数自身-1之间的范围
            //for(int j = 2; j < i; j++) {
            // 只需要判断2到该数的平方根即可，因为随着除数的增大商必然减小，会造成重复的判断
            for(int j = 2; j <= Math.sqrt(i); j++) {
                // 使用当前数除以该循环中的每个数据并判断是否可以整除，只要找到一个可以整除的数据，则证明该数不是素数
                if(0 == i % j) {
                    flag = false;
                    break; // 跳出当前所在的内层循环，也就是不需要再继续除以下一个整数
                }
            }

            // 只可以打印素数
            if(flag) {
                System.out.println("i = " + i);
            }
        }
    }
}