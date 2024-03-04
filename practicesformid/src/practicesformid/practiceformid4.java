package practicesformid;

import java.util.Scanner;

public class practiceformid4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("enter the first number");
		double num1 = input.nextDouble();
		System.out.print("enter the second number");
		double num2 = input.nextDouble();
		int choice;
		
		
		do {
			System.out.print("enter your choice");	
			choice = input.nextInt();
			if (choice == 1) {
				double result = num1 + num2;
				System.out.print(result);

			} else if (choice == 2) {
				double result = num1 - num2;
				System.out.print(result);

			} else if (choice == 3) {
				double result = num1 * num2;
				System.out.print(result);

			} else if (choice == 4) {
				double result = num1 / num2;
				System.out.print(result);

			} else if (choice == 5) {
				double result = num1 % num2;
				System.out.print(result);

			} else if(choice == 6){
				double result = (num1 + num2) / 2;
				System.out.print(result);
			}
		} while (choice >= 1 && choice <= 6);

	}
}