public class Player {
    private int position;
    private String name;
    private String colour;
    private int orderRoll;
    //does orderRoll need to be initialized in constructor or can it just be initialized using setter
    //methods called from the driver
    
    public Player(String name, String colour) {
        this.position = 0;
        this.name = name;
        this.colour = colour;
        this.orderRoll = 0;
    }

    public Player() {
        this.position = 0;
        this.name = "";
        this.colour = "";
        this.orderRoll = 0;
    }

    public void movePlayer(int moveAmount) {
        this.position += moveAmount;
    }

    public void handleLand() {
        //handle all land cases here
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

    public String toString(){
        return "(Player name: " + this.name + "; Colour: " + this.colour + ")";
    }
  
}