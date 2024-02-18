package selfpractice;

import java.util.Scanner;

public class numberpatern4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter your number");
		int num=input.nextInt();
		int i,j,k,l;
		for(i=1;i<=num;i++) {
			for(j=num;j>num-i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		

	}

}
