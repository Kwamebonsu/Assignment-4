/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg4;

import java.util.Scanner;

/**
 *
 * @author bonsk5852
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        //input measurement in inches
        System.out.println("Please enter the measurement in inches you wish to convert:");
        double number1 = input.nextDouble();

        //find the product
        double product = number1 * 2.54;
        System.out.println(number1 + " inches is the same as " + product + " cm!");
    }
}
