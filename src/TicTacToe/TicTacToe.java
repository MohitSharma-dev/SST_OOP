package TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        int n = 3;
        char[][] board = new char[n][n];

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the name of Player 1 : ");
        String p1 = sc.nextLine();

        System.out.println("Please enter the name of Player 2 : ");
        String p2 = sc.nextLine();

        // True : Player 1 turn
        Boolean turn = true;

        for(int i =0 ; i < n; i++){
            for(int j = 0; j< n; j ++){
                board[i][j] = '-';
            }
        }

        int countOfMoves = 0;
        while(true){
            displayBoard(board);
            char sym;
            while(true){
                if(turn){
                    System.out.println("Player 1 , please make your turn : ");
                } else {
                    System.out.println("Player 2 , please make your turn : ");
                }

                if(turn){
                    sym = 'X';
                } else {
                    sym = 'O';
                }

                System.out.println("Please input the row : ");
                int r = sc.nextInt();
                System.out.println("Please input the col : ");
                int c = sc.nextInt();

                if(r < 0 || r >= n || c < 0 || c >= n){
                    System.out.println("Invalid Move!");
                } else if (board[r][c] != '-'){
                    System.out.println("This cell is already occupied!");
                } else {
                    board[r][c] = sym;
                    countOfMoves ++;
                    break;
                }
            }

            if(checkWinner(board , sym)){
                System.out.println("Winner is " + sym);
                break;
            } else if (countOfMoves == 9){
                System.out.println("Draw");
                break;
            }
             turn = !turn;

        }

        displayBoard(board);

    }

    public static void displayBoard(char[][] board){
        for(int i =0 ; i < board.length; i++){
            for(int j = 0; j< board.length; j ++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static boolean checkWinner(char[][] board , char sym){
        for(int i =0 ; i < board.length; i++){
            if(board[i][0] == sym && board[i][0] == board[i][1] && board[i][1] == board[i][2]){
                return true;
            } else if(board[0][i] == sym && board[0][i] == board[1][i] && board[1][i] == board[2][i]){
                return true;
            }
            // Diagonal : HW
        }
        return false;
    }
}