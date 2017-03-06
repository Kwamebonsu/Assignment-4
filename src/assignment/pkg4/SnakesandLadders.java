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
        double roll1 = input.nextDouble();
        double position2 = 1 + roll1;
        if (roll1 > 12 || roll1 <2) {
            System.out.println("You Quit!");
        }
        else if (roll1 >= 2 && roll1 <= 12) {
            System.out.println("You are now on square " + position2);
        
        if (position2 >=100){
            System.out.println("You won!");
        }
        else if (position2 <100){
            System.out.print("Enter sum of dice: ");
            double roll2 = input.nextDouble();
        double position3 = position2 + roll2;
        if (roll2 > 12 || roll2 <2) {
            System.out.println("You Quit!");
        }
        else if (roll2 >= 2 && roll2 <= 12) {
            System.out.println("You are now on square " + position3);
        
        if (position3 >=100){
            System.out.println("You won!");
        }
        else if (position3 <100){
            System.out.print("Enter sum of dice: ");
            double roll3 = input.nextDouble();
        double position4 = position3 + roll3;
        if (roll3 > 12 || roll3 <2) {
            System.out.println("You Quit!");
        }
        else if (roll3 >= 2 && roll3 <= 12) {
            System.out.println("You are now on square " + position4);
         if (roll3 > 12 || roll3 <2) {
            System.out.println("You Quit!");
        }
        if (position4 >=100){
            System.out.println("You won!");
        }
        else if (position4 <100){
            System.out.print("Enter sum of dice: ");
            double roll4 = input.nextDouble();
        double position5 = position4 + roll4;
        if (roll4 > 12 || roll4 <2) {
            System.out.println("You Quit!");
        }
        else if (roll4 >= 2 && roll4 <= 12) {
            System.out.println("You are now on square " + position5);
         
        if (position5 >=100){
            System.out.println("You won!");
        }
        else if (position5 <100){
            System.out.print("Enter sum of dice: ");
            double roll5 = input.nextDouble();
        double position6 = position5 + roll5;
        if (roll5 > 12 || roll5 <2) {
            System.out.println("You Quit!");
        }
        else if (roll5 >=2  && roll5 <= 12) {
            System.out.println("You are now on square " + position6);
         
        if (position6 >=100){
            System.out.println("You won!");
        }
        else if (position6 <100){
            System.out.print("Enter sum of dice: ");
            double roll6 = input.nextDouble();
        double position7 = position6 + roll6;
        if (roll6 > 12 || roll6 <2) {
            System.out.println("You Quit!");
        }
        else if (roll6 >= 2 && roll6 <= 12) {
            System.out.println("You are now on square " + position7);
         
        if (position7 >=100){
            System.out.println("You won!");
        }
        else if (position7 <100){
            System.out.print("Enter sum of dice: ");
            double roll7 = input.nextDouble();
        double position8 = position7 + roll7;
        if (roll7 > 12 || roll7 <2) {
            System.out.println("You Quit!");
        }
        else if (roll7 >= 2 && roll7 <= 12) {
            System.out.println("You are now on square " + position8);
         
        if (position8 >=100){
            System.out.println("You won!");
        }
        else if (position8 <100){
            System.out.print("Enter sum of dice: ");
            double roll8 = input.nextDouble();
        double position9 = position8 + roll8;
        if (roll8 > 12 || roll8 <2) {
            System.out.println("You Quit!");
        }
        else if (roll8 >= 2 && roll8 <= 12) {
            System.out.println("You are now on square " + position9);
         
        if (position9 >=100){
            System.out.println("You won!");
        }
        else if (position9 <100){
            System.out.print("Enter sum of dice: ");
            double roll9 = input.nextDouble();
        double position10 = position9 + roll9;
        if (roll9 > 12 || roll9 <2) {
            System.out.println("You Quit!");
        }
        else if (roll9 >= 2 && roll9 <= 12) {
            System.out.println("You are now on square " + position10);
         
        if (position10 >=100){
            System.out.println("You won!");
        }
        else if (position10 <100){
            System.out.print("Enter sum of dice: ");
            double roll10 = input.nextDouble();
        double position11 = position10 + roll10;
        if (roll10 > 12 || roll10 <2) {
            System.out.println("You Quit!");
        }
        else if (roll10 >= 2 && roll10 <= 12) {
            System.out.println("You are now on square " + position11);
         
        if (position11 >=100){
            System.out.println("You won!");
        }
        else if (position11 <100){
            System.out.print("Enter sum of dice: ");
            double roll11 = input.nextDouble();
        double position12 = position10 + roll11;
        if (roll11 > 12 || roll11 <2) {
            System.out.println("You Quit!");
        }
        else if (roll11 >= 2 && roll11 <= 12) {
            System.out.println("You are now on square " + position12);
         
        if (position12 >=100){
            System.out.println("You won!");
        }
        
        else if (position12 <100){
            System.out.print("Enter sum of dice: ");
            double roll12 = input.nextDouble();
        double position13 = position11 + roll12;
        if (roll12 > 12 || roll12 <2) {
            System.out.println("You Quit!");
        }
        else if (roll12 >= 2 && roll12 <= 12) {
            System.out.println("You are now on square " + position13);
         
        if (position13 >=100){
            System.out.println("You won!");
        }
        
        else if (position13 <100){
            System.out.print("Enter sum of dice: ");
            double roll13 = input.nextDouble();
        double position14 = position13 + roll13;
        if (roll13 > 12 || roll13 <2) {
            System.out.println("You Quit!");
        }
        else if (roll13 >= 2 && roll13 <= 12) {
            System.out.println("You are now on square " + position14);
         
        if (position14 >=100){
            System.out.println("You won!");
        }
        }
        }
        
        }
        }
        
        }
        }
        }
        }
}
    }
}
