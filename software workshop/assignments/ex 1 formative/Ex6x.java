public class Ex6x{
    public static void main(String[] args){
		//if no arguments are inserted display instructions
		if (args.length == 0){
			System.out.println("Type 'java Ex6x help' for instructions on using this program");

		//if the argument "help" is inserted display instructions
		} else if (args.length == 1 && args[0].equals("help")){
			System.out.println("To run this program you must insert your username, date of birth and password."); 
			System.out.println("Each of these must be separated by one space and inside quote marks.");
			System.out.println("Example: 'yourUsername' '01/01/90' 'yourPassword'");
			System.out.println("Your date of birth must be written in the following format: dd/mm/yy.");
			System.out.println("Your password must not contain any detail from your username or date of birth.");
			System.out.println("Your password must not contain any spaces.");
			System.out.println("Your password must be at least 8 characters long and contain at least one digit and one uppercase letter.");

		//if the required arguments aren't inserted, display error message
		} else if (args.length == 1 && !args[0].equals("help")){
			System.out.println("Please insert all the required information (usernme, date of birth and password)");
		} else if (args.length == 2){
			System.out.println("Please insert all the required information (usernme, date of birth and password)");

		//if the correct number of arguments is introduced, run the checking program
		} else if(args.length == 3){
		
			//save the values of the inserted arguments in suggestive variables for further use
			String username = args[0];
			String dateOfBirth = args[1];
			String password = args[2];
			//create a boolean variable that states the status of the password (secure or insecure)
			boolean secure = true;
			//create a string of digits to further use in checking if a character is a digit 
			String numbers = "0123456789";
		
			//the required date of birth format is dd/mm/yy
			//create a boolean variable that represents if the entered date is correct or not
			boolean correctDate = true;
			//check the length of the inserted date
			if(dateOfBirth.length() != 8){
				//if the date doesn't have 8 characters ("dd/mm/yy") it is not correct
				correctDate = false;
				
			} else {
			//if the date is the required length, proceed to further checks
				//check that the right separators ("/") are used and placed accordingly 
				if(dateOfBirth.charAt(2) != '/' || dateOfBirth.charAt(5) != '/'){
					correctDate = false;
				} else {
				
					//check that all characters in the date of borth are digits except the '/' separators
					//iterate  through the characters of the dateOfBirth
					for(int i = 0; i < dateOfBirth.length(); i++){
						if(dateOfBirth.charAt(i) == '/') {
							//when encountering the "/", skip to the next character
							continue;
						} else 
						//check if each character in the date of birth is found in the numbers string ("0123456789")
						if(numbers.indexOf(dateOfBirth.charAt(i)) == -1){
							//if it isn't, the character is not a digit therefore the date is incorrect 
							correctDate = false;
							//if a character that is not a digit is found, break the loop
							break;
						} else {
							//if the current character is a digit, move on to the next character
							continue;
						}
						
					}
				}
			}
			
			//if the correctDate variable is false after the previous tests, the date is incorrect therefore print an error message
			if(!correctDate) {
				System.out.println("The date of birth you entered does not meet the requirements. Please insert a date in the following format: dd/m/yy (yy = the last two digits of the year)");
			//otherwise, the date is correct and the algorith continues
			} else {
				//split the date of birth in three separate variables to check usage of each detail in the password
				String birthDay = dateOfBirth.substring(0,2);
				String birthMonth = dateOfBirth.substring(3,5);
				String birthYear = dateOfBirth.substring(6);

				//check if the password contains the entire date of birth
				if(password.toLowerCase().contains(dateOfBirth.toLowerCase())){
					//if the password contains information from the date of borth then it is not secure 
					secure = false;
					//print the reason why the password is insecure
					System.out.println("Your password contains your date of birth.");
				}
				
				//check if the password contains the birth day
				if(password.toLowerCase().contains(birthDay.toLowerCase())){
					//if the password contains information from the date of borth then it is not secure 
					secure = false;
					//print the reason why the password is insecure
					System.out.println("Your password contains your day of birth.");
				}
		
				//check if the password contains the birth month
				if(password.toLowerCase().contains(birthMonth.toLowerCase())){
					//if the password contains information from the date of borth then it is not secure 
					secure = false;
					//print the reason why the password is insecure
					System.out.println("Your password contains your month of birth.");
				}
		
				//check if the password contains the birth year
				if(password.toLowerCase().contains(birthYear.toLowerCase())){
					//if the password contains information from the date of borth then it is not secure 
					secure = false;
					//print the reason why the password is insecure
					System.out.println("Your password contains your year of birth.");
				}
		
			}
			//end date of birth checks

			//check that the password is the required length
			if(password.length() < 8) {
				//if the requirements are not met, the password is insecure
				secure = false;
				//print the reason why the password is insecure
				System.out.println("Your password is not long enough.");
			}
			
			//create boolean variable that represents if the password contains an uppercase letter or not
			boolean uppercase = false;
			//iterate through the characters of the password and check for any uppercase letter
			for(int i = 0; i < password.length(); i++){
				if(Character.isUpperCase(password.charAt(i))) {
					//if one uppercase letter is found, the condition is verified
					uppercase = true;
				}
			}

			//no uppercase letter was found
			if(!uppercase){
				//if the requirements are not met, the password is insecure
				secure = false;
				//print the reason why the password is insecure
				System.out.println("Your password does not containt any uppercase letter.");
			}

			//create boolean variable that represents if the password contains any digit or not
			boolean digit = false;
			//iterate through the characters of the password and check for any digit
			for(int i = 0; i < password.length(); i++){
				if(numbers.indexOf(password.charAt(i)) != -1){
					//if one digit is found, the condition is verified
					digit = true;
				}
			}

			//no digit was found
			if(!digit){
				//if the requirements are not met, the password is insecure
				secure = false;
				//print the reason why the password is insecure
				System.out.println("Your password does not contain any digit.");
			}

			//verify if the password contains any spaces
			if(password.indexOf(" ") != -1){
				//if the requirements are not met, the password is insecure
				secure = false;
				//print the reason why the password is insecure
				System.out.println("Your password contain spaces.");
			}
		
			//verify if the password contains the username
			if(password.toLowerCase().contains(username.toLowerCase())){
				//if the condition is true, the password is insecure
				secure = false;
				//print the reason why the password is insecure
				System.out.println("Your password contains your username.");
				}

				
			//if the secure variable is true then the password passed the checks and is secure
			if(secure){
				System.out.println("Your password is strong enough.");

			//if the secure variable is false, the password failed the checks and is insecure
			} else{
				System.out.println("Your password is not strong enough.");
			}

	
		} else {
			// if more than 3 arguments were introduced, this message is displayed
			System.out.println("Your insertion does not meet the requirements. Please review the instructions by typing 'java Ex6x help'");
		}

    }
}
