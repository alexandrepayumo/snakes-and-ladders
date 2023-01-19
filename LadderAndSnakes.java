// -----------------------------------------------------
// Assignment 1
// Written by: Alexandre Payumo 40249777, Benjamin Nguyen 40242621
// -----------------------------------------------------

//This class contains many helper functions that help with the functionality of the snakes and ladders game.
//Mostly to declutter the driver. Contains functions to display the board, flip the dice, and some getter methods.
import java.util.Random;

public class LadderAndSnakes {
    //SHOULD MAYBE INITIALIZE THESE VARIABLES IN A CONSTRUCTOR?
    Board laddersAndSnakesBoard = new Board();
    private int[][] board = new int[laddersAndSnakesBoard.getSize()][laddersAndSnakesBoard.getSize()];
    private int nbOfPlayers;
    
    //Function to display the board
    public void displayBoard() {
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board.length; j++){
                board[i][j] = i*10 + j + 1;
            }
           }
    
           for (int i = board.length-1; i > -1; i--){
            for (int j = board.length-1; j > -1; j--){
                //Print a different colour depending on the board position
            
                if (board[i][j] == 100)
                    System.out.print(Colour.Yellow + board[i][j] + Colour.Reset + "\t");
                
                else if (Board.checkInArray(this.laddersAndSnakesBoard.getSnakes(), board[i][j]))
                    System.out.print(Colour.Red + board[i][j] + Colour.Reset + "\t");
                
                else if (Board.checkInArray(this.laddersAndSnakesBoard.getLadders(), board[i][j]))
                    System.out.print(Colour.Green + board[i][j] + Colour.Reset + "\t");
                
                else
                    System.out.print(board[i][j] + "\t");
            }
            System.out.println();
            System.out.println();
           }
    }

    //Method to flip the die
    public int flipDice() {
        Random random = new Random();
        //random.nextInt() method is an easy way to generate a random dice flip
        return random.nextInt(6) + 1;
    }

    //Getter method for the snake positions array
    public int[][] getSnakes() {
        return laddersAndSnakesBoard.getSnakes();
    }

    //Getter method for the ladders position array
    public int[][] getLadders() {
        return laddersAndSnakesBoard.getLadders();
    }
}
