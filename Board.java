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

            do {

                snakeHead = (int) (Math.random() * 97) + 2;

                for (int j = 0; j < snakes.length ; j++){
                    for (int k = 0; k < snakes.length; k++){
                        if (snakes[j][k] == snakeHead)
                        invalid = true;  
                    }
                }

            } while (invalid);

            this.snakes[i][0] = snakeHead;

            //Generate tail of snake

            do {

            }

        }

    }

    public int getSize(){
        return this.size;
    }

    
}