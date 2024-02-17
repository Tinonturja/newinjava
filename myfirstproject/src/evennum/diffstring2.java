package evennum;
import java.util.Scanner;
public class diffstring2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.print("Enter the number from where do you want to start");
int start=input.nextInt();
System.out.print("how many even numbers do you want from the staring point");
int num=input.nextInt();
int i;
int count=0;

for(i=start;count<num;i+=1) {
	if(i%2==0) {
		System.out.println(i);
		count=count+1;
	}
}


	
	
	
	
	
	
	
	}

}
