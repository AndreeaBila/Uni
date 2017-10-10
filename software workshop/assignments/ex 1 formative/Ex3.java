import java.util.Scanner;

public class Ex3{
    public static void main(String args[]){
        //create a scanner object that will be used to scan keyboard inputs
        Scanner scan = new Scanner(System.in);

        //prompt the user to insert the first string
        System.out.print("Insert your first string: ");
        //save the inserted string in a variable
        String firstString = scan.next();

        //prompt the user to insert the second string
        System.out.print("Insert your second string: ");
        //save the inserted string in a variable
        String secondString = scan.next();

        //check if the two strings have the same length
        if (firstString.length() == secondString.length()){
            //create a boolean variable that represents if there's any character in one string and not in the other as well 
            boolean notFound = false;
            //iterate throught the characters of the first string
            for(int i=0;i<firstString.length();i++){
                //check if all the characters in the first string are in the second one
                if( secondString.indexOf(firstString.charAt(i)) == -1){
                    //if any unmatching charater is found then the two strings are not anagrams 
                    System.out.println("These strings are not anagrams of each other");
                    notFound = true;
                    break;
                }

            }
            if(notFound == true){
                //display message that the strings are not anagrams
                System.out.println("These strings are not anagrams of each other");
            }else{
                //display message that the strings are anagrams
                System.out.println("These strings are anagrams!");
            }
        //if the two strings have different lengths then they are not anagrams
        } else {
            System.out.println("These strings are not anagrams of each other");
        }
    
    }
}