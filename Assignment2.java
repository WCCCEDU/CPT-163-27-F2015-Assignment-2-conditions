
package assignment2;
import java.util.Scanner;

/**
 *
 * @author Samantha
 */
public class Assignment2 {
    
    public static void main(String[] args) {
        
       Boolean bool = true;   // Determines whether user will contine application
       Scanner keyboard = new Scanner(System.in);
       Integer input; //User menu selection
       Integer i;
       String[] menuItems = {
           "Word Value Calculator", "Grade Calculator","Song Lyrics Loop",
        "...Under Construction...","...Under Construction...", "Exit"
       };
       
       // DISPLAY MENU
       for(i=0; i < menuItems.length; i++) {
           System.out.println((i+ 1) + ". " + menuItems[i]);
       }
       
       
        while (bool == true) {
            System.out.print("\nEnter a menu number: ");
            //COLLECT INPUT
            input = keyboard.nextInt();
            
            if(input == 1){
                
                //ASSIGNMENT 1 CODE...
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
                
            }else if(input == 2){
                
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
                 
                 System.out.println("\tYour grade: " + score + " " + grade);
                 
            }else if(input == 3){
                
              //LOOPING LYRICS
                Integer numLoops;
                String[] lyrics = {
                  "Adventure Time,", "Come on, grab your friends", "We'll go to" , 
                    "very distant lands", "With Jake the Dog", "And Finn the Human",
                    "The fun will never end,", "It's Adventure Time!"
                };    
                
                //TITLE AND DESCRIPTION
                System.out.print("SONG LYRICS LOOP\n" + "\tEnter a number from"
                        + " 1-8. This will be the number of times the loop"
                        + " executes: ");
                numLoops = keyboard.nextInt();
                
                //validate entry
                while (numLoops != 9) {
                    if(numLoops <= 8 && numLoops >= 0) {
                        for(i=0; i < numLoops; i++) {
                            System.out.println("\t\t" + lyrics[i]);
                        }
                    }else{
                        System.out.println("Oops! Try again");
                    } 
                    System.out.print("\nEnter a number 1-8 to loop again or 9 to"
                            + " return to main menu: ");
                    numLoops = keyboard.nextInt();
                }
            } else if (input == 4) {
                System.out.println("Programmer is furiously typing away...");
            } else if (input == 5) {
                System.out.println("Programmer is furiously typing away...");
            }else if (input == 6){  
                bool = false;
            }else{
                System.out.println("Oops! Try again.");   
            } 
        }
        System.out.println("Goodbye!");
    };
};