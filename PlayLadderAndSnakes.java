import java.util.Scanner;
import java.util.*;

// can probably combine all the import statements into 1 line

public class PlayLadderAndSnakes {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);

        // Greetings
        // ask how many players
        // create players (name, colour)
        LadderAndSnakes helperMethods = new LadderAndSnakes();
        System.out.println(helperMethods.flipDice());
        System.out.println("\n~~~~~~~~~ Welcome to this game of Snakes and Ladders ~~~~~~~~~~");

        System.out.print("\nStart by entering the number of players (maximum: 6): ");
        int nbOfPlayers = kb.nextInt();

        if (nbOfPlayers > 2) {
            System.out.println("Initialization was attempted for " + nbOfPlayers + " players; however, this is only expected for an extended version of the game. Value will be set to 2.");
            nbOfPlayers = 2;
        }
        else if (nbOfPlayers < 2) {
            System.out.println("Error: Cannot execute the game with less than 2 players! Will exit");
            System.exit(0);
        }

        Player[] playerArray = new Player[nbOfPlayers];
        
        Colour colours = new Colour();


        //Initializing playerList
        for (int i = 0; i < nbOfPlayers; i++){
            
            System.out.println();
            System.out.print("Player " + (i+1) + ", what is your name? ");
            String playerName = kb.next();
            System.out.println(playerName + ", what colour do you choose?");
            System.out.print("Enter");
            for (int j=0; j<colours.getColourListSize(); j++) {
                if (j == 0) {
                    System.out.print(" ");
                }
                else {
                    System.out.print(", ");
                }
                System.out.print(colours.getFromColourList(j));
            } System.out.print(": ");
            

            String playerColour = kb.next().toLowerCase();
            String chosenColour = colours.getFromColourDict(playerColour);

            playerArray[i] = new Player(playerName, chosenColour);
            //System.out.println(playerArray[i]);

            
            //playerList.get(i.setColour());
            colours.removeInColourDict(playerColour);
            colours.removeInColourList(playerColour);
        }

        //Display starting message
        System.out.print("\nOkay ");
        for (int i = 0; i < playerArray.length; i++){
            System.out.print(playerArray[i].getColour() + playerArray[i].getName() + Colour.Reset + ", ");
        }
        System.out.println("let's play!");







        
        
    }
}

