package selfpractice;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///prime number is related.a number will be prime if 
		///it isn't devided by any number
		Scanner input=new Scanner(System.in);
		System.out.print("enter the number you wanna check prime or not prime");
		int num=input.nextInt();
		int i;
		for(i=2;i<num;i++) {
			if(num%i==0) {
				break;
			}
		}
		if(i==num) {
			System.out.print("prime");
			
		}
		else {
			System.out.print("notprime");
		}
input.close();
	}

}
