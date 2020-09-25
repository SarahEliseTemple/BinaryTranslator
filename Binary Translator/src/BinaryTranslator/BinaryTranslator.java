package BinaryTranslator;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
/*Name: Sarah Temple
 * Date: September 25, 2020
 * Info about the project: This is a binary Translator that will translate from decimals to binary and vice versa.
 * I got help from Ryan Bae over discord. We were both struggling and we helped each other understand it better by talking through it.
 */
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
			} catch (IOException ex) { // This will print when the computer cannot find the file
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
		
		else {//binary to decimal
				int answer = 0;//this is the answer
				int charNum = 0;//this is the digit that we are working with at the moment
				int expoNum = numberInput.length() - 1;//this is the number 2 is to the power of to convert to a decimal
	            for (int a = numberInput.length()-1; a >= charNum; charNum++) {
	                if (numberInput.charAt(charNum) == '1') {//if charNum is 1 than we run these
	                    answer = answer + (int)(Math.pow(2, expoNum));//This is where its put to the power of
	                    //System.out.println("This is the number of digits - 1:"+a);
	                    //System.out.println("This is the character Number:"+charNum);
	                    //System.out.println("This is the number of exponents"+ expoNum);
	                }
	                else if (numberInput.charAt(charNum) == '0') {
	                	 //System.out.println("This is a zero: " + charNum);
	                }
	                expoNum--;
	            }
	            System.out.println("This is the answer: "+answer);
	              
		}
	            //System.out.println(answer);
		scanner.close();
	}
	
	public static void main(String[] args) {
		new BinaryTranslator ();

	}

}
