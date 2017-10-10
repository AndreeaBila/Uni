import java.util.Scanner;

public class Ex1 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputs[] = new String[50];
        int stringCount = -1;

        for(int i = 0; i < inputs.length; i++) {
            System.out.println("Insert a string and press enter to submit. Insert 'quit' to stop.");
            inputs[i] = scan.nextLine();
            stringCount++;
            if (inputs[i].equals("quit")) {
                break;
            } else continue;
        }

        System.out.println("You entered " + stringCount + " strings.");
        System.out.println("These are your strings in order:");
        for (int i = 0; i < stringCount; i++) {
            System.out.println(i+1 + ". " + inputs[i]);
        }
    }
}