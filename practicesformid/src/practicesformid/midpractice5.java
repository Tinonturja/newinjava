package practicesformid;
import java.util.Scanner;
public class midpractice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.print("enter your number ");
		int num=input.nextInt();
		do {System.out.print("enter your number again");
		num=input.nextInt();
		
		}while(num!=-1);

	}

}
