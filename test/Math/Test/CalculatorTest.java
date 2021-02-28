/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Math.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import Math.Calculator;
/**
 *
 * @author PC
 */
public class CalculatorTest {
    public CalculatorTest(){
	
    }
    
    @Test // bien ham nay thanh public static voi main
    //quy tac dat ten ham cho viec test phan mem: rat nhieu quy tac
    // nhung noi chung ten ham se bao gom ngu nghia ket qua tra ve, trinh trang test
    // khongo giong quy tac dat ten ham khi viet app
    //minh dang viet code de test app
    
    //minh muon test ham tra ve ngon neu dua tham so ngon
    public void getFactorial_UnitTest(){
        assertEquals(120, Calculator.Factorial(5));
        // check coi co dung la goi ham 5! co tra ve 120 hay ko
        //co = xanh, ko=do?
        assertEquals(720, Calculator.Factorial(6));
        assertEquals(24, Calculator.Factorial(4));
        assertEquals(6, Calculator.Factorial(3));
        assertEquals(1, Calculator.Factorial(0));
        assertEquals(1, Calculator.Factorial(1));
        assertEquals(6, Calculator.Factorial(3));
	//assertEquals(1, Calculator.Factorial(0));
    }
    
    
    @Test
    public void getEquation_Test(){
	assertEquals(0,Calculator.equation(2, 4, 1));
	assertEquals(1,Calculator.equation(4, 4, 1));
	assertEquals(0,Calculator.equation(3, 4, 1));
	assertEquals(2,Calculator.equation(5, 4, 1));
    }
}
