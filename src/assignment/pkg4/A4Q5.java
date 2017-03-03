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

        // Asks for name
        System.out.print("Please enter your name: ");
        String name = input.nextLine();

        // Asks what the test is out of and the students mark
        // Calculates the percentage
        System.out.print("What was the first test out of?: ");
        int total1 = input.nextInt();
        System.out.print("What mark did you get?: ");
        double mark1 = input.nextDouble();
        double score1 = mark1 / total1 * 100;

        System.out.print("What was the second test out of?: ");
        int total2 = input.nextInt();
        System.out.print("What mark did you get?: ");
        double mark2 = input.nextDouble();
        double score2 = mark2 / total2 * 100;

        System.out.print("What was the third test out of?: ");
        int total3 = input.nextInt();
        System.out.print("What mark did you get?: ");
        double mark3 = input.nextDouble();
        double score3 = mark3 / total3 * 100;

        System.out.print("What was the fourth test out of?: ");
        int total4 = input.nextInt();
        System.out.print("What mark did you get?: ");
        double mark4 = input.nextDouble();
        double score4 = mark4 / total4 * 100;

        System.out.print("What was the fifth test out of?: ");
        int total5 = input.nextInt();
        System.out.print("What mark did you get?: ");
        double mark5 = input.nextDouble();
        double score5 = mark5 / total5 * 100;

        System.out.println("Test scores for " + name + ".");

        System.out.println("Test 1: " + score1 + "%.");
        System.out.println("Test 2: " + score2 + "%.");
        System.out.println("Test 3: " + score3 + "%.");
        System.out.println("Test 4: " + score4 + "%.");
        System.out.println("Test 5: " + score5 + "%.");

        // Calculates the average test score
        double average = (score1 + score2 + score3 + score4 + score5) / 5;
        System.out.println("Average: " + average + "%.");

    }
}
