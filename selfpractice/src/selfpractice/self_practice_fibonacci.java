package selfpractice;
import java.util.Scanner;

public class self_practice_fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner input=new Scanner(System.in);
System.out.print("enter the number upto which term you want to see the value of fibonacci \n");
int num=input.nextInt();
int a=0;
int b=1;
int c=0;
int i;
for(i=0;i<=num;i++) {
	c=a+b;
	
	a=b;
	b=c;
	System.out.println(c);
	
}
System.out.println("your final  number is :"+c);
	}

}
