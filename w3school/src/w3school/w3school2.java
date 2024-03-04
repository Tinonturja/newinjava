package w3school;

import java.util.Scanner;

public class w3school2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter the first number");
		int num1 = input.nextInt();
		System.out.println("enter the second number");
		int num2 = input.nextInt();
		String GreaterNumber = (num1 > num2) ? num1 + " is greater than " + num2 : num2 + " is greater than " + num1;
		System.out.print(GreaterNumber);
	}

}
