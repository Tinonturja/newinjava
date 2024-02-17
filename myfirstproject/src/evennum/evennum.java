package evennum;
import java.util.Scanner;

public class evennum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.print("enter your number that extent you want the even number up to");
int num=input.nextInt();
//for(initilization;condition;increment){}
int i;
for(i=0;i<num*2;i+=1) {
	if (i%2==0)
		System.out.println(i);
}
	}

}
