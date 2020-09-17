package BinaryTranslator;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class BinaryTranslator {

	public BinaryTranslator() {
		System.out.println("Please enter \"file\" so enter a file or \"input\" to see the console.");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String numberInput = "";
		if (input.equals("file")) { //input from a file
			try {
				System.out.println("Enter your file name");
				input = scanner.nextLine();
				Scanner fileScanner = new Scanner(new File(input));
			} catch (IOException ex) {
				System.out.println("File not found.");
				scanner.close();
				System.exit(1); 
			}
		}
		else if (input.equals("input")) { //access to the consule
			numberInput = scanner.nextLine();
		}
		
		else {
			System.out.println("Please type file or input.");
		}
		System.out.println(numberInput);
		scanner.close();
	}
	
	public static void main(String[] args) {
		new BinaryTranslator ();

	}

}
