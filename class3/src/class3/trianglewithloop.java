package class3;
import java.util.Scanner;
public class trianglewithloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.print("enter your number");
int num=input.nextInt();
int i,j;
for(i=1;i<=num;i++) {
	for (j=5-i;j>1;j--) {
		System.out.print(" ");
	}
	for(j=1;j<=i;j++) {
		System.out.print(i);
		
	}
	System.out.print("\n");
}
	}

}
