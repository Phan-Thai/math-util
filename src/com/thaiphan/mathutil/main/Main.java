/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thaiphan.mathutil.main;

import com.thaiphan.mathutil.core.MathUtil;


public class Main {
    public static void main(String[] args) {
        
        // thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế hay không
        // ta đưa các tình huống sử dụng hàm trong thực tế
        // ví dụ đưa vào -5, 0 , 20, 23
        long expected = 120;
        int n = -3;
        long actual = MathUtil.getFactorial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual + " actual");
    }
}
