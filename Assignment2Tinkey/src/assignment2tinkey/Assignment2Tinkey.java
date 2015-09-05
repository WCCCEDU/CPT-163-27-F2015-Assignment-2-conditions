/* CLASS:   CPT 163  Java Programming I
*  NAME:    Sharon R. Tinkey
*  DATE:    09/04/15
*  CHAPTER: 3
*  PROGRAM: Assignment 2: conditions
*/
package assignment2tinkey;

import java.util.Scanner;			// required to use Scanner class

public class Assignment2Tinkey {

    public static void main(String[] args) {
     
    // Create Scanner object for keyboard input
    Scanner keyboard = new Scanner(System.in);
    
    String menuSelStr;           // menu item selected
    
    // display menu
    System.out.println("Java Class Assignments6\n");
    System.out.println("1. Assignment 1: Word Count");
    System.out.println("2. Assignment 2: Conditions");      
    System.out.println("3. Assignment 3: coming soon!");
    System.out.println("4. Assignment 4: TBD");
    System.out.println("5. Assignment 5: TBD");
    System.out.println("6. EXIT\n");
    System.out.print("Select a program to run: ");
    menuSelStr = keyboard.nextLine();
        
    System.out.println();                   // output a blank line for spacing
    
    // echo the user's selection
    switch (menuSelStr)  {
        case "1":
           System.out.println("You chose 1. Assignment 1: Word Count\n") ;
           break;
        case "2":
           System.out.println("You chose 2. Assignment 2: Conditions\n") ;
           break;
        case "3":
           System.out.println("You chose 3. Assignment 3: coming soon!\n") ;
           break;
        case "4":
           System.out.println("You chose 4. Assignment 4: TBD\n") ;
           break;
        case "5":
           System.out.println("You chose 5. Assignment 5: TBD\n") ;
           break;
        case "6":
           System.out.println("You chose 6. EXIT\n") ;
           break;
        default:
           System.out.println("Your selection must be from 1 to 6.\n") ;
           break;
    }
     
    }
    
}