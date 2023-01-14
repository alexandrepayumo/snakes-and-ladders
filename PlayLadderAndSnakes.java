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


        //for the order determination...
        //we need to have a while loop that loops until each player has an order
        //maybe each player should have a hasOrder attribute?
        //actually we probably don't need hasOrder attribute if we just keep a rollersList instead
        //REMEMBER: this needs to work for more than 2 players... should work for n amount of players
        //on each iteration of the for loop, we need to roll the dice for every player that hasn't
        //rolled yet or has the same roll number as someone else
        //after rolling, we need to set the roll attribute of each player that rolled to the dice they rolled
        //and sort the list based on what the new rolls of players are. do not sort the players that have
        //not rolled on that turn.
        //to determine if a player is still rolling, after everyone rolls on a turn, check if their roll
        //has a duplicate in the list of players. if it doesn't, then remove them from the list.
        //therefore we need one array and one list. we need a sorted player array, and we need a list
        //that contains all the players that still need to roll
        //the while statement condition should be to check if the size of the list is bigger than 0
        //we also need to process the rerollers seperately... for example if two people tied at 2,
        //they need to roll seperately than the people that tied at 4
        //so we probably need to keep track of two things: for the rerollers, first if they are still
        //in the rollersList list, and also if they have the same dice roll as someone else in the rollersList

        List<Player> rollersList = new ArrayList();
        for (int i=0; i<playerArray.length; i++) {
            rollersList.add(playerArray[i]);
        }

        while (rollersList.size() > 0) {
            for (int i=0; i<rollersList.size(); i++) {

            }
        }

        System.out.println("Now deciding which player will start playing;");
        kb.next();
        System.out.println("temp");

        //for the gameplay itself...
        //we want a while loop that restarts until a player has a position of 100
        //inside of this while loop, we want a for loop that iterates through both players
        //the iteration of both players should be sorted in the order that was determined in the
        //initial dice roll orders.
        //inside of this for loop, we want to roll the dice for the player, then move the player,
        //then check where the player landed and do something accordingly
        //should maybe have the logic for move player to be inside the Player class
        //after the user moves, we need to check if the player has a position of 100. if he/she has,
        //set hasWon to true

        boolean hasWon = false;

        /*while (hasWon == false) {

        }*/







        
        
    }
}

