// -----------------------------------------------------
// Assignment 1
// Written by: Alexandre Payumo 40249777, Benjamin Nguyen 40242621
// -----------------------------------------------------


public class Board{
    //SHOULD MAYBE INITIALIZE THESE VAIRABLES IN A CONSTRUCTOR?
    private int size;
    private int[][] snakes = new int[9][2];
    private int[][] ladders = new int[9][2];

    public Board(){
        this.size = 10;
        
        // create function for randomization of snake
        for (int i = 0; i < snakes.length; i++){
            boolean invalid = false;
            int snakeHead;
            int snakeTail;

            // generate snake head
            do {

                snakeHead = (int) (Math.random() * 97) + 2;

                // if the tile is already a snake or a ladder, then re-generate it
                invalid = checkInArrays(this.snakes, this.ladders, snakeHead);

            } while (invalid);

            this.snakes[i][0] = snakeHead;

            //Generate tail of snake
            invalid = false;
            do {
                snakeTail = (int) (Math.random() * (snakeHead - 1)) + 1;

                invalid = checkInArrays(this.snakes, this.ladders, snakeTail);
            } while (invalid);

            this.snakes[i][1] = snakeTail;
        }

        // create function for randomization of ladders
        for (int i = 0; i < ladders.length; i++){
            boolean invalid = false;
            int ladderBottom;
            int ladderTop;

            // generate snake head
            do {

                ladderBottom = (int) (Math.random() * 98) + 1;

                // if the tile is already a snake or a ladder, then re-generate it
                invalid = checkInArrays(this.snakes, this.ladders, ladderBottom);

            } while (invalid);

            this.ladders[i][0] = ladderBottom;

            //Generate tail of snake
            invalid = false;
            do {
                ladderTop = (int) (Math.random() * (100 - ladderBottom)) + ladderBottom;

                invalid = checkInArrays(this.snakes, this.ladders, ladderTop);
            } while (invalid);

            this.ladders[i][1] = ladderTop;
        }



    }

    public int getSize(){
        return this.size;
    }

    public int[][] getSnakes(){
        return this.snakes;
    }

    public int[][] getLadders(){
        return this.ladders;
    }

    public static boolean checkInArrays(int[][] arr1, int[][] arr2, int num){
        for (int j = 0; j < arr1.length ; j++){
            for (int k = 0; k < arr1[0].length; k++){
                if (arr1[j][k] == num || arr2[j][k] == num)
                return true;  
            }
        }
        return false;
    }

    public static boolean checkInArray(int[][] arr, int num){
        for (int j = 0; j < arr.length ; j++){
            if (arr[j][0] == num)
            return true; 
        }
        
        return false;
    }

    public static boolean checkInArrayEnd(int[][] arr, int num){
        for (int j = 0; j < arr.length ; j++){
            if (arr[j][1] == num)
            return true; 
        }
        
        return false;
    }
}