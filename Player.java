public class Player {
    private int position;
    private String name;
    private String colour;

    public Player(String name, String colour) {
        this.position = 0;
        this.name = name;
        this.colour = colour;
  
    }

    public Player() {
        this.position = 0;
        this.name = "";
        this.colour = "";
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

    public String toString(){
        return "(Player name: " + this.name + "; Colour: " + this.colour + ")";
    }







    
}