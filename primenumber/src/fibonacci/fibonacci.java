package fibonacci;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
System.out.print("enter the value upto which you want to print the fibonacci number");
int num=input.nextInt();
int a=0;
int b=1;
int nextnumber=0;
int i;
System.out.print(a+" "+ b);
for(i=2;i<num;i+=1) {
	nextnumber=a+b;
	a=b;
	b=nextnumber;
	System.out.print(" "+nextnumber);
	
}
	}

}
