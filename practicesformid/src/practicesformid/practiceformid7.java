package practicesformid;
import java.util.*;
public class practiceformid7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner(System.in);
		System.out.print("Enter your number");
		int num = scan.nextInt();
		
		while(num != -1)
		{
			System.out.println(num);
			num = scan.nextInt();
		}
		
		for(  ;num != -1; )
		{
			num = scan.nextInt();
		}
		int positiveCount= 0, NegCount =0, zeroCount=0;
		while(true)
		{
			System.out.println(num);
			num = scan.nextInt();
			if(num == -1)
				break;
			if(num> 0)
				positiveCount++;
			else if(num <0)
				NegCount++;
			else
				zeroCount++;
		}
		
		System.out.println("End of the input");


	}

}
