
package conditionalstructure;

import java.util.Scanner;
/**
 *
 * @author Seth
 */
public class ConditionalStructure {


    public static void main(String[] args) {
        
        int number;
        int fbNumber;
        double hours;
        double wage;
        double salary;
        double grade;
        String response;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter '1' to play FIZZBUZZ, Enter '2' to view the value of the word 'Beautiful', Enter '3' to use the salary calculator, \n"
                + "Enter '4' to check your grade, Enter '5' to play Truth or Dare, Enter '6' or any other number to EXIT:");
        number = keyboard.nextInt();
        
        switch (number)
        {
            case 1:
                System.out.println("Enter a number to play FIZZBUZZ:");
                fbNumber = keyboard.nextInt();
                
                if (fbNumber % 3 == 0 && fbNumber % 5 == 0)
                {
                    System.out.println("FIZZBUZZ");
                }
                else if (fbNumber % 3 == 0)
                {
                    System.out.println("FIZZ");
                }
                else if (fbNumber % 5 == 0)
                {
                    System.out.println("BUZZ");
                }
                else
                {
                    System.out.println("Invalid number");
                }
                break;
            case 2:
                    char char1 = 'B';
                    char char2 = 'e';
                    char char3 = 'a';
                    char char4 = 'u';
                    char char5 = 't';
                    char char6 = 'i';
                    char char7 = 'f';
                    char char8 = 'u';
                    char char9 = 'l';
                    int int1 = (int)char1;
                    int int2 = (int)char2;
                    int int3 = (int)char3;
                    int int4 = (int)char4;
                    int int5 = (int)char5;
                    int int6 = (int)char6;
                    int int7 = (int)char7;
                    int int8 = (int)char8;
                    int int9 = (int)char9;
                    int total = int1+int2+int3+int4+int5+int6+int7+int8+int9;
    
                    System.out.println(int1);
                    System.out.println(int2);
                    System.out.println(int3);
                    System.out.println(int4);
                    System.out.println(int5);
                    System.out.println(int6);
                    System.out.println(int7);
                    System.out.println(int8);
                    System.out.println(int9);
                    System.out.println(total);
                break;
            case 3:
                System.out.println("Enter the amount of hours worked:");
                hours = keyboard.nextDouble();
                System.out.println("Enter the wage per hour:");
                wage = keyboard.nextDouble();
                salary = wage * hours;
                
                System.out.printf("The weekly salary is $%,.2f\n",salary);
                break;
            case 4:
                System.out.println("Enter your current score out of 100:");
                grade = keyboard.nextDouble();
                
                if (grade >= 90)
                {
                    System.out.println("You have an A.");
                }
                else if (grade >= 80)
                {
                    System.out.println("You have a B.");
                }
                else if (grade >= 70)
                {
                    System.out.println("You have a C.");
                }
                else if (grade >= 60)
                {
                    System.out.println("You have a D.");
                }
                else
                {
                    System.out.println("You have an F.");
                }
                break;
            case 5:
                System.out.println("Enter 'Truth' or 'Dare':");
                response = keyboard.next();
                
                if (response.equalsIgnoreCase("TRUTH"))
                {
                    System.out.println("Tell me how you really feel about this program.");
                }
                else if (response.equalsIgnoreCase("DARE"))
                {
                    System.out.println("I dare you to do a code review of this program.");
                }
                else
                {
                    System.out.println("Invalid entry.");
                }
                break;
            default:
                System.out.println("Goodbye.");
        }
            
    }
    
}
