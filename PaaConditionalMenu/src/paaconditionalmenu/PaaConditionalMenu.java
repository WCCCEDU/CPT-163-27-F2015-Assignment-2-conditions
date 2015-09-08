package paaconditionalmenu;

import java.util.Scanner;   // Needed for Scanner class
import java.util.Date;      // Needed for Date and Time
import java.text.DateFormat;    // Needed for Date and Time
import java.text.SimpleDateFormat;  // Needed for Date and Time
import java.util.Calendar;      // Needed for Date and Time

public class PaaConditionalMenu {

    public static void main(String[] args) {
        // Declare variables
        int menuNumber;
        Scanner keyboard = new Scanner(System.in);
        
        // Show User Menu and get input
        System.out.println("1. Value of a String");
        System.out.println("2. Current Date and Time");
        System.out.println("3. Programmers Name");
        System.out.println("4. IDE Used to to Make This");
        System.out.println("5. Programmers Github Username");
        System.out.println("6. Exit Application");
        System.out.println("Enter a number to select a menu option:");
        menuNumber = keyboard.nextInt();
        System.out.println("You selected " + menuNumber);
     
        // Determine the number entered
        switch (menuNumber)
        {
            case 1:
                // Declare all variables
                String word = "Learning";
                char letter1 = word.charAt(0);
                char letter2 = word.charAt(1);
                char letter3 = word.charAt(2); 
                char letter4 = word.charAt(3);
                char letter5 = word.charAt(4);
                char letter6 = word.charAt(5);
                char letter7 = word.charAt(6);
                char letter8 = word.charAt(7);
                int total;
        
                // Calculate total of integer equivalents
                total = letter1 + letter2 + letter3 + letter4 +
                        letter5 + letter6 + letter7 + letter8;
        
                // Print out information
                System.out.println("The word is " + word);
                System.out.println(letter1 + " = " + (int)letter1);
                System.out.println(letter2 + " = " + (int)letter2);
                System.out.println(letter3 + " = " + (int)letter3);
                System.out.println(letter4 + " = " + (int)letter4);
                System.out.println(letter5 + " = " + (int)letter5);
                System.out.println(letter6 + " = " + (int)letter6);
                System.out.println(letter7 + " = " + (int)letter7);
                System.out.println(letter8 + " = " + (int)letter8);
                System.out.println("Total = " + total);
                break;
            case 2:
                // Display Date and Time
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date date = new Date();
                System.out.println("The current date and time is: " + dateFormat.format(date));
                break;
            case 3:
                // Display my name
                System.out.println("The programmers name is Patrick Antoniak.");
                break;
            case 4:
                // Display IDE used
                System.out.println("The IDE used to program this was Netbeans.");
                break;
            case 5:
                // Display Github username
                System.out.println("The programmers Github username is Paa1006.");
                break;
            case 6:
                // Display program is closing
                System.out.println("The program is now closing.");
                break;
            default:
                //Display wrong number input
                System.out.println("That's not 1, 2, 3, 4, 5, or 6! Program closing.");
        }
}
}
