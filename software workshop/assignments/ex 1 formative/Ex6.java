public class Ex6{
    public static void main(String[] args) {
        //read the input argument and save it in a variable
        String password = args[0];
        //create a variable to check if the password is secure or not
        boolean secure = true;

        //check if the password is long enough
        if(password.length() < 8) {
            //if the condition is met, the password is insecure and the secure variable becomes false
            secure = false;
            //display the reason why the password is insecure
            System.out.println("Your password is not long enough.");
        }

        //create boolean variable to check if there are any uppercase letters
        boolean uppercase = false;
        //iterate through the charaters of the password and check if any letter is uppercase
        for(int i = 0; i < password.length(); i++){
            if(Character.isUpperCase(password.charAt(i))) {
                //if the condition is met, uppercase becomes true
                uppercase = true;
            }
        }
        //if uppercase is false, no uppercase letter was found and the password is insecure
        if(!uppercase){
            secure = false;
            //display the reason why the password is insecure
            System.out.println("Your password does not containt any uppercase letter.");
        }

        //create a boolean variable to check if the password contains any digit
        boolean digit = false;
        //create a string that contains all digits to further use to check if the password has any digit
        String numbers = "0123456789";
        //iterate through the characters of the password and check if any of them is a digit
        for(int i = 0; i < password.length(); i++){
            if(numbers.indexOf(password.charAt(i)) != -1){
                digit = true;
            }
        }
        //if digit is false then no digit was found and the password is insecure
        if(!digit){
            secure = false;
            //display why the password is insecure
            System.out.println("Your password does not contain any digit.");
        }

        //check if the password contains any spaces
        if(password.indexOf(" ") != -1){
            //if any sapces are found the password is insecure
            secure = false;
            //display the reason why the password is insecure
            System.out.println("Your password contain spaces.");
        }
        
        //if the password passed all the checks display a message saying it is secure
        if(secure){
            System.out.println("Your password is strong enough.");
        } else{
            //if the password failed the checks display a message saying it is insecure
            System.out.println("Your password is not strong enough.");
        }
    }
}