package practicesformid;

import java.util.Scanner;

public class patternpractice {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int i, j, k,l,m=0;
	System.out.print("enter your number: ");
	int num=input.nextInt();
	for(i=1;i<=num;i++)
	{for(j=1;j<=num-i;j++) {
		System.out.print(" ");
	}
	for(k=1 ;k<=i;k++) {
		m+=1;
		System.out.print(m+" ");
			
		
	}
	for(l=1;l<=num-(i+1);l++) {
		System.out.print(" ");
	}
	System.out.println();
	}

//pattern 2
	System.out.print("enter your number: ");
	int num2=input.nextInt();
	int a,s;
	for(a=1;a<=num2;a++) {
		for(s=num;s>num-a;s--) {
			System.out.print(s);
		}
		System.out.println();
	}
	
	//pattern 3
	System.out.print("enter your number again: ");
	   int rows = input.nextInt();

       for (int d = rows; d>=1; d--) {
           for (int f = d; f<=rows; f++) {
               System.out.print(f);
           }
           System.out.println();
       }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
