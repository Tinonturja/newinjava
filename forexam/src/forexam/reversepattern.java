package forexam;

import java.util.Scanner;

public class reversepattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("enter new number");
		int num = input.nextInt();
		int i, j;

		for (i = num; i >= 1; i--) {
			for (j = i; j <= num; j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}
