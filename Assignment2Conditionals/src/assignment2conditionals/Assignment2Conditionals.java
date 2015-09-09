package assignment2conditionals;

import java.util.Scanner;

public class Assignment2Conditionals 
{

    public static void main(String[] args) 
    {
     Scanner scan = new Scanner (System.in);
           
     System.out.println("\t*************************************\n"
                      + "\t*       Steve's Calculator          *\n"
                      + "\t*************************************");
          
     System.out.println( "1: Math\n"
                  + "2: Subtraction\n"
                  + "3: Multiplication\n"
                  + "4: Devision\n"
                  + "5: Word Counter\n"
                  + "6: Exit Program\n");
     
  
     System.out.print("Please Pick An Option: ");
     int userInputNum = scan.nextInt();
     System.out.print("\n");
      
  
     if(userInputNum == 1)
      {
        System.out.print("Please enter in your First variable: ");
        double var1 = scan.nextDouble();
        System.out.print("Please enter in your Second variable: ");
        double var2 = scan.nextDouble();
        double product = var1 + var2;
        System.out.println("The answer is: " + product + "\n");
      }
      else if(userInputNum == 2)
      {
        System.out.print("Please enter in your First variable: ");
        double var1 = scan.nextDouble();
        System.out.print("Please enter in your Second variable: ");
        double var2 = scan.nextDouble();
        double product = var1 - var2;
        System.out.println("The answer is: " + product + "\n");
      }
     else if(userInputNum == 3)
      {
        System.out.print("Please enter in your First variable: ");
        double var1 = scan.nextDouble();
        System.out.print("Please enter in your Second variable: ");
        double var2 = scan.nextDouble();
        double product = var1 * var2;
        System.out.println("The answer is: " + product + "\n");
      }
     else if(userInputNum == 4)
      {
         
         System.out.print("Please enter in your Numerator: ");
         double var1 = scan.nextDouble();
         System.out.print("Please enter in your Denominator: ");
         double var2 = scan.nextDouble();
         if (var2 != 0)
         {
         double product = var1 / var2;
         System.out.println("The answer is: " + product + "\n");
         }
         else
             System.out.println("You can't divide by 0.");
      }
      else if(userInputNum == 5)
      {
        wordCounter();
      }
      else if(userInputNum == 6)
      {
          System.out.println("Goodbye!");
         System.exit(0);
      }
      else
          System.out.println("You did not enter a valid number.\n"
                  + "Goodbye!");
    }
//Word Counter Method
    public static void wordCounter()
    {
        
        char L = 'L';
        char O = 'O';
        char V = 'V';
        char E = 'E';
        
        int sum = (L + O + V + E);
        
        System.out.println("The word that I choose is \"Love\"\n");
        
        System.out.print("The Ascii value for L is ");
        System.out.println((int)L);
        System.out.print("The Ascii value for O is ");
        System.out.println((int)O);
        System.out.print("The Ascii value for V is ");
        System.out.println((int)V);
        System.out.print("The Ascii value for E is ");
        System.out.println((int)E);
        
        System.out.println("\nThe sum of the Ascii values is: " + (int)(sum)
                    + "\n");
    }
    
}
