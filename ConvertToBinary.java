package Convertion;

import java.util.Scanner;
	
	/**
	 * 
	 * ConertToinary class convert decimal numbers into binary 
	 * 
	 * @author David Sajdl
	 *
	 */
public class ConvertToBinary {
	
	/**
	 * it converts input number into binary number  
	 * 
	 * @param n integer is value that would be converted into binary number
	 * @return string as binary number
	 */
	public String convertIntoBinary(int n){
		// if input number is less than 2 return number 1 or 0
		if(n < 2) return Integer.toString(n);
		// convert value into binary and divide input number by 2 and send it back to method convertToBinary
		return convertIntoBinary(n/2) + ((n%2 == 0) ? "0": "1");
	}
	/**
	 * main method create new object ConvertToBinary()
	 * Then call method convertIntoBinary() with parameter 
	 * that contain first 15 numbers and print them out.
	 * It also allows user to enter value and convert it into binary.  
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// it create new object
		ConvertToBinary ctb = new ConvertToBinary();

		System.out.println("|-----------------|---------------------|");
		System.out.println("| Dec.\tBibary.\t  |\tDec.\tBinary. |");
		System.out.println("|-----------------|---------------------|");
		// convert first 15 numbers into binary and print them out 
		for(int i = 0; i < 8; i++){
			int j = 8 + i;
			String forDig = ctb.convertIntoBinary(i);
			if(forDig.length() == 1)forDig = "000" + forDig;
			else if(forDig.length() == 2) forDig = "00"+forDig;
			else if(forDig.length() == 3) forDig = "0"+ forDig;
			System.out.println("|  "+i + "\t " + forDig + " \t  |\t " + j + "\t " + ctb.convertIntoBinary(j) + "   |");
		}
		System.out.println("|-----------------|---------------------|\n");
		Scanner in = new Scanner(System.in);
		//display instruction
		String message = "Please enter decimal number for converting to binary"
		+ " or enter any chracter to finish.\nMax value number "+ Integer.MAX_VALUE + ": ";
		System.out.println(message);
		// allow user to enter integers until enter character
		while(true){
			if(in.hasNextInt()){
				int input = in.nextInt();
				System.out.println(input + " to binary is: " + ctb.convertIntoBinary(input));
				System.out.print(message);
			}
			else{
				in.close();
				return;
			}
			
		}
	}

}
