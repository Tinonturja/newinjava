package practicesformid;

import java.util.Scanner;

public class practiceformid8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		/*System.out.print("Enter your number");
		int num = input.nextInt();
		
		
		 
		int positiveCount = 0, NegCount = 0, zeroCount = 0;
		for (; num != -1;) {
			System.out.print("Enter your number again");
			num = input.nextInt();
			if (num > 0) {
				positiveCount += 1;
			} else if (num < 0) {
				NegCount += 1;
			} else if (num == 0) {
				zeroCount += 1;
			}

		}
		System.out.print("positive count: " + positiveCount);
		System.out.print("negative count: " + NegCount);
		System.out.print("zero count: " + zeroCount);
		*/
		
		
		
		//style 2
		int p_count=0,n_count=0,z_count=0;
		while(true) {
			System.out.print("enter your number");
			int num=input.nextInt();
			if(num==-1) {
				break;
			}
			if(num>0) {
				p_count++;
			}
		else if(num<0) {
			n_count++;
		}
		else {z_count++;}
		}
		System.out.print("positive count: "+p_count);
		System.out.print("negative count: "+n_count);
		System.out.print("zero count: "+z_count);
	}
}
