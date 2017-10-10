import java.util.Scanner;
import java.util.*;

public class Ex1{
    public static void main(String args[]){
        //create a scanner object that will be used to scan keyboard inputs
        Scanner scan = new Scanner(System.in);

        //prompt the user to insert an integer
        System.out.print("Please insert an integer: ");
        
        
        try{
            //save the inserted number in a variable
            int number = scan.nextInt();
            //if the given number is smaller than 1, prompt an error message
            if(number < 1) {
                System.out.println("Your number is too small");
            //check if the numebr is odd or even and display the result
            } else if(number % 2 == 0) {
                System.out.println("Your number is even");
            } else {
                System.out.println("Your number is odd");
            }

        }catch (InputMismatchException e){
            //if the input does not match the required type display error message
            System.out.println("Error! You must insert an integer");
        }
    }
}