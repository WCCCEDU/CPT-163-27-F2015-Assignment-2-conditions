
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Zachary
 */
public class conditions {

   
    public static void main(String[] args) {
        int code;
        int streetNumber;
        int yourAge;
        int yourBirthYear;
        int numberOfMeals;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("If you would like to play Simon Says please enter the number ten. To find out if you are eating health enter fifteen. "
                + "To see if today is your lucky day enter twenty. To see if you were born lucky enter twenty-five. To see the value"
                + "of the word perfect enter the number 100. To exit type 1.");
        code=keyboard.nextInt();
        
    switch (code)
    {    
        case 10:
            System.out.println("Enter your street number");
            streetNumber = keyboard.nextInt();
            
            if (streetNumber < 100)
            {
                System.out.println("Simon says to ten jumping jacks.");
            }
            else if (streetNumber > 600)
            {
                System.out.println("Go and get yourself a candy bar.");
            }
            break;
        
        case 15:
            System.out.println("Enter your favorite food that you must eat.");
            numberOfMeals=keyboard.nextInt();
            
        
            if (numberOfMeals >= 3)
            {
                System.out.println("Looks like you are on the right track!");
            }
            else if (numberOfMeals < 3) 
            {        
                System.out.println("You need to start eating more pizza.");
            } 
            break;
        case 20: 
            System.out.println("Please enter your age, be honest.");
            yourAge=keyboard.nextInt();
            
        
            if (yourAge >= 19)
            {
                System.out.println("Today is your lucky day!");
        }
            else if(yourAge <= 18)
            {  
                System.out.println("You will not be lucky untill you take a programming class!");
                
            }
            break;
        case 25:
            System.out.println("Please enter your birth year.");
            yourBirthYear=keyboard.nextInt();
            
            if (yourBirthYear > 1980)
            {
                System.out.println("You were born this way, which is lucky!");
            }
            else if (yourBirthYear <1900)
            {
                System.out.println("Wow you are really old, but stil lucky!");
            }
            else if (yourBirthYear > 2015)
            {
                System.out.println("Sorry you are not lucky because yoou weren't born yet.");
            }
        break;
        case 100:
            
            char letterOne='p';
            char letterTwo='e';
            char letterThree='r';
            char letterFour='f';
            char letterFive='e';
            char letterSix='c';
            char letterSeven ='t';
            int asciiSum;
       
            asciiSum= (int)letterOne + (int)letterTwo + (int)letterThree + (int)letterFour + (int)letterFive + (int)letterSix + (int)letterSeven; 
       
       
            System.out.println("The word is 'perfect'.");
            System.out.println("The sum of the word perfect is " + asciiSum + " .");
        break;
        
        case 1:
            System.out.println("This program has eneded have a great day!");
        break;    
            }
   
    }
    }




