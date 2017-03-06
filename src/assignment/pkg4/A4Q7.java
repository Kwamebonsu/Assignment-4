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
        if (roll1 > 1 && roll1 < 13) {
            System.out.println("You are now on square " + position2);
        } else if (roll1 == 0) {
            System.out.println("You Quit!");
        }
        if (position2 >=100){
            System.out.println("You won!");
        }
        if (position2 <100){
        System.out.print("Enter sum of dice: ");
        double roll2 = input.nextDouble();
        double position3 = position2 + roll2;
        if (roll2 > 1 && roll2 < 13) {
            System.out.println("You are now on square " + position3);
        } else if (roll2 == 0) {
            System.out.println("You Quit!");
        }
        System.out.print("Enter sum of dice: ");
        double roll3 = input.nextDouble();
        double position4 = position3 + roll3;
        if (roll3 > 1 && roll3 < 13) {
            System.out.println("You are now on square " + position4);
        } else if (roll3 == 0) {
            System.out.println("You Quit!");
        }
        System.out.print("Enter sum of dice: ");
        double roll4 = input.nextDouble();
        double position5 = position4 + roll4;
        if (roll4 > 1 && roll4 < 13) {
            System.out.println("You are now on square " + position5);
        } else if (roll4 == 0) {
            System.out.println("You Quit!");
        }
    }
}
