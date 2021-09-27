/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sump.mathutil.core;

import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author Administrator
 */
public class FactorialTest {

    public FactorialTest() {
    }
    
    @Test
    public void chekFactorialGivenRightAgrument(){
        Assert.assertEquals(1,MathUtil.getFactorial(1));
        Assert.assertEquals(1,MathUtil.getFactorial(0));
        Assert.assertEquals(6,MathUtil.getFactorial(3));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void chekFactorialGivenWrongArgumentIllegal(){
        MathUtil.getFactorial(-5);
//        MathUtil.getFactorial(18);
        MathUtil.getFactorial(23);
    }
    
}
