import java.util.Scanner;
import java.util.ArrayList;

public class Ex2 {
    public static void main (String[] args) {
        //use array list instead of normal array to be able to insert any number of strings
        ArrayList<String> inputs = new ArrayList<String>();

        //add valid inputs to the inputs arraylist until user enters "quit" 
        do {
            validateInput(inputs);            
        } while(!inputs.get(inputs.size() - 1).toLowerCase().equals("quit"));

        //sort the arraylist by length
        boolean swapped = true;
        while(swapped == true) {
            swapped = false;
            for(int i = 1; i < inputs.size(); i++) {
                if(inputs.get(i - 1).length() > inputs.get(i).length()) {
                    String aux = inputs.get(i);
                    inputs.set(i, inputs.get(i - 1));
                    inputs.set(i - 1, aux);
                    swapped = true;
                }
            }
        }        
        
        //if the user only inserted "quit" display this
        if(inputs.size() == 1) {       
            System.out.println("You didn't enter any strings.");
            
        //if they inserted more strings, give them information
        } else {
            System.out.println("Your strings sorted:");
            //display strings in ascending length order
            for(int i = 0; i < inputs.size(); i++) {
                if(!inputs.get(i).toLowerCase().equals("quit")){
                    //display the strings in the array if they aren't "quit"
                    System.out.println(inputs.get(i));
                }
            }

            //display strings in ascending length order
            for(int i = inputs.size() - 1; i >= 0; i--) {
                if(!inputs.get(i).toLowerCase().equals("quit")){
                    System.out.println(inputs.get(i));
                }
            }

            System.out.println("The longest string is '" + inputs.get(inputs.size()-1) + "' with a length of " + inputs.get(inputs.size()-1).length() + " characters.");
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