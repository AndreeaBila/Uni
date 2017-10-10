import java.util.Scanner;

public class Ex4{
    public static void main(String args[]){
        //create a scanner object that will be used to scan keyboard inputs
        Scanner scan = new Scanner(System.in);

        //prompt the user to insert a mathematical expression
        System.out.print("Insert a mathematical expression: ");
        //save the input line in a string
        String mathExpression = scan.nextLine();
        //split the input in separate variables after each space
        String mathExpressionArray[] = mathExpression.split(" ");

        //save the values of the numbers in suggestive variables and tranform them from strings to numbers
        int firstNumber = Integer.parseInt(mathExpressionArray[0]);
        int secondNumber = Integer.parseInt(mathExpressionArray[2]);
        //create a variable to retain the result of the mathematical expression
        int result = 0;
        //create a variable which retains if there's an attempt to perform division by 0
        boolean divisionByZero = false;

        //perform appropriate operation deppending on input expression
        switch(mathExpressionArray[1]){
            case "+":
                result = firstNumber + secondNumber; 
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if(secondNumber == 0){
                    //check division by zero
                    divisionByZero = true;
                } else {
                    result = firstNumber / secondNumber;
                }
                
                break;
            case "%":
                if(secondNumber == 0){
                    divisionByZero = true;
                } else {
                    result = firstNumber % secondNumber;
                }
                break;
            default:
                result = 0;
                break;            
        }
        
        //if the divisionByZero variable is false, display the ressult
        if(!divisionByZero){
            System.out.println("Result: " + result);
        } else {
            //otherwise, display error message
            System.out.println("Division by 0 is disallowed");
        }
    }
}