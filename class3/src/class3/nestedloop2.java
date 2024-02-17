package class3;
import java.util.Scanner;
public class nestedloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
int num=input.nextInt();
int i,j;
for(i=1;i<=num;i++) {
	for(j=1;j<=num;j++)
		System.out.print(i);
	System.out.print("\n");
}

	}

}
