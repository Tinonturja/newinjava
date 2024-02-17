package class3;
import java.util.Scanner;
public class pattern2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("enter your number");
		int  num=input.nextInt();
		
	
	
		// TODO Auto-generated method stub
		int j,k,i;
		for(j=1;j<=num;j++) {
			for(k=num-j;k>=1;k--) {
				System.out.print(" ");
			}
			for(i=1;i<=j;i++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
			
		}
}