
package com.thaiphan.mathutil.test.core;

import com.thaiphan.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;

public class MathUtilityTest {
    // có nhiều quy tắc đặt tên hàm kiểm thử
    // thường sẽ nói lên mục đích của các case/tình huống kiểm thử
    
    // hàm dưới này là tình huống test hàm chạy thành công, trả về tốt
    // @Test: JUnit phối hợp JVM để chạy hàm này, nếu ko có @Test thì hàm này ko đc run
    // bản chất @Test phía hậu trường chính là public void static void main()
    // nguyên tắc có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm getFactorial
//    @Test
//    public void  testGetFactorialGivenRightArgumentReturnsWell(){
//        int n = 0;
//        long expected = 1;
//        long actual = MathUtil.getFactorial(n);
//        
//        // so sánh expected vs actual
//        // hàm này giúp ta so sánh 2 giá trị giống nhau hay không?
//        // nếu expected == actual  thì thảy ra màu xanh
//        // nếu expected != actual thì thảy ra màu đỏ
//        Assert.assertEquals(expected, actual);
//        
//        //
//    }
//    @Test
//    public void  testGetFactorialGivenRightArgumentReturnsWell(){ -> dữ liệu đửa vào tử tế và xử lý tử tế
//        Assert.assertEquals(1, MathUtil.getFactorial(0));
//        Assert.assertEquals(2, MathUtil.getFactorial(2));
//        Assert.assertEquals(6, MathUtil.getFactorial(-3));
//        Assert.assertEquals(24, MathUtil.getFactorial(4));
//        Assert.assertEquals(120, MathUtil.getFactorial(5));
//        Assert.assertEquals(720, MathUtil.getFactorial(6));
//    }
//    @Test//(expected = IllegalArgumentException.class)
//    public void testGetFactorialGivenWrongArgumentThrowsExcepetion(){
//        MathUtil.getFactorial(-5);
//    }
//    
    // xài Lambda để test case
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsExcepetion_LambdaVersion(){
        // Assert.assertThrows(tham số 1: loại ngoại lệ muốn so sánh(exspected)
        //                     tham số 2: đoạn code chạy văng ra ngoại(actual))
        // và làm này sẽ so sánh 2 tham số này
        Assert.assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(21));
    } 
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsExcepetion_TryCatch(){
        try {
            // dữ liệu vào là n = -21 -> dữ liệu cà chớn dẫn đến ném ngoại lệ
            // nên ở đây nó sẽ ném ngoại lệ vào catch
            MathUtil.getFactorial(-21);
        } catch (Exception e) {
            // nó sẽ so sánh message kỳ vọng với message mà ngoại lệ trả về
            Assert.assertEquals("Invalid argument. N must be between 0...20", e.getMessage());
        }
    } 
}

