/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thaiphan.mathutil.core;
public class MathUtil {
    // hàm tính giai thừa
        // n! = 1.2.3.4....n
        // không tính gia thừa âm
        // 0! = 1! = 1
    public static long getFactorial(int n){
        if(n == 1 || n == 0) return 1;
        if(n < 0 || n > 20){ // đưa dữ liệu cà chớn -> dùng phương pháp ném ngoại lệ
            throw new IllegalArgumentException("Invalid argument. N must be between 0...20");
        }
        long ans = 1;
        for(long i = 2; i <= n; i++){
            ans = ans * i;
        }
        return ans;
    }
    
}
