import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		System.out.print("Please Enter the digits. \n");
		//he main method reads a 4 digit integer from the user
		Scanner scan = new Scanner(System.in);
		int digits = scan.nextInt();
		
		scan.close();
		//The main method encrypts the user's value using Encrypter.encrypt
		Encrypter Encrypter = new Encrypter();
		 int encDigits = Encrypter.encrtpy(digits);
		
		//The main method prints the encrypted value to standard output
		System.out.print("this is the encrypted digits. \n");
		System.out.print( encDigits+"\n");
		
		//The main method decrypts the user's value using Decrypter.decrypt
		Decrypter Decrypter = new Decrypter(); 
		int decDigits =  Decrypter.decrypt(encDigits);
		
		//The main method prints the decrypted value to standard output
		System.out.print("this is decrypted digits.\n");
		System.out.print(decDigits+"\n");
		
	}
}

