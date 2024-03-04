package practicesformid;
import java.util.Scanner;

public class midpractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.print("enter the first number");
int num1=input.nextInt();
System.out.print("enter the second number");
float num2=input.nextFloat();
System.out.print("enter the third number");
double num3=input.nextDouble();
double result;
result=(Math.pow(num1,(num2+num3))-100)/(num1*num2);
String formated_result=String.format("%.2f", result);
System.out.print(formated_result);
if(num1>num2 && num1>num3) {
	System.out.println("Largest: "+num1);
	
}
else if(num2>num1 && num2>num3) {
	System.out.println("Largest: "+num2);
}
else {
	System.out.println("Largest: "+num3);
}
	}

}
