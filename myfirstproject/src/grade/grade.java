package grade;
import java.util.Scanner;
public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("tinon turja");

		float number;
		System.out.print("enter your grade: \n");
		Scanner input=new Scanner(System.in);
		
		number=input.nextFloat();
		
		System.out.println("your number is:" +number);
		
		
		if(number>=0 && number<55) {
			System.out.print("your grade is C");
		}
		else if (number>=55 && number<80) {
			System.out.print("your grade is B");
	}
		else if (number>=80 && number<90) {
			System.out.print("your grade is A");
	}
		else if (number>=90 && number<100) {
			System.out.print("your grade is A+");
	}
		else {
			System.out.print("invalid grade");
		}
		
}
}