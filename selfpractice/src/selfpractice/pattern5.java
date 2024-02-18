package selfpractice;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter your number");
		int num=input.nextInt();
		int i,j,k,l;
		for(i=0;i<=num;i++) {
			for(j=num-i;j>num-i;--j) {
				
				System.out.print(j);
			}
			System.out.println();
		}
		

		
	}

}
