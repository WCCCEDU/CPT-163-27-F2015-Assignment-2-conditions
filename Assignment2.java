package assignment2;

//importing Scanner utility
import java.util.Scanner;

public class Assignment2 {

    /**
     * Curtis Kunkle
     * Java
     * Assignment 2
     * This program asks the user to input a number 
     * to choose the best PEAVEY tube amplifier out 
     * of a list of 6. 
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declare character for user input
        int choice;
        
        //new scanner object!
        Scanner keyboard = new Scanner(System.in);
        
        //Output prompt, list killer Peavey tube amps
        System.out.println("What is the best high-gain Peavey tube Amplifier?");
        System.out.println("1: Classic Series");
        System.out.println("2: ValveKing");
        System.out.println("3: 6505");
        System.out.println("4: XXX");
        System.out.println("5: JSX");
        System.out.println("6: Butcher");
        System.out.println("7: QUIT");
        
        //accepts the first character of the user's input
        choice = keyboard.nextInt();
        
        //error checking.  
        while(choice != 1 && choice != 2 &&
              choice != 3 && choice != 4 &&
              choice != 5 && choice != 6 && choice != 7){
         System.out.println("Invalid choice! Try again.");
         choice = keyboard.next().charAt(0);
        }
        
        //Output results
        if(choice == 1){
            System.out.println("You chose Classic Series. Thank you for your "
                    + "contribution!");
        }
        if(choice == 2){
            System.out.println("You chose ValveKing. Thank you for your "
                    + "contribution!");
        }
        if(choice == 3){
            System.out.println("You chose 6505. Thank you for your "
                    + "contribution!");
        }
        if(choice == 4){
            System.out.println("You chose XXX. Thank you for your "
                    + "contribution!");
        }
        if(choice == 5){
            System.out.println("You chose JSX. Thank you for your "
                    + "contribution!");
        }
        if(choice == 6){
            System.out.println("You chose Butcher. Thank you for your "
                    + "contribution!");
        }
        if(choice == 7){
            //TERMINATE
            System.exit(0);
        }
               
        }
    }
    

