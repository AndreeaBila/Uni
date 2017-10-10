import java.util.Scanner;

public class Ex5{
    public static void main(String args[]){
        //create a scanner object that will be used to scan keyboard inputs
        Scanner scan = new Scanner(System.in);

        //create variables to retain the minimum and maximum values, the count, sum and mean of the numbers
        int lowest = Integer.MAX_VALUE;
        int largest = 0;
        int count = 0;
        int sum = 0;
        int number;
        
        //do the following algorithm while the input umber is different from -1
        do {
            //prompt the user to insert a number
            System.out.println("Insert positive integer: ");
            //save the iput number in a variable
            number = scan.nextInt();
            //(for the first iteration of the do while) check if the input number is equal to -1
            if (number == -1){
                //if it is -1, break the loop
                break;
            }

            //check if the current value is smaller than the lowest value
            if (number < lowest) {
                lowest = number;
            }

            //check if the current value is larger than the largest value
            if(number > largest){
                largest = number;
            }

            //increase the counter by one
            count++;

            //add the current value to the sum
            sum += number;

        } while ( number != -1);

        //calculate the mean after changing the type of the variables from int to float in order to get a precise result(devide the sum by the count)
        float mean = (float)sum / (float)count;

        //if no numbers were introduced then display an error message
        if(count == 0){
            System.out.println("You did not insert any positive integers.");
        } else{
            //display the results
            System.out.println("Lowest: " + lowest);
            System.out.println("Largest: " + largest);
            System.out.println("Count: " + count);
            System.out.println("Sum: " + sum);
            System.out.println("Mean: " + mean);
        }
        
    }
}