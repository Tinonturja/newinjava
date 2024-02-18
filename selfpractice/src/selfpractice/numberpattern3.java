package selfpractice;
import java.util.Scanner;
public class numberpattern3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter your number");
		int num=input.nextInt();
		int i,j,k,l;
		for(i=1;i<=num;i++) {
			for (j=num-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
				System.out.print(k);
				System.out.print(' ');
			}
			for(l=num-(i+1);l>=1;l--) {
				System.out.print(' ');
			}
			System.out.println();
		}
		
	                                                            

	}

}
