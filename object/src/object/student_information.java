package object;

import java.util.Scanner;

public class student_information {
	public static void main(String[] args) {
		student st1 = new student();
		student st2 = new student();
		student st3 = new student();
		Scanner input=new Scanner(System.in);
		/*System.out.print("Enter the name of the first Student");
		st1.name=input.next();
		st1.id = input.nextInt();
		st1.cgpa = input.nextFloat();
		st2.name=input.next();
		st2.id = input.nextInt();
		st2.cgpa = input.nextFloat();
		st3.name=input.next();
		st3.id = input.nextInt();
		st3.cgpa = input.nextFloat();*/
		st1.Display();
		st2.Display();
		st3.Display();
		student cgpa_calculation = new student();
		cgpa_calculation.FindMax(st1.cgpa, st2.cgpa, st3.cgpa);

	}
}
