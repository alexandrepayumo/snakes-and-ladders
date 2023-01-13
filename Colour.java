import java.util.List;
import java.util.ArrayList;
import java.util.Hashtable;

public class Colour {
    public static String Reset = "\u001b[0m";
    public static String Red = "\u001b[31m";
    public static String Blue = "\u001b[34m";
    public static String Yellow = "\u001b[33m";
    public static String Purple = "\u001b[35m";
    public static String Green = "\u001b[32m";
    public static String Cyan = "\u001b[36m";

    public static String BackgroundRed = "\u001b[41m";
    public static String BackgroundBlue = "\u001b[44m";
    public static String BackgroundYellow = "\u001b[43m";
    public static String BackgroundPurple = "\u001b[45m";
    public static String BackgroundGreen = "\u001b[42m";
    public static String BackgroundCyan = "\u001b[46m";


    private List<String> colourList = new ArrayList();
    private Hashtable<String, String> colourDict = new Hashtable<String, String>();
    private Hashtable<String, String> matchingDict = new Hashtable<String, String>();

    public Colour(){
        
        this.colourDict.put("r", Red);
        this.colourDict.put("b", Blue);
        this.colourDict.put("g", Green);
        this.colourDict.put("y", Yellow);
        this.colourDict.put("p", Purple);
        this.colourDict.put("c", Cyan);

        
        this.colourList.add("[r] for " + Red + "RED" + Reset);
        this.colourList.add("[b] for " + Blue + "BLUE" + Reset);
        this.colourList.add("[g] for " + Green + "GREEN" + Reset);
        this.colourList.add("[y] for " + Yellow + "YELLOW" + Reset);
        this.colourList.add("[p] for " + Purple + "PURPLE" + Reset);
        this.colourList.add("[c] for " + Cyan + "CYAN" + Reset);

        
        this.matchingDict.put("r", "[r] for " + Red + "RED" + Reset);
        this.matchingDict.put("b", "[b] for " + Blue + "BLUE" + Reset);
        this.matchingDict.put("g", "[g] for " + Green + "GREEN" + Reset);
        this.matchingDict.put("y", "[y] for " + Yellow + "YELLOW" + Reset);
        this.matchingDict.put("p", "[p] for " + Purple + "PURPLE" + Reset);
        this.matchingDict.put("c", "[c] for " + Cyan + "CYAN" + Reset);
    }

    public String getFromColourList(int index){
        return this.colourList.get(index);
    }

    public String getFromColourDict(String colour){
        return this.colourDict.get(colour);
    }

    public int getColourListSize(){
        return this.colourList.size();
    }


    public void removeInColourDict(String colour){
        this.colourDict.remove(colour);
    }

    public void removeInColourList(String colour){
        this.colourList.remove(this.matchingDict.get(colour));
        this.matchingDict.remove(colour);
    }

}
