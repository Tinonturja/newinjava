package practicesformid;
import java.util.Scanner;
public class practiceformid9 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int num;
	
	int Larger= 0, Smallest =0, LCount=0, SCount=0;
	while(true)
	{
		System.out.println("enter your number: ");
		num = scan.nextInt();
		if(num == -1)
			break;
		if(num> Larger)
		{
			Larger = num;
			LCount = 1;
		}
		else if(num == Larger)
		{
			LCount++;
		}
		
		if(num< Smallest)
		{
			Smallest = num;
			SCount = 1;
		}
		else if(num == Smallest)
		{
			SCount++;
		}

	}
	
	System.out.println("Larger number is :"+Larger);
	System.out.println("Smaller number is :"+Smallest);
	
}
}
