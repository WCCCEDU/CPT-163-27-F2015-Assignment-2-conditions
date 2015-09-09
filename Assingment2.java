
package assingment2;
import java.util.Scanner;

/**
 This is Assignment 2.  This program provides a menu with 5 options. It 
 includes an option to run our first assignment and an option to 
 run assignment 1 and quit. 
 */
 
public class Assingment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int number; // The users selection
        
        Scanner keyboard = new Scanner(System.in);
       
        //Menu options
        System.out.println("1. Run Assignment 1 - Hangry");
        System.out.println("2. View my favorit Fish");
        System.out.println("3. Run HelloWorld");
        System.out.println("4. View my favorite Adventure Time character");
        System.out.println("5. Quit");
        
        //Get users option
        System.out.println("Please enter the number of the option"
                + " above that you would like to select");
        System.out.println("and then press Enter on your keyboard: " );
        number = keyboard.nextInt();
        
        //Confirm the users choice
        System.out.println("You chose " + number + ".");
      
        
        //Output based on choice
        if (number == 1)
            System.out.println("Your request is denied."); 
         else if (number == 2) 
            System.out.println("My favorite fish is salmon.");
         else if (number == 3)
            System.out.println("Sorry, that program is not available.");
         else if (number == 4)
             System.out.println("My favorite character is Marceline.");
         else if (number == 5)
             System.exit(0);
         else 
             System.out.println("Your selection was not valid.");
    }
    }
