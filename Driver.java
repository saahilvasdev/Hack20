import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to the password generator");
		
		boolean again = true;	//Boolean variable that will be true if the user wants to do something else

		Scanner scan = new Scanner(System.in);
		
		while(again == true)
		{
			
		System.out.println("-Type 'Create' for a new password, \n-Type 'Update' to update a password");
		System.out.println("-Type 'Delete' to delete a password, \n-Type 'Retrieve' to get a password, or type 'Exit' ");
		
		
		String word = scan.nextLine();
		System.out.println();
		System.out.println("------------------------------------");

			//Determine what the user wants to do with the program
			switch(word)
			{
			//Case where the user wants to create a password
			case "Create":
				
				System.out.println("Enter 'New' to type your own password, or 'Generate' for a randomly generated password ");
				
				
				String pass = scan.nextLine();
				System.out.println();
				
				//Case where the user wants to type their own password
				if(pass.equalsIgnoreCase("New"))
				{
					System.out.println("Type your password");
					
					String theP = scan.nextLine();
					System.out.println();
					
					//Create a new password with the one the user chose
					Password password = new Password(theP);
					
					double strength = password.getStrength();
					
					//Return the strength of the password
					System.out.println("Strength of password '" + password.getPassword() + "' is " + strength);
					System.out.println("------------------------------------");
					System.out.println();
					
					
				}
				//Case where the user wants to have a generated password with certain characteristics
				else if(pass.equalsIgnoreCase("Generate"))
				{
					System.out.println("Do you want your password to contain Upper/Lower case letters, numbers, and/or symbols?");
					System.out.println("Type Y for each character you want, and N to not include the character ");
					System.out.println("(Upper/Lower case letters, Numbers, Symbols) ");
					
					//Prompts the user to determine what they want in their password
					String upperLower = scan.nextLine();
					System.out.println();
					String number = scan.nextLine();
					System.out.println();
					String symbol = scan.nextLine();
					System.out.println();
					
					//Boolean variables to help store whether or not the user wants this type of character in their password
					boolean upLow = false;
					boolean num = false;
					boolean sym = false;
					
					if(upperLower.equalsIgnoreCase("Y"))
					{
						upLow = true;
					}
					if(number.equalsIgnoreCase("Y"))
					{
						num = true;
					}
					if(symbol.equalsIgnoreCase("Y"))
					{
						sym = true;
					}
					
					System.out.println("How long do you want your password to be? (Between 1 & 99)");
					int length = scan.nextInt();
					System.out.println();
					
					//Creates a new password with the characters the user chose
					Password password = new Password(upLow, num, sym, length);
					
					double strength = password.getStrength();
					
					//Return the strength
					System.out.println("Strength of password '" + password.getPassword() + "' is " + strength);
					
					
				}
				
				
				break;
		
			//Case where the user wants to update a password
			case "Update":
			
				//Here we can go directly to our password manager where we ask for the master key
				//Once we access the passwords, the user chooses an account to change the password
				//returns whether the password is strong, weak ,or okay
				
				//ask the user if they want to do something else
				//if not then set 'again' to false
				
				break;
			
			//Case where the user wants to delete a password
			case "Delete":
			
				//Go directly to password manager where we ask for the master key
				//once we access the password, choose which account to delete
				//ask the user for the master key again to make sure we want to delete
			
				//ask the user if they want to do something else
				//if not then set 'again' to false
				
				break;
			
				//Case where the user wants to retrieve a password
			case "Retrieve":
			
				//Go directly to password manager where we ask for the master key
				//once we access the password, choose which account to retrieve
				//ask the user again for the master key
				//return the password as a string to the user
				
				//ask the user if they want to do something else
				//if not then set 'again' to false
				break;
			
			//User wants to exit the program
			case "Exit":
				
				System.out.println("Exiting the password manager...");
			
			//'again' turns to false meaning we are done with the password generator	
				again = false;
				
				break;
				
			default:
				System.out.println("No input entered");
				System.out.println("-----------------------------------");
				
				//boolean 'again' stays as true
			}
		
			
		}
		
		scan.close();
		
	}

	
}