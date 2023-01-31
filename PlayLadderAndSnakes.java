// -----------------------------------------------------
// Assignment 1
// Written by: Alexandre Payumo 40249777, Benjamin Nguyen 40242621
// -----------------------------------------------------

//This program is meant to simulate a snakes and ladders game. In this driver file, must begin by
//greeting the user, and asking for certain parameters such as the number of players, their names,
//and which colour they will be using. Then, this file determines who starts the snakes and ladders game,
//displays the board and ultimately ends with something winning the game.

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PlayLadderAndSnakes {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);

        // Greetings
        // ask how many players
        // create players (name, colour)
        LadderAndSnakes las = new LadderAndSnakes();
        System.out.println(las.flipDice());
        System.out.println("\n~~~~~~~~~ Welcome to this game of Snakes and Ladders ~~~~~~~~~~");

        System.out.println("\nPlease maximize console size for optimal viewing experience.");

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

            colours.removeInColourDict(playerColour);
            colours.removeInColourList(playerColour);
        }

        //Display starting message
        System.out.print("\nOkay ");
        for (int i = 0; i < playerArray.length; i++){
            System.out.print(playerArray[i].getColour() + playerArray[i].getName() + Colour.Reset + ", ");
        }
        System.out.println("let's play!");

        System.out.println("\nNow deciding which player will start playing;");
        boolean isTie = true;
        int tieCounter = 1;
        while (isTie == true) {
            System.out.println("\nPress [ENTER] to roll dice");
            kb.nextLine(); 
            for (int i = 0; i < playerArray.length; i++) {
                playerArray[i].setOrderRoll(las.flipDice());
                System.out.println(playerArray[i].getColour() + playerArray[i].getName() + Colour.Reset + " got a dice value of " + playerArray[i].getOrderRoll());
            }
            for (int i = 0; i < playerArray.length - 1; i++) {
                int max = i;
                for (int j = i + 1; j < playerArray.length; j++) {
                    if (playerArray[j].getOrderRoll() > playerArray[i].getOrderRoll()) {
                        max = j;
                    }
                }
                if (max != i) {
                    Player temp = playerArray[i];
                    playerArray[i] = playerArray[max];
                    playerArray[max] = temp;
                }
            }
            for (int i = 0; i < playerArray.length - 1; i++) {
                if (playerArray[i].getOrderRoll() == playerArray[i + 1].getOrderRoll()) {
                    System.out.println("A tie was achieved between " + playerArray[i].getColour() + playerArray[i].getName() + Colour.Reset + " and " + playerArray[i+1].getColour() + playerArray[i+1].getName() + Colour.Reset + ". Attempting to break the tie");
                    isTie = true;
                    tieCounter++;
                    continue;
                }
                else {
                    isTie = false;
                }
            }
        }
        System.out.print("Reached final decision on order of playing. ");
        for (int i = 0; i < playerArray.length; i++) {
            if (i != playerArray.length - 1) {
                System.out.print(playerArray[i].getColour() + playerArray[i].getName() + Colour.Reset + " then ");
            }
            else {
                System.out.print(playerArray[i].getColour() + playerArray[i].getName() + Colour.Reset + ". ");
            }
        }
        System.out.println("It took " + tieCounter + " attemps before a decision could be made.");
        System.out.println("Press [ENTER] to continue");
        kb.nextLine();

        //Displaying the colour code for the board
        System.out.println();
        System.out.println("Color code: ");
        System.out.println(Colour.Yellow + "YELLOW" + Colour.Reset + " is the finish line.");
        System.out.println(Colour.Green + "RED" + Colour.Reset + " is the head of a snake.");
        System.out.println(Colour.Red + "GREEN" + Colour.Reset + " is the bottom of a ladder.");
        
        System.out.println();
        System.out.print("Press [ENTER] to display the board.");
        System.out.println();
        kb.nextLine();

        //Displaying the board
        las.play(kb, playerArray);
    }
}
// test
// another test

