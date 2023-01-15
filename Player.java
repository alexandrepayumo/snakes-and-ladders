public class Player {
    private int position;
    private String name;
    private String colour;
    private int orderRoll;
    private boolean hasWon;
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
    }

    public void handleLand(Player[] players, int[][] snakes, int[][] ladders) {
        //MAY WANT TO TRANSFER ALL PRINT STATEMENTS INTO THIS FUNCTION
        //handle all land cases here
        if (this.position == 100) {
            this.hasWon = true;
        }
        //will need to take other player's positions as params as well as snake head and ladder foot locations
        for (int i = 0; i < snakes.length; i++) {
            if (this.position == snakes[i][0]) {
                this.position = snakes[i][1];
            }
        }
        for (int i = 0; i < ladders.length; i++) {
            if (this.position == ladders[i][0]) {
                this.position = ladders[i][1];
            }
        }
        for (int i = 0; i < players.length; i++) {
            if (this.position == players[i].getPosition()) {
                players[i].setPosition(players[i].getPosition() - 1);
                //players[i].handleLand(players, snakes, ladders);
                //WTFFF
            }
            //recursion?
            //might want to modify this statement to add a log to the console that the player has been bumped
        }
        if (this.position > 100) {
            int backBounce = this.position - 100;
            this.position -= backBounce;
            this.handleLand(players, snakes, ladders);
            //recursion?
        }
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