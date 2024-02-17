package prime2;
import java.util.Scanner;
public class prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("enter the number that you want to check that is prime or not");
		int num=input.nextInt();
		int count=0;
		int i;
		for(i=1;i<=num;i+=1) {
			if(num%i==0) {
			count+=1;
		}}
if(count==2) {
	System.out.print("PRIME");
}
else {
	System.out.print("NOT PRIME");
}
	}
}