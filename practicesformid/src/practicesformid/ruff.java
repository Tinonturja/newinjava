package practicesformid;

import java.util.Scanner;

public class ruff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner input = new Scanner(System.in);
		System.out.print("enter your first number");
		double num1=input.nextFloat();
		System.out.print("enter your second number");
		double num2=input.nextFloat();
		/*System.out.print("enter your number");
		int num = input.nextInt();
		int a = 0;
		int b = 1;
		int c;
		int i;
		int count = 0;
		System.out.print(a + " " + b);
		for (i = 1; i <= num - 2; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(" " + c);
			int j;
			for (j = 2; j < c; j++) {
				if (c % j == 0) {
					break;
				}
			}
			if (j == c) {
				count += 1;
			}

		}
		System.out.println("\n"+count);*/
		System.out.print(Math.max(num1, num2));
		
	}

}
