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

        List<Player> playerList = new ArrayList<Player>();

        for (int i=0; i<nbOfPlayers; i++) {
            playerList.add(new Player());
        }
        
        //Can get rid of these variables and hard code them to make the file shorter
        String redText = "[r] for RED"; 
        String blueText = "[b] for BLUE";
        String greenText = "[g] for GREEN";
        String yellowText = "[y] for YELLOW";
        String purpleText = "[p] for PURPLE";
        String cyanText = "[c] for CYAN";

        //String colourTexts[] = new String[] {redText, blueText, greenText, yellowText, purpleText, cyanText};
        List<String> colourList = new ArrayList<String>();
        colourList.add(redText);
        colourList.add(blueText);
        colourList.add(greenText);
        colourList.add(yellowText);
        colourList.add(purpleText);
        colourList.add(cyanText);


        //Initializing playerList
        for (int i = 0; i < nbOfPlayers; i++){
            
            System.out.println();
            System.out.print("Player " + (i+1) + ", what is your name? ");
            String playerName = kb.next();
            System.out.println(playerName + ", what colour do you choose?");
            System.out.print("Enter");
            for (int j=0; j<colourList.size(); j++) {
                if (j == 0) {
                    System.out.print(" ");
                }
                else {
                    System.out.print(", ");
                }
                System.out.print(colourList.get(j));
            }

            String playerColour = kb.next();
            //could maybe use a dictionary to map each letter to a specific colour value instead of having all these if/else statements
            //actually this would be much better because we need to dynamically change the number of available colours depending on what has already been chosen
            if (playerColour.equals("b")) {

            }
            else if (playerColour.equals("")) {

            }
            else if (playerColour.equals("")) {

            }
            
            //playerList.get(i.setColour());
            colourList.remove(i+1);
        }






        
        
    }
}


