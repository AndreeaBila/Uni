import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char array[][] = new char[3][3];

        for (int i = 0; i < 3; i++) {
            //print the appropriate message for each iterration 
            switch(i){
                case 0: System.out.println("Insert first tic-tac-toe row:");
                        break;
                case 1: System.out.println("Insert second tic-tac-toe row:");
                        break;
                case 2: System.out.println("Insert third tic-tac-toe row:");
                        break;
                default: System.out.println("Insert tic-tac-toe row:");
                         break;
            }
            
            String input = scan.nextLine();

            //validate input
            if (input.length() != 3) {
                System.out.println("Wrong length. Your input must be 3 characters long.");
                //if input is wrong, go back and repeat this iterration
                i--;
            } else if (!correctFormat(input)) {
                System.out.println("Wrong format. All characters in your input must be either 'x' or 'o'.");
                i--;
            } else {
                for(int j =0; j < 3; j++) {
                    array[i][j] = input.charAt(j);
                }
            }
        }

        System.out.println("Your tic-tac-toe board is:");
        showMatrix(array);

        //check for winner
        boolean hasWon = false;
        for(int i = 0; i < 3; i++) {
            
            if(array[i][0] == array[i][1] && array[i][1] == array[i][2]) {
                System.out.println(array[i][0] + " is the winner");
                hasWon = true;
                break;
            } else if(array[0][i] == array[1][i] && array[1][i] == array[2][i]) {
                System.out.println(array[0][i] + " is the winner");
                hasWon = true;
                break;
            }
        }

        //print result - winner or tie
        if(!hasWon) {
            
            if(array[0][0] == array[1][1] && array[1][1] == array[2][2]) {
                System.out.println(array[0][0] + " is the winner");
                hasWon = true;
            } else if(array[0][2] == array[1][1] && array[1][1] == array[2][0]){
                System.out.println(array[0][2] + " is the winner");
                hasWon = true;
            } else {
                System.out.println("Tie");
            }
        }

    }

    //method to validate format
    public static boolean correctFormat(String input) {
        for(int i = 0; i < 3; i++){
            if(input.charAt(i) != 'x' && input.charAt(i) != 'o') {
                return false;
            }       
        }
        return true;
    }

    //method to print the board
    public static void showMatrix(char[][] matrix){
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}