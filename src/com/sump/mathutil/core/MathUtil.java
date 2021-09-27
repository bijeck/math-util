/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sump.mathutil.core;

/**
 *
 * @author Administrator
 */
public class MathUtil {
    
    public static long getFactorial(int n){
        if(n<0 || n > 20){
            throw new IllegalArgumentException("Out of range");
        }
        
        if(n == 1 || n ==0) return 1;
        
        long product = 1;
        
        for(int i = 1; i <= n;i++){
            product *=i;
        }
        return product;
    }
}
