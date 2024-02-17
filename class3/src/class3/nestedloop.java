package class3;
import java.util.Scanner;
public class nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.print("enter the number");
int num=input.nextInt();
int i,j;
for(i=1;i<=num;i++)
//outerloop maintain kore koyta row hobe
	{
	for(j=1;j<=num;j++) {
		System.out.print(j);
		//innerloop maintain kore koyta column hobe
	}
	System.out.print('\n');
}
	}

}
