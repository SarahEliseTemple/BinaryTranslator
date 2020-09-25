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
				numberInput = fileScanner.nextLine();
			} catch (IOException ex) {
				System.out.println("File not found.");
				scanner.close();
				System.exit(1); 
			}
		}
		else if (input.equals("input")) { //access to the console
			numberInput = scanner.nextLine();
		}
		
		else {
			System.out.println("Please type file or input.");
		}
		System.out.println(numberInput); 
		System.out.println("If you are translating from decimal to binary, type \"dtb\"");
		System.out.println("If you are translating from binary to decimal type \"btd\"");
		input = scanner.nextLine();
		if (input.equals("dtb")) {// decimal to binary
			String answer = "";  
			int number = Integer.parseInt(numberInput);
			while (number > 0) {
				if (number % 2 == 1) {
					answer = "1" + answer;   
				} 
				else {
					answer = "0" + answer;
				}
				number = number/2;
			}
			System.out.println(answer);

		}
		
		else if (input.equals("btd") ) {//binary to decimal
				int answer = 0;
	            for (int a = numberInput.length()-1; a >= 0; a--) {
	                if (numberInput.charAt(a) == '1') {
	                    answer = answer + (int)(Math.pow(2, a));
	                    System.out.println(a);
	                }
	              
	            }
	            //System.out.println(answer);
		}
		else {
			System.out.println("Please redo the program and type dtb or btd.");
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		new BinaryTranslator ();

	}

}
