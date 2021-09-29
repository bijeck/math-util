/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sump.mathutil.core;

import static com.sump.mathutil.core.MathUtil.getFactorial;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Administrator
 */
@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {
    
    @Parameters
    public static Object[][] initData(){
        return new Integer[][] {
            {0,1},
            {1,1},
            {2,2},
            {3,6},
            {4,24},
            {5,120},
            {6,720},
            {0,1}
                            };
    }
    @Parameter(value = 0)
    public int input;
    @Parameter(value = 1)
    public long expected;
    
    @Test
    public void chekFactorialGivenRightAgrument(){
        assertEquals(expected,getFactorial(input));

    }
}
