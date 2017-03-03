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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Input the speed limit and the speed of the car
        System.out.print("Enter the speed limit: ");
        int speedlimit = input.nextInt();

        System.out.print("Enter the recorded speed of the car: ");
        int speed = input.nextInt();

        // Create a variable for how many km/h over the speed limit the driver is going.
        int overlimit = speed - speedlimit;

        //show the appropriate fine based on the variable "overlimit"
        if (overlimit <= 0) {
            System.out.println("Congratulations, you are within the speed limit!");
        }
        if (overlimit > 0 && overlimit <= 20) {
            System.out.println("You are speeding and your fine is $100.");
        }
        if (overlimit > 20 && overlimit <= 30) {
            System.out.println("You are speeding and your fine is $270.");
        }
        if (overlimit > 30) {
            System.out.println("You are speeding and your fine is $500.");
        }

    }
}
