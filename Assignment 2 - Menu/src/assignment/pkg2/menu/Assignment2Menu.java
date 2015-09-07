/*
Dylan Tkach
Java Programming
CPT-163-27
 */
package assignment.pkg2.menu;

import java.util.Scanner;

public class Assignment2Menu {

    public static void main(String[] args) {
    
        Scanner keyboard = new Scanner(System.in);
        
        int MenuSelection;
        
        int charW = 'W';
        int charA = 'A';
        int charR = 'R';
        int charH = 'H';
        // A declared.
        int charM = 'M';
        // M declared.
        int charE = 'E';
        // R declared.
        
        int total = charW + charA + charR + charH + charA + charM + charM + charE + charR;
        
        
        System.out.println("|=====================================|");
        System.out.println("| Please choose one of the following: |");
        System.out.println("|                                     |");
        System.out.println("| 1. Word Counter                     |");
        System.out.println("| 2. Is it heresy?                    |");
        System.out.println("| 3. List of Primarchs                |");
        System.out.println("| 4. Frame of Reference               |");
        System.out.println("| 5. Contact Info                     |");
        System.out.println("| Enter 0 to exit.                    |");
        System.out.println("|_____________________________________|");
        
        System.out.println("\nEnter your selection: ");
        MenuSelection = keyboard.nextInt();
        
        System.out.println("\n\n");
        
        
        switch (MenuSelection){
            case 0:
                System.out.println("Thank you for using this program.");
                break;
            case 1:
                System.out.println("You selected choice 1:\n");
                System.out.println("The ASCII total of WARHAMMER is " + total + ".");
                break;
            case 2:
                System.out.println("You selected choice 2:\n");
                System.out.println("Is it heresy?\n\n\n");
                System.out.println("Probably");
                break;
            case 3:
                System.out.println("You selected choice 3:\n");
                System.out.println("List of Primarchs:\n");
                System.out.println("Horus, Lion El'Jonson, Fulgrim, Perturabo, ");
                System.out.println("Jaghatai Khan, Leman Russ, Rogal Dorn, ");
                System.out.println("Konrad Curze, Sanguinius, Ferrus Manus, ");
                System.out.println("Angron, Roboute Guilliman, Mortarion, ");
                System.out.println("Magnus, Lorgar, Vulkan, Corvus Cortax, ");
                System.out.println("Alpharius Omegon.");
                break;
            case 4:
                System.out.println("You selected choice 4:\n");
                System.out.println("This is all in reference to a tabletop");
                System.out.println("game called called Warhammer 40k.");
                break;
            case 5:
                System.out.println("You selected choice 5:\n");
                System.out.println("This program was made by Dylan Tkach");
                System.out.println("Github: DTkach");
                System.out.println("Email: tkachd@my.wccc.edu");
                break;
            default:
                System.out.println("Please enter an option 1 through 5 ");
                System.out.println("or enter 0 to quit.");
        }
        
        
    }
    
}
