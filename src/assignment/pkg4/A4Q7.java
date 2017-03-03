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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("You are on square 1.");
        
        System.out.print("Enter sum of dice: ");
        double roll1 = input.nextDouble();
        double position2 = 1 + roll1;
        if(roll1 > 1 && roll1 <13){
            System.out.println("You are now on square " + position2);
        }
        
        
    }
}
