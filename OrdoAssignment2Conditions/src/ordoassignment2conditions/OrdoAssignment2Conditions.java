package ordoassignment2conditions;

import java.util.Scanner;

public class OrdoAssignment2Conditions {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean quitSelected = false; // Determines whether or not to keep showing the menu.
        int choiceCounter = 0; // Variable to see how many valid choices were made.
        
        while(quitSelected == false)
        {
            System.out.println("What would you like to do today?");
            System.out.println("Enter the letter of your choice\n");
            System.out.println("A) Watch a movie");
            System.out.println("B) Watch YouTube");
            System.out.println("C) Play Mario Brothers");
            System.out.println("D) Code all day");
            System.out.println("E) Watch the sunset");
            System.out.println("Q) Quit\n");

            String userChoice = keyboard.next();
            
            choiceCounter += 1; // Add to the choice counter plus one.  Reverted later if invalid or Quit.
            
            switch (userChoice) // Select A-E or Q for Quit.
            {
                case "A":
                    System.out.println("\nAwesome!  Starting DVD player.\n");
                    break;
                case "B":
                    System.out.println("\nStarting Google Chrome.\n");
                    break;
                case "C":
                    System.out.println("\nRescue Princess Peach!\n");
                    break;
                case "D":
                    System.out.println("\nYou should take a break;  (Get it?)\n");
                    break;
                case "E":
                    System.out.println("\nBe sure to wear sunglasses!\n");
                    break;
                case "Q":
                    choiceCounter -= 1; // Not counting Quit as a choice
                    System.out.println("\nBye!\n\nValid choices made: " + choiceCounter);
                    quitSelected = true;
                    break;
                default: // All other values
                    System.out.println("\nInvalid choice!\n");
                    choiceCounter -= 1;
                    break;
            }
        }
    }
    
}