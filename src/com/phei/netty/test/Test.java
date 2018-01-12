package com.phei.netty.test;

/**
 * Created by zhangshaolin on 2018/1/8.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-1));
        System.out.println(Integer.toBinaryString(2));
        System.out.println(Integer.toBinaryString(-2));
        System.out.println(Integer.toBinaryString(3));
        System.out.println(Integer.toBinaryString(-3));
        System.out.println(isPowerOfTwo(2));
    }
    private static boolean isPowerOfTwo(int val) {
        return (val & -val) == val;
    }
}
