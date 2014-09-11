package Convertion;
import java.util.Scanner;

/**
 * ConvertToHex class convert decimal numbers to hexadecimal number
 * 
 * @author David Sajdl
 *
 */
public class ConvertToHex {

	/**
	 * convert input number to hexadecimal number 
	 * @param input integer value to be converted into hex
	 * @return hexadecimal value
	 */
	public String convertIntoHex(int input){
		// if the value is less than 16 convert value
		if(input < 16) {
			return ""+ (char) ((input % 16 >= 10) ?  ((int) 'A' + input % 16 - 10) :(int) '0' + input % 16);
		}
		//else convert value into hex and divide value by 16 and sent it to convertIntoHex method 
		return "" + convertIntoHex(input/16) + (char) ((input % 16 >= 10) ?  ((int) 'A' + input % 16 - 10) :(int) '0' + input % 16);
}
	
	/**
	 * main method convert first 30 numbers into hex and print them out
	 * Then allow  to user entered value and convert it into hex
	 * 
	 * @param args
	 */
	public static void main(String[]args){
		// create new object ConvertToHex()
		ConvertToHex cth = new ConvertToHex();
		//convert first 30 integers into hex and print them out
		System.out.println("Dec.\tHex.\t\tDec.\tHex.");
		for(int i = 0; i <= 15; i++){
			int j = 16 + i;
			System.out.println(i + "\t " + cth.convertIntoHex(i) + " \t|\t " + j + "\t " + cth.convertIntoHex(j));
		}
		Scanner in = new Scanner(System.in);
		String message = "Please enter decimal number for converting to hex"
		+ " or enter any chracter to finish.\nMax value number "+ Integer.MAX_VALUE + ": ";
		System.out.println(message);
		// allow to input integer until any character is entered
		while(true){
			if(in.hasNextInt()){
				int input = in.nextInt();
				System.out.println(input + " to hex is: " + cth.convertIntoHex(input));
				System.out.print(message);
			}
			else{
				in.close();
				return;
			}
			
		}
	}

}
