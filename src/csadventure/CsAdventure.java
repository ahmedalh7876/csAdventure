/*
 * Author: Ahmed A.
 * Last edit date: 19/10/2018
 * Program: Choose your own path "adventure" game on CS:GO
 */
package csadventure;

//Import keypress scanner to detect keystrokes within console
import java.util.Scanner;

public class CsAdventure {
    
    public static void main(String[] args) {
        
        //Variable declaration & initialization
        int eventNmbr = 1;
        String userName = "";
        String decisionOne = "";
        String decisionTwo = "";
        String decisionThree = "";
        
        //Keypress scanner within console window initialization
        Scanner keyPress = new Scanner(System.in);
        
        //Prints instructions in console window
        System.out.println("Please follow directions provided by the program exactly as mentioned, otherwise the program will not function as intended.\nIf any error is made and the program does not display appropriate text, please repeatedly press the enter key, then\nre-run the program.\n\n---------------------------------------------------------------------------------------------------------------------------\n");
        
        //Prompts user to input their username, then stores it as a variable using a scanner
        System.out.println("Welcome player, please enter your username below, then press the (Enter) key to proceed to next step:");
        userName = keyPress.nextLine();
        eventNmbr ++;
        
        //Explains first decision user has to make, and possible options
        System.out.println("\n" + userName + " is left in a 1v4 clutch situation on palace, mirage. There is 1 minute left, what do you plan to do?");
        System.out.println("(Please type the letter of the action you would like to perform):");
        System.out.println("A: Plant the bomb.");
        System.out.println("B: Save your weapon.");
        decisionOne = keyPress.nextLine();
        
        switch (decisionOne) {
            case "A": case "a":
                //Explains second decision and options
                System.out.println("\n" + "Do you want to plant the bomb at site A or B?");
                System.out.println("A: Bombsite A.");
                System.out.println("B: Bombsite B.");
                decisionTwo = keyPress.nextLine();
                break;
            case "B": case "b":
                //Explains third decision and options
                System.out.println("\n" + "Are you going for exit frags?");
                System.out.println("Y: Yes.");
                System.out.println("N: No.");
                decisionTwo = keyPress.nextLine();
                break;
        }
        switch (decisionTwo) {
            case "A": case"a":
                System.out.println("\n" + "You attempt to plant at the A bombsite, but get overwhelmed by a 3v1 and die.");
                break;
            case "B": case "b":
                System.out.println("\n" + "You attempt to plant at the B bombsite, but die to a player in sewers.");
                break;
            case "Y": case "y":
                System.out.println("\n" + "You manage to get two 1v1s, and have obtained an AWP while surviving with 49HP and armor. Good Job, " + userName + "!");
                break;
            case "N": case "n":
                System.out.println("\n" + "You camp palace and manage to save your weapon, although the enemy team survives with 4 players.");
                break;
        }
    }     
}
