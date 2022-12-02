package ProgrammingExercises;

import java.util.Scanner;
public class FormLetterWriter{

        
    
    public static void main(String[] args){
        String lastName, firstName;
        displaySalutation("Man\n");
        displaySalutation("Man", "Woman");
    }

    public static void displaySalutation(String lastName){
        System.out.print("Dear Mr or Mrs " + lastName
        );
    }
    public static void displaySalutation(String firstName, String lastName) {
        System.out.print("Dear " + firstName + " "
        + lastName + " Thank you for your recent order.");
    }
}