package evennum;
import java.util.Scanner;
public class evennumberfromdifferentstarting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);

System.out.println("enter your number from where do you want to start");
int start=input.nextInt();

System.out.println("enter the amount of even numbers you want to have");
int num=input.nextInt();
System.out.println(num*2);

int i;
for(i=start;i<=num*2;i+=1) {
	if (i%2==0)
		System.out.println(i);
	//it starts from the 
	}
//for (i=6;i<=16;i+=1) {
//	if //(i%2==0)
		///System.out.println(i);
	
}

}

