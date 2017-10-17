import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int matrix[][] = {{0, 1, 4, 5}, {3, 7, 9, 7}, {1, 8, 2, 1}};
        Scanner scan = new Scanner(System.in);

        //use method to display matrix
        showMatrix(matrix);

        do {
            System.out.println("Insert a number in the format 'xy' (a position in the matrix). Insert 'quit' to stop. ");
            try {
                //the constant DIGIT_COUNT retains the number of digits the input has to have
                final int DIGIT_COUNT = 2;
                String input = scan.nextLine();

                //validate input length
                if(input.length() != DIGIT_COUNT) {
                    //when quit is inserted break loop
                    if(input.toLowerCase().equals("quit")) {
                        System.out.println("Game Over.");
                        System.out.println("The final matrix is: ");
                        showMatrix(matrix);
                        break;
                    } else {
                        System.out.println("Incorrect input.");
                        continue;
                    }
                }

                //convert the string into two separate ints that represents x and y
                int rowIndex = Integer.parseInt("" + input.charAt(0));
                int columnIndex = Integer.parseInt("" + input.charAt(1));

                //constants that retain the minimum and maximum values the row/column index can have
                final int FIRST_XY = 0;
                final int LAST_X = 2;
                final int LAST_Y = 3;
                
                //validate input in bounds
                if(rowIndex < FIRST_XY || rowIndex > LAST_X || columnIndex < FIRST_XY || columnIndex > LAST_Y) {
                    System.out.println("Index out of bounds.");
                    continue;
                }

                //if validation works
                System.out.println("The value in that position is: " + matrix[rowIndex][columnIndex]);
                System.out.println("The updated matrix is: ");
                matrix[rowIndex][columnIndex] = 0;
                showMatrix(matrix);

              //validate input type
            } catch(Exception e) {
                System.out.println("Unmatched type.");
                //scanner might break at exception so reinitialize
                scan = new Scanner(System.in);
            }

          //loop will go on until quit is inserted and forces break; 
        } while (true);
    }

    //method that displays the two dimentional array
    public static void showMatrix(int[][] matrix){
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}