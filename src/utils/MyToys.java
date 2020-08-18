/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author TRAN
 */
public class MyToys {

    // danh cho CI/Continuous Intergration, de quy recursion sau
    public static long cF(int n) {
        if (n < 0 || n > 15) {
            throw new IllegalArgumentException("0..15");
        }
        if (n == 0) {
            return 1;
        }
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
