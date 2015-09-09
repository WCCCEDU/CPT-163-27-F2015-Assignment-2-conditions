
package assignment2;

import java.util.Scanner; // Import needed for scanner class
import java.util.Random; //Import needed for random class

/**
 *
 * @author Samantha Shurie
 */
public class Assignment2 {
    
    public static void main(String[] args) {
        
       Scanner keyboard = new Scanner(System.in);
       Integer input = 0; //User menu selection
       Integer i;
       String[] menuItems = {
           "Word Value Calculator", "Grade Calculator","Song Lyrics Loop",
        "Slot Machine Simulator","...Under Construction...", "Exit"
       };
       
       // DISPLAY MENU
       /*The variable i stands for the position in the menuItems[] array. The loop
         will execute until it has reached the entire length of the array(menuItems.length, incrementing
         by 1 starting at 0. In the println statement, (i + 1) will print the number after
         the value of i. This is set because the array starts at 0, but the menu should start
         with the number 1 when printed. menuItems[i] will print the menuItem[] element located at the value
         stored in the variable i.
       */
       for(i=0; i < menuItems.length; i++) {
           System.out.println((i+ 1) + ". " + menuItems[i]);
       }
       
       //While loop: run this menu as long as the user does not enter 6 on the main menu
        while (input != 6) {
            System.out.print("\nEnter a menu number: ");
            input = keyboard.nextInt();
           
            switch(input) {
                
                case 1:
                  //ASSIGNMENT 1 CODE
                    char uprH = 'H';
                    char lwrU = 'u';
                    char lwrF = 'f';
                    char lwrL = 'l';
                    char lwrE = 'e';
                    char lwrP = 'p';
                    int asciiSum;

                    System.out.println("WORD CALCULATOR\n"
                            + "\tThe word is 'Hufflepuff'");
                    System.out.println("\t" + uprH + " " + lwrU + " " + lwrF + " " + lwrF + " " +
                            lwrL + " " + lwrE + " " + lwrP + " " + lwrU + " " + lwrF +
                             " " + lwrF);

                    asciiSum = uprH + lwrU + lwrF + lwrF + lwrL + lwrE + lwrP + 
                            lwrU + lwrF + lwrF;

                    System.out.println("\tThe sum of the word is: " + asciiSum);
                    
                    break;
                case 2:
                    
                  //IN CLASS PROJECT
                    Double yourPoints;
                    Double maxPoints;
                    Double score;
                    char grade;

                     System.out.println("GRADE CALCULATOR");
                     System.out.print("\tEnter YOUR SCORE: ");
                     yourPoints = keyboard.nextDouble(); 
                     System.out.print("\tEnter MAX POINTS: ");
                     maxPoints = keyboard.nextDouble(); 
                     score = (yourPoints/maxPoints) * 100;

                     if(score >= 90) {
                            grade = 'A';
                     } else if (score >= 80) {
                         grade = 'B';
                     } else if (score >= 70) {
                         grade = 'C';
                     } else if (score >= 60) {
                         grade = 'D';
                     } else {
                         grade = 'F';
                     };

                     System.out.printf("Your grade: %.2f" + " " + grade + "\n", score);
                    
                    break;
                case 3:
                    
                  //LOOPING LYRICS
                    Integer numLoops;
                    /*Each line of the song is stored in the lyrics array. The user
                      chooses how many lines of lyrics will be printed (also the number
                      of times the loop will be executed).
                    */
                    String[] lyrics = {
                      "Adventure Time,", "Come on, grab your friends", "We'll go to" , 
                        "very distant lands", "With Jake the Dog", "And Finn the Human",
                        "The fun will never end,", "It's Adventure Time!"
                    };    

                    //title and description
                    System.out.print("SONG LYRICS LOOP\n" + "\tEnter a number from"
                            + " 1-8. This will be the number of times the loop"
                            + " executes: ");
                    numLoops = keyboard.nextInt();
             
                    do { 
                        /*If input is not a number between 1-8, prompt the user
                          to enter a new value. Keep looping until they enter a
                          correct value*/
                        while (numLoops > 8 || numLoops <= 0) {
                            System.out.println("Oops! Try again. Enter a number from"
                                                + " 1-8.");
                            numLoops = keyboard.nextInt();
                        }
                        /*
                          In this for loop, the variable i represents the location
                          inside the lyrics[] array. numLoops is the user-chosen
                          number that decides how many lines of lyrics will be 
                          printed Each time the loop runs, i is increased, making
                          the next line of the song print out
                        */
                        for(i=0; i < numLoops; i++) {
                            System.out.println("\t\t" + lyrics[i]);
                        } 
                        System.out.print("\nEnter a number 1-8 to loop again or 9 to"
                                + " return to main menu: ");
                        numLoops = keyboard.nextInt();
                    } while (numLoops != 9);
                    
                    break;
                    
                case 4:
              //Chapter 4 Exercise 22: Slot Machine Simulation (page 267)
              //Objective: "Create a program that simulates a slot machine"
                Integer betAmt, winnings;
                Random spin = new Random(); //random object generates new random number
                Integer random1, random2, random3; //will hold values to be converted to strings
                String slot1 = " ",slot2 = " ", slot3 = " " ; //hold text representation of randoms
                
                //read user bet amount
                System.out.print("SLOT MACHINE\n"
                        + "\tPlace Your Bet (dollar amount [Integer]): ");
                betAmt = keyboard.nextInt();
                
                //validates user input
                while(betAmt < 1 || betAmt > 100) {
                    System.out.print("\tTry an amount between 1 and 100");
                    betAmt = keyboard.nextInt();  
                }
                
                
              /*assign random values to each of the three slots
                spin.nextInt(6) will generate a random number from 0 and 5*/
                random1 = spin.nextInt(6);
                random2 = spin.nextInt(6);  
                random3 = spin.nextInt(6);  
                    
              //assign word values to the numbers generated
                
                if (random1 == 0)
                    slot1 = "Cherries";
                else if (random1 == 1)
                    slot1 = "Oranges";
                else if (random1 == 2)
                    slot1 = "Plums";
                else if (random1 == 3)   
                    slot1 = "Bells";
                else if (random1 == 4)
                    slot1 = "Melons";
                else if (random1 == 5)
                    slot1 = "Bars";
              //end random 1 if else
                
                if (random2 == 0)
                    slot2 = "Cherries";
                else if (random2 == 1)
                    slot2 = "Oranges";
                else if (random2 == 2)
                    slot2 = "Plums";
                else if (random2 == 3)   
                    slot2 = "Bells";
                else if (random2 == 4)
                    slot2 = "Melons";
                else if (random2 == 5)
                    slot2 = "Bars";
              //end random 2 if else  
                                
                if (random3 == 0)
                    slot3 = "Cherries";
                else if (random3 == 1)
                    slot3 = "Oranges";
                else if (random3 == 2)
                    slot3 = "Plums";
                else if (random3 == 3)   
                    slot3 = "Bells";
                else if (random3 == 4)
                    slot3 = "Melons";
                else if (random3 == 5)
                    slot3 = "Bars";
              //end random 3 if-else
                
              //print all 3 slots
                System.out.println("\n\t[ " + slot1 + " ] [ " + slot2 + " ] [ "
                         + slot3 + " ]\n");
                
              //calculate winning amount
              //if NONE are equal (probably the most likely)  
               if((slot1 != slot2) && (slot1 != slot3) && (slot2 != slot3)){
                   winnings = 0;
                   System.out.println("\tSorry! Better luck next time!");
                   
              //some are equal, determine if there are 2 or 3 matching    
               }else{
                   if((slot1 == slot2) && (slot1 == slot3)){
                       winnings = betAmt * 3; //3 Matching
                       System.out.println("\tCongratulations! 3 Matching!");
                   }else{
                       winnings = betAmt * 2; //2 Matching
                       System.out.println("\t2 Matching!");
                   }    
               }; //end winnings if-else statement
               
               //print winnings
               System.out.println("\tYou Won: $" + winnings
                        + "\nTo play again, enter 4 on the menu");
                
                break;
                case 5:
                    System.out.println("Programmer is furiously typing away...");
                    break;
                case 6:
                    System.out.println("EXIT");
                    break;
                default:
                    System.out.println("Oops! Try again.");  
                    break;
            };  //end switch  
        } //end while loop
        System.out.println("\tProgram Ended - Goodbye!");
    };//end method
}; // end program