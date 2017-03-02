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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        //input 4 numbers on seperate lines
        System.out.println("Please enter 4 numbers on seperate lines.");

        double number1 = input.nextDouble();
        input.nextLine();
        double number2 = input.nextDouble();
        input.nextLine();
        double number3 = input.nextDouble();
        input.nextLine();
        double number4 = input.nextDouble();

        //output the numbers on the same line
        System.out.println("Your numbers were " + number1 + " " + number2 + " " + number3 + " and " + number4 + ".");
    }
}
