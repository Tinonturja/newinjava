package w3school;
import java.util.Scanner;
public class w3shool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your day");
		int day=input.nextInt();
		switch(day) {
		case 1:
			System.out.print("Saturday");
			break;
		case 2:
			System.out.print("Sunday");
			break;
		case 3:
			System.out.print("Monday");
			break;
		case 4:
			System.out.print("Tuesday");
			break;
		case 5:
			System.out.print("Wednesday");
			break;
		case 6:
			System.out.print("Thursday");
			break;
		case 7:
			System.out.print("Friday");
			break;
		}
	}

}
