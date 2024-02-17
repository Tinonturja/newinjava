package prime2;
import java.util.Scanner;

public class prime3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.print("enter the number upto which you want the prime number");
int num=input.nextInt();
int i;
int y;
int count=0;
for (i=3;i<num;i+=2) {
	for(y=2;y<i;y+=1) {
		if (i%y==0) {
			break;
			
		}
		System.out.print(i);
	}
}



	}

}
