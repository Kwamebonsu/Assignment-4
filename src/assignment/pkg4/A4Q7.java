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

        //Set the starting position to 1
        int position = 1;

        //create a loop
        while (true) {

            //Tell the player to what square they are on then ask them to roll again.
            System.out.println("You are now on square " + position + ".");

            System.out.print("Enter the sum of dice: ");
            int roll = input.nextInt();

            //Informs the player if the he enters an invalid sum
            if (roll != 0 && roll < 2 || roll > 12) {
                System.out.println("Invalid sum!");
            }
            //Ends the game if the player enters 0 as the sum
            if (roll == 0) {
                System.out.println("You Quit!");
                break;
            }
            //while the position is less than 100, add the position to the sum to find the new position
            if (position < 100) {
                position = position + roll;

                //Move to the top of the ladder if the player lands at the bottom of a ladder
                if (position == 9) {
                    System.out.println("Congratulations! You landed on a ladder!");
                    position = 34;
                }

                if (position == 40) {
                    System.out.println("Congratulations! You landed on a ladder!");
                    position = 64;
                }

                if (position == 67) {
                    System.out.println("Congratulations! You landed on a ladder!");
                    position = 86;
                }

                //Move to the bottom of the snake if the player lands at the top of a snake
                if (position == 54) {
                    System.out.println("Oh no! You landed on a snake!");
                    position = 19;
                }

                if (position == 90) {
                    System.out.println("Oh no! You landed on a snake!");
                    position = 48;
                }

                if (position == 99) {
                    System.out.println("Oh no! You landed on a snake!");
                    position = 77;
                }

            }
            //if the player reaches square 100, the ends
            if (position == 100) {
                System.out.println("You won!");
                break;
            }
            //Ask the player to roll again if the he rolls a number that would put him past square 100
            if (position > 100) {
                position = position - roll;
                System.out.println("You can't move that many spaces!");
            }

        }

    }
}
