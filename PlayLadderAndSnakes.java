import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
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
            System.out.println("Initialization was attempted for x members of players; however, this is only expected for and extended version of the game. Value will be set to 2");
            nbOfPlayers = 2;
        }
        else if (nbOfPlayers < 2) {
            System.out.println("Error: Cannot execute the game with less than 2 players! Will exit");
            System.exit(0);
        }

        Player[] playerList = new Player[nbOfPlayers];
        
        String redText = "[r] for RED"; 
        String blueText = "[b] for BLUE";
        String greenText = "[g] for GREEN";
        String yellowText = "[y] for YELLOW";
        String purpleText = "[p] for PURPLE";
        String cyanText = "[c] for CYAN";

        //String colourTexts[] = new String[] {redText, blueText, greenText, yellowText, purpleText, cyanText};
        List<String> list = new ArrayList<String>();
        list.add(redText);
        list.add(blueText);
        list.add(greenText);
        list.add(yellowText);
        list.add(purpleText);
        list.add(cyanText);

        for (int i = 0; i < nbOfPlayers; i++){
            
            System.out.println();
            System.out.print("Player " + (i+1) + ", what is your name? ");
            String playerName = kb.next();
            System.out.println(playerName + ", what colour do you choose?");
            System.out.print("Enter");
            for (int j=0; j<list.size(); j++) {
                if (j == 0) {
                    System.out.print(" ");
                }
                else {
                    System.out.print(", ");
                }
                System.out.print(list.get(j));
            }

            String playerColour = kb.next();
            list.remove(i+1);
        }






        
        
    }
}


