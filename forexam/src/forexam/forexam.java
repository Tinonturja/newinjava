package forexam;
import java.util.Scanner;
public class forexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.print("enter the number you want to check for the prime number");
int num=input.nextInt();
int i;
for(i=2;i<num;i+=1) {
	if(num%i==0) {
		break;
	}}
	if (num==i) {
		System.out.print("PRIME");
		
	}
	else {
		System.out.print("NOT PRIME");
		
	}
}









	}


