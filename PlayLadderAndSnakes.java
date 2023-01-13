import java.util.Scanner;



public class PlayLadderAndSnakes {
    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);

        String[] PlayerColours = {Colour.Red, Colour.Blue, Colour.Yellow, Colour.Purple, Colour.Green, Colour.Cyan};

        // Greetings
        // ask how many players
        // create players (name, colour)

        System.out.println("\n~~~~~~~~~ Welcome to this game of Snakes and Ladders ~~~~~~~~~~");

        System.out.print("\nStart by entering the number of players (maximum: 6): ");
        int nbOfPlayers = kb.nextInt();

        Player[] playerList = new Player[nbOfPlayers];


        // player creation
        for (int i = 0; i < nbOfPlayers; i++){
            
            System.out.println();
            System.out.print("Player " + (i+1) + ", what is your name? ");
            String playerName = kb.next();
            System.out.println("Choose your colour");
            System.out.print("Enter [r] for \u001b[31mRED" + Colour.Reset + ", "
                                + "[b] for \u001b[34mBLUE" + Colour.Reset + ", "
                                + "[g] for \u001b[32mGREEN" + Colour.Reset + ", "
                                + "[y] for \u001b[33mYELLOW" + Colour.Reset + ", "
                                + "[p] for \u001b[35mPURPLE" + Colour.Reset + ", "
                                + "[c] for \u001b[36mCYAN" + Colour.Reset + ": ");
            String playerColour = kb.next().toLowerCase();

            // colour choice

            switch(playerColour){

                case "r":
                    // something
                    break;
               
                case "b":
                    // something
                    break;
                
                case "g":
                    // something
                    break;
            }
        }






        
        
    }
}


