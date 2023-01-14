public class Board{
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
                invalid = checkInArray(this.snakes, this.ladders, snakeHead);

            } while (invalid);

            this.snakes[i][0] = snakeHead;

            //Generate tail of snake
            invalid = false;
            do {
                snakeTail = (int) (Math.random() * (snakeHead - 1)) + 1;

                invalid = checkInArray(this.snakes, this.ladders, snakeTail);
            } while (invalid);

            this.snakes[i][1] = snakeTail;
        }

    }

    public int getSize(){
        return this.size;
    }

    static boolean checkInArray(int[][] arr1, int[][] arr2, int num){
        for (int j = 0; j < arr1.length ; j++){
            for (int k = 0; k < arr1[0].length; k++){
                if (arr1[j][k] == num || arr2[j][k] == num)
                return true;  
            }
        }
        return false;
    }

    
}