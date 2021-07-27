package finalTestJava22;

import java.util.Scanner;

public class pgOutput {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		char charInput;
		
		System.out.print("Enter Charecter : ");
		charInput = input.next().charAt(0);
		System.out.println("********************************");
		pgProcess a = new pgProcess(charInput);
		
	}
}
