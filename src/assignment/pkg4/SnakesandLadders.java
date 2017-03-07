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
public class SnakesandLadders {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        System.out.println("You are on square 1.");


        System.out.print("Enter sum of dice: ");
        int sum1 = input.nextInt();
        if (sum1 < 2 || sum1 > 12) {
            System.out.println("You Quit!");
        } else if (sum1 >= 2 && sum1 <= 12) {
            int position1 = 1 + sum1;

            if (position1 == 9) {
                int position2 = position1 + 25;
                System.out.print("You found a Ladder! ");
                System.out.println("You are now on square: " + position2);
            }
            if (position1 == 40) {
                int position2 = position1 + 24;
                System.out.print("You found a Ladder! ");
                System.out.println("You are now on square: " + position2);
            }
            if (position1 == 67) {
                int position2 = position1 + 19;
                System.out.print("You found a Ladder! ");
                System.out.println("You are now on square: " + position2);
            }

            if (position1 == 54) {
                int position2 = position1 - 35;
                System.out.print("Oh no! You found a Snake! ");
                System.out.println("You are now on square: " + position2);
            }
            if (position1 == 90) {
                int position2 = position1 - 42;
                System.out.print("Oh no! You found a Snake! ");
                System.out.println("You are now on square: " + position2);
            }
            if (position1 == 99) {
                int position2 = position1 - 22;
                System.out.print("Oh no! You found a Snake! ");
                System.out.println("You are now on square: " + position2);
            }
            if (position1 != 9 && position1 != 40 && position1 != 67 && position1 != 54 && position1 != 90 && position1 != 99) {
                int position2 = position1;
                System.out.println("You are now on square: " + position2);
            }

            System.out.print("Enter sum of dice: ");
            int sum2 = input.nextInt();
            if (sum2 < 2 || sum2 > 12) {
                System.out.println("You Quit!");
            } else if (sum2 >= 2 && sum2 <= 12) {
                int position3 = position2 + sum2;

                if (position3 == 9) {
                    int position4 = position3 + 25;
                    System.out.print("You found a Ladder! ");
                    System.out.println("You are now on square: " + position4);
                }
                if (position3 == 40) {
                    int position4 = position3 + 24;
                    System.out.print("You found a Ladder! ");
                    System.out.println("You are now on square: " + position4);
                }
                if (position3 == 67) {
                    int position4 = position3 + 19;
                    System.out.print("You found a Ladder! ");
                    System.out.println("You are now on square: " + position4);
                }

                if (position3 == 54) {
                    int position4 = position3 - 35;
                    System.out.print("Oh no! You found a Snake! ");
                    System.out.println("You are now on square: " + position4);
                }
                if (position3 == 90) {
                    int position4 = position3 - 42;
                    System.out.print("Oh no! You found a Snake! ");
                    System.out.println("You are now on square: " + position4);
                }
                if (position3 == 99) {
                    int position4 = position3 - 22;
                    System.out.print("Oh no! You found a Snake! ");
                    System.out.println("You are now on square: " + position4);
                }
                if (position3 != 9 && position3 != 40 && position3 != 67 && position3 != 54 && position3 != 90 && position3 != 99) {
                    int position4 = position3;
                    System.out.println("You are now on square: " + position4);
                }
            }

        }
    }
    
    
    
    
}
