import java.util.Scanner;

public class Ex2{
    public static void main(String args[]){
        //create a scanner object that will be used to scan keyboard inputs
        Scanner scan = new Scanner(System.in);

        //prompt the user to insert their name
        System.out.print("Insert your full name: ");

        //save the input name in a string
        String name = scan.nextLine();
        //split the name string in array of individual strings at each encunter of a space.
        String nameArray[] = name.split(" ");
        //iterate through the name array and display it
        for(int i=0;i<nameArray.length;i++){
            System.out.println(nameArray[i]);
        }
    }
}