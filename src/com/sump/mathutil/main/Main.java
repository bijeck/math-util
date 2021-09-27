/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sump.mathutil.main;

import com.sump.mathutil.core.MathUtil;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
//        MathUtil.getFactorial(-5);
        System.out.println("0! : 1 ? "+MathUtil.getFactorial(1));
        System.out.println("2! : 2 ? "+MathUtil.getFactorial(2));
        System.out.println("3! : 3 ? "+MathUtil.getFactorial(3));
        System.out.println("4! : 4 ? "+MathUtil.getFactorial(4));
    }
}
