public class Player {
    private int position;
    private String name;
    private String colour;
    private int orderRoll;
    private boolean hasWon;
    //private Colour col = new Colour();
    //does orderRoll need to be initialized in constructor or can it just be initialized using setter
    //methods called from the driver
    
    public Player(String name, String colour) {
        this.position = 0;
        this.name = name;
        this.colour = colour;
        this.orderRoll = 0;
        this.hasWon = false;
    }

    public Player() {
        this.position = 0;
        this.name = "";
        this.colour = "";
        this.orderRoll = 0;
        this.hasWon = false;
    }

    public void movePlayer(int moveAmount) {
        this.position += moveAmount;
        //System.out.println("POSITION: " + this.position);
    }

    public void handleLand(Player[] players, int[][] snakes, int[][] ladders) {
        //MAY WANT TO TRANSFER ALL PRINT STATEMENTS INTO THIS FUNCTION
        //handle all land cases here
        if (this.position == 100) {
            this.hasWon = true;
            System.out.println();
            return;
        }
        //will need to take other player's positions as params as well as snake head and ladder foot locations
        for (int i = 0; i < snakes.length; i++) {
            if (this.position == snakes[i][0]) {
                this.position = snakes[i][1];
                System.out.println("; landed on a snake. Going down to square " + snakes[i][1]);
                return;
            }
        }
        for (int i = 0; i < ladders.length; i++) {
            if (this.position == ladders[i][0]) {
                this.position = ladders[i][1];
                System.out.println("; landed on a ladder. Going up to square " + ladders[i][1]);
                return;
            }
        }
        //THE CODE BELOW MIGHT BE PROBLEMATIC
        //It might be checking if the player landed on a tile with itself
        for (int i = 0; i < players.length; i++) {
            if (this.name != players[i].name && this.position == players[i].getPosition() && this.position != 0) {
                players[i].setPosition(players[i].getPosition() - 1);
                System.out.println("; now in square " + this.position);
                System.out.print(players[i].getColour() + players[i].getName() + Colour.Reset + " rolled back");
                players[i].handleLand(players, snakes, ladders);
                //WTFFF
                return;
            }
            //recursion?
            //might want to modify this statement to add a log to the console that the player has been bumped
        }
        if (this.position > 100) {
            //this is not working yo
            int backBounce = this.position - 100;
            //System.out.println("BACKBOUNCE: " + backBounce);
            this.position = 100 - backBounce;
            System.out.print("; bounced");
            //System.out.println("; bounced back into square " + this.position);
            this.handleLand(players, snakes, ladders);
            //we need a way for the line above not to reprint text after handling bounce again
            //recursion?
            //also might want to check if we bounced back onto someone else
            return;
        }
        //if we haven't returned, we want default print statement
        System.out.println("; now in square " + this.position);
    }

    // setters
    public void setPosition(int position){
        this.position = position;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setColour(String colour){
        this.colour = colour; 
    }
    public void setOrderRoll(int orderRoll) {
        this.orderRoll = orderRoll;
    }

    // getters
    public int getPosition(){
        return this.position;
    }
    public String getName(){
        return this.name;
    }
    public String getColour(){
        return this.colour;
    }
    public int getOrderRoll(){
        return this.orderRoll;
    }
    public boolean getHasWon(){
        return this.hasWon;
    }

    public String toString(){
        return "(Player name: " + this.name + "; Colour: " + this.colour + ")";
    }
  
}