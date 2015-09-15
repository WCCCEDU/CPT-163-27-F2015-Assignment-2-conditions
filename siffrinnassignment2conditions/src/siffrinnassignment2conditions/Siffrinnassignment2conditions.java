package siffrinnassignment2conditions;

//import scanner utility
import java.util.Scanner;

//This program uses a switch to find out what 
//folks want for lunch and if they would like
//to see my first program run. 
//This also uses a counter to 
//count the number of valid choices input.

public class Siffrinnassignment2conditions {

      public static void main(String[] args) {
          
        //create scanner  
        Scanner keyboard = new Scanner(System.in);
        
        //exit option
        boolean exitSelected = false;
        
        //counter to count valid choices
        int choiceCounter = 0;
                
        while(exitSelected == false) 
        {
            System.out.println("What would you like for lunch?");
            System.out.println("Enter the number of your choice below\n");
            System.out.println("1) Turkey sandwich");
            System.out.println("2) Alphabet soup");
            System.out.println("3) Macaroni and cheese");
            System.out.println("4) Pizza");
            System.out.println("5) Salad");
            System.out.println("Y) If you would like to see my program HelloWorld?");
            System.out.println("E) Exit\n");
            
            String userChoice = keyboard.next();
            
            //add +1 to the counter
            choiceCounter += 1;
            
            //select numbers 1-5, Y (yes) or E for exit
            switch (userChoice)
            {
                case "1":
                    System.out.println("\n Great choice!\n");
                    break;
                case "2":
                    System.out.println("\nBe careful, it's hot.\n");
                    break;
                case "3":
                    System.out.println("\nComfort food at it's finest.\n");
                    break;
                case "4":
                    System.out.println("\nLet me warm that up for you.\n");
                case "5":
                    System.out.println("\nExcellent choice for a warm day.\n");
                    break;
                case "Y":
                    System.out.println("\nSorry it's not available right now.\n");
                    break;
                case "E":
                    //do not count exit as choice
                    choiceCounter -=1;
                    System.out.println("\nExit\n\nValid choices made: " + choiceCounter);
                    exitSelected = true;
                    break;
                    
                //all other values are invalid    
                default:
                    System.out.println("\nInvalid choice.\n");
                    choiceCounter -= 1;
                    break;
            }    
        }    
        }
      
    
}
