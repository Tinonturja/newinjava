package fibonacci;
import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("enter the value of the last number of the fibonacci series");
		int num=input.nextInt();
		int a=0;
		int b=1;
		int i;
		int nextnumber=0;
		for(i=2;nextnumber<=num;i+=1) {
			
			
			nextnumber=a+b;
			System.out.println(nextnumber);
			a=b;
			b=nextnumber;
			//fibonacci=0,(0+1)1,1,(1+1)2,(1+2)3,(2+3)5,(2+3+5)8,13,21,34,
		}

	}

}
