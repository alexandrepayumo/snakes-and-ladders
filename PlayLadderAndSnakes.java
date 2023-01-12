public class PlayLadderAndSnakes {
    public static void main(String[] args) {
        //hello
      

       int[][] board = new int[10][10];

       for (int i = 0; i < board.length; i++){
        for (int j = 0; j < board.length; j++){
            board[i][j] = i*10 + j + 1;
        }
       }

       for (int i = board.length-1; i > -1; i--){
        for (int j = board.length-1; j > -1; j--){
            if (board[i][j] == 43){
                System.out.print("\u001b[31m" + board[i][j] + "\t" + "\033[0m");
            }
            else
                System.out.print(board[i][j] + "\t");
        }
        System.out.println();
        System.out.println();
       }

    }
}


