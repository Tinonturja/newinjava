package gradeagain;
///if we want to allow the useer to give a input we first import the Scanner
import java.util.Scanner;

public class gradeagain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		///to calculate a result of a student at first we have to take the number as the input of 
		///the student
		///51-60->>D, 61-70->>c, 71-80->>b,81-90->>A, 91-100->>A+
		
		
		///first declare the data type that the user can entry
		///maarks can be decimal.so we should take float number
		float marks;
		
		///secondly ask the user to give the number as input
		System.out.println("enter your marks in the exam");
		
		Scanner input=new Scanner(System.in);
		marks=input.nextFloat();
		
		if (marks>0 && marks<50) {
			System.out.print("You are fail");
		}
		else if (marks>=50 && marks<60){
			System.out.print("Your grade is D");
		}
		else if (marks>=60 && marks<70){
			System.out.print("Your grade is C");
		}
		else if (marks>=70 && marks<80){
			System.out.print("Your grade is B");
		}
		else if (marks>=81 && marks<90){
			System.out.print("Your grade is A");
		}
		else if (marks>=91 && marks<100){
			System.out.print("Your grade is A+");
		}
		else{
			System.out.print("your grade is out of the world");
		}
	}

}
