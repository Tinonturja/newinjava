package forexam;
import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.print("enter the number of the terms of fibonacci number");
int num=input.nextInt();
int a=0;
int b=1;
int c=0;
int i;
System.out.print(a+" "+b);///in java '' and "" act differently
for (i=2;i<=num;i++) {
	c=a+b;
	a=b;
	b=c;
	System.out.print(" "+c);
}

	}

}
