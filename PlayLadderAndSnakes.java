import java.util.Scanner;

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
            System.out.println("Initialization was attempted for x members of players; however, this is only expected for and extended version of the game. Value will be set to 2");
            nbOfPlayers = 2;
        }
        else if (nbOfPlayers < 2) {
            System.out.println("Error: Cannot execute the game with less than 2 players! Will exit");
            System.exit(0);
        }
        
        Player[] playerList = new Player[nbOfPlayers];

        for (int i = 0; i < nbOfPlayers; i++){
            
            System.out.println();
            System.out.print("Player " + (i+1) + ", what is your name? ");
            String playerName = kb.next();
            System.out.println(playerName + ", what colour do you choose?");
            System.out.print("Enter [r] for RED, "
                                + "[b] for BLUE, "
                                + "[g] for GREEN, "
                                + "[y] for YELLOW, "
                                + "[p] for PURPLE, "
                                + "[c] for CYAN: ");
            String playerColour = kb.next();
        }






        
        
    }
}


