
import junit.framework.Assert;
import utils.Arithmetic;
import org.junit.Test;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author inishbashyal
 */
public class ArithmeticTest {
    Arithmetic arithmetic;
    @Test
    public void testAdd(){
        arithmetic = new Arithmetic(2,3);
        int expectedValue = 5;
        int actualValue = arithmetic.add();
        Assert.assertEquals(expectedValue, actualValue);
    }
    
    
}
