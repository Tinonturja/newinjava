package selfpractice;
import java.util.Scanner;
public class nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.print("enter the number");
int num=input.nextInt();
int i,j;
for(i=1;i<=num;i++) ///outer loop control the number of the row
	{
	for(j=1;j<=num;j++)
///inner loop controls the number of the column		
	{
		System.out.print(j);
	}
	System.out.print("\n");
}
System.out.print("\n");
System.out.print("\n");
System.out.print("\n");
//pattern 2
System.out.print("enter your number \n");
int num2=input.nextInt();

for(i=1;i<=num2;i++) {
	for(j=1;j<=num2;j++) {
		System.out.print(i);
///the outer loop value that means value of i remains 1.
		///as it keeps the value of i constant.and the value of j changes.
		///the number of j equals to the number of column
	}
	System.out.print("\n");
}


	}

}
