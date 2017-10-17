import java.util.Scanner;

public class Ex4x {
    public static void main(String[] args) {
        System.out.println("Type preffered Game Mode:");
        System.out.println("Single Player / Two players");
        String gameMode = scan.nextLine();

        switch(gameMode) {
            case "Single Player": System.out.println("You chose single player mode. Please choose your character: x or o");
                                break;

            case "Two Players": System.out.println("You chose two players mode. Please choose first player character: x or o");
                                break;
            
            default: System.out.println("Invalid input. You must chose one of the game modes");
        }
    }
} 