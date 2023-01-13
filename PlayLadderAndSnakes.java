import java.util.Scanner;

public class PlayLadderAndSnakes {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);

        // Greetings
        // ask how many players
        // create players (name, colour)

        System.out.println("\n~~~~~~~~~ Welcome to this game of Snakes and Ladders ~~~~~~~~~~");

        System.out.print("\nStart by entering the number of players (maximum: 6): ");
        int nbOfPlayers = kb.nextInt();

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


