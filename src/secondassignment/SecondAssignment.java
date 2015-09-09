package secondassignment;

//import scanner utility
import java.util.Scanner;

/*
The purpose of this program is to
use if-else statments to find out
the users favorite adventure time character
from a set list of choices
*/

public class SecondAssignment
{
	public static void main(String[] args)
	{
	
	//new scanner object
	Scanner keyboard = new Scanner(System.in);
	
	int choice;
	
	System.out.println("Who is your favorite adventure time character out of these 6!?");
	System.out.println("(please enter the number accompanying the character)" + "\n");
	System.out.println("1. Finn" + "\n" + "2. Jake" + "\n" + "3. Marceline");
	System.out.println("4. Simon" + "\n" + "5. Princess Bubblegum" + "\n" + "6. Gunther" + "\n");
        System.out.println("You may also enter 0 to exit.");
	
	choice = keyboard.nextInt();
	
	if(choice == 0)
                {
                System.out.println("Sorry for interrupting your busy day.");  
                }
        else if (choice ==1)
		{
		System.out.println("You have selected Finn the Human!");		
		}
	else if(choice == 2)
		{
		System.out.println("You have selected Jake the Dog!");
		}
	else if(choice == 3)
		{
		System.out.println("You have selected Marceline the Vampire!");
		}
	else if(choice == 4)
		{
		System.out.println("You have selected Simon, the Ice King!");
		}
	else if(choice == 5)
		{
		System.out.println("Princess Bubblegum");
		}
	else if(choice == 6)
		{
		System.out.println("You have selected Gunther the Penguin!");
		}
	else
		{
		System.out.println("Hey, that wasn't one of the choices! Try again.");
		}
	}
	
}

