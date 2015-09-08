
package assignment2;

import java.util.Scanner;


public class Assignment2 {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        int menuChoice;
        int quit; 
        
        do{ //menu loop
            System.out.println("Select an option from the list below.");
            System.out.println(
                      "1. Author\n"
                    + "2. Class\n"
                    + "3. School\n"
                    + "4. Date\n"
                    + "5. Word Counter\n"
                    + "6. Exit");
            menuChoice = keyboard.nextInt();
            
            while(menuChoice < 1 || menuChoice > 6){ // test menuChoice range
                System.out.println("**Please enter a valid menu selection (1-6)**");
                System.out.println("Select an option from the list below.");
            System.out.println(
                      "1. Author\n"
                    + "2. Class\n"
                    + "3. School\n"
                    + "4. Date\n"
                    + "5. Word Counter\n"
                    + "6. Exit");
            menuChoice = keyboard.nextInt();
            } // end while loop
            
            switch(menuChoice){
                case 1:{ // name
                    System.out.println("Adam King");
                    break;
                }
                case 2:{ // class
                    System.out.println("CPT163 Java Programming 1");
                     break;
                }
                case 3:{ // school
                    System.out.println("Westmoreland County Community College");
                     break;
                }
                case 4:{ // date
                    System.out.println("Last Updated: 9/7/2015");
                     break;
                }
                case 5:{ // word counter
                    // word = "zouk"
                    int letterOne = (int)'z';
                    int letterTwo = (int)'o';
                    int letterThree = (int)'u';
                    int letterFour = (int)'k';
                    int wordTotal = letterOne + letterTwo + letterThree 
                            + letterFour;
                    System.out.println(letterOne + " + " +letterTwo + " + " 
                            + letterThree + " + " + letterFour+ " = " 
                            + wordTotal);
                     break;
                } // case5
            } // end switch
        if(menuChoice != 6){
            System.out.println("Enter 6 if you wish to quit or another number"
                + " to continue: ");
            quit = keyboard.nextInt();
            if(quit == 6){
                menuChoice = 6;
            } //quit if
        } // not 6 if
        }while(menuChoice != 6); // end menu loop   
    } // main
}