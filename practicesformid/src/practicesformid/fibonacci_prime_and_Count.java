package practicesformid;

import java.util.Scanner;

public class fibonacci_prime_and_Count {

	public static void main(String[] args) {

		/*
		 * Scanner input = new Scanner(System.in); //for_fibonacci
		 * System.out.println("enter your number"); int num = input.nextInt(); int a =
		 * 0; int b = 1; int c; int i; int count = 0; // System.out.print(a+" "+b); for
		 * (i = 1; i <= num - 2; i++) { c = a + b; // System.out.print(" "+c);[fibonacci
		 * number will be printed] a = b; b = c; // System.out.print(" "+c); int j; for
		 * (j = 2; j < c; j++) { if (c % j == 0) { count = count; break; } } if (c == j)
		 * { count = count + 1;
		 * 
		 * }
		 * 
		 * } System.out.print(count);
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("enter your number");
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
		System.out.println(count);

	}

}
