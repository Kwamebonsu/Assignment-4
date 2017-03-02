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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);

        //input the cost of each value
        System.out.println("Please input the cost of food.");
        double number1 = input.nextDouble();

        System.out.println("Please input the cost of hiring a DJ.");
        double number2 = input.nextDouble();

        System.out.println("Please input the cost of the hall rental.");
        double number3 = input.nextDouble();

        System.out.println("Please input the cost of decorations.");
        double number4 = input.nextDouble();

        System.out.println("Please input the cost of hiring wait staff.");
        double number5 = input.nextDouble();

        System.out.println("Please input the cost of any miscellaneous expenses.");
        double number6 = input.nextDouble();

        //find the total cosst
        double totalcost = number1 + number2 + number3 + number4 + number5 + number6;

        System.out.println("The total cost of the prom is $" + totalcost + ".");

        //find the number of ticket sales required to break even

        System.out.println(Math.ceil(totalcost / 35) + " tickets need to be sold to break even.");
    }
}
