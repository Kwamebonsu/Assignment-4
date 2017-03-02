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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name.");
        String name = input.nextLine();

        System.out.println("What was the first test out of?");
        int total1 = input.nextInt();
        System.out.println("What mark did you get?");
        double mark1 = input.nextDouble();
        double score1 = mark1 / total1 * 100;

        System.out.println("What was the second test out of?");
        int total2 = input.nextInt();
        System.out.println("What mark did you get?");
        double mark2 = input.nextDouble();

        System.out.println("What was the third test out of?");
        int total3 = input.nextInt();
        System.out.println("What mark did you get?");
        double mark3 = input.nextDouble();

        System.out.println("What was the fourth test out of?");
        int total4 = input.nextInt();
        System.out.println("What mark did you get?");
        double mark4 = input.nextDouble();

        System.out.println("What was the fifth test out of?");
        int total5 = input.nextInt();
        System.out.println("What mark did you get?");
        double mark5 = input.nextDouble();
        
        System.out.println("Test scores for " + name + ".");
        
        System.out.println("Test 1 " + score1 + "%.");
        

    }
}
