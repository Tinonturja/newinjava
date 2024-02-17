package prime2;
import java.util.Scanner;
public class primeaccordingtomaam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("enter the value of your number");
		int num=input.nextInt();
		int i;
for (i=2;i<num;i++) {
	if(num%i==0) {
		break;
		///i jodi prime na hoy tahole j kono number diye eta divide hobe
	 ///and sathe sathe loop break korbe
		
	}
	///jodi number ta prime hoy tahole loop purota ghurbe and when 
	///i=num hobe tokhon e loop theke ber hoye ashbe 
}

if(i==num) {
	System.out.print("Prime");
}
else {
	System.out.print("notprime");
}
	}

}
