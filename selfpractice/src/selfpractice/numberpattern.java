package selfpractice;
import java.util.Scanner;

public class numberpattern {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter your number");
int num=input.nextInt();
int i,j;
for(i=1;i<=num;i++) {
	for(j=1;j<=i;j++) {
		System.out.print("*");
	}
	System.out.print("\n");
	
}

	}

}
