import java.util.Scanner;
import java.util.ArrayList;

public class Ex1 {
    public static void main (String[] args) {
        //use array list instead of normal array to be able to insert any number of strings
        ArrayList<String> inputs = new ArrayList<String>();

        //add valid inputs to the inputs arraylist until user enters "quit" 
        do {
            validateInput(inputs);
        } while (!inputs.get(inputs.size() - 1).toLowerCase().equals("quit")); 


        //if the user only inserted "quit" display this
        if(inputs.size() == 1) {       
            System.out.println("You didn't enter any strings.");
            
        //if they inserted more strings, give them information
        } else {
            System.out.println("You entered " + (inputs.size() - 1) + " strings.");
            System.out.println("These are your strings in order:");

            for (int i = 0; i < inputs.size(); i++) {
                //display the strings in the array if they aren't "quit"
                if(!inputs.get(i).toLowerCase().equals("quit")){
                    System.out.println(i+1 + ". " + inputs.get(i));
                }
            }
        }    
    }
    

    //recursive method that validates inputs
    public static void validateInput(ArrayList<String> array){
        Scanner scan = new Scanner(System.in);

        System.out.println("Insert a string and press enter to submit. Insert 'quit' to stop.");
        String input = scan.nextLine();

        if(input.length() == 0) {
            System.out.println("Invalid input. No string inserted.");
            //if input is invalid, run method again
            validateInput(array);
        } else {
            //if input is valid, add it to the arraylist
            array.add(input);
        }
    }
}