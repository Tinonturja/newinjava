package primenumber;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("enter the last value of the number till which you want the prime number");
int num=input.nextInt();
int count=0;
int i;

for(i=1;i<num;i+=1) {
	if (num%i==0) {
		count+=1 ;}}
if(count==2) {
		System.out.print("EVEN");}
else {
			System.out.print("ODD");
		}
		

}

		
		
	}


