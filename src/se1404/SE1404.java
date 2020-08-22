/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1404;

import java.util.Scanner;
import utils.MyToys;

/**
 *
 * @author TRAN
 */
public class SE1404 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(MyToys.total(8));
        System.out.println("5! = " + MyToys.cF(5)); // hy vong 120
        System.out.println("6! = " + MyToys.cF(6)); // hy vong 720
        System.out.println("6! = " + MyToys.cF(0)); // expected 720
        System.out.println("6! = " + MyToys.cF(-5)); // expected 720
        // chui user dua tham so ca tron 
        
    }

}
