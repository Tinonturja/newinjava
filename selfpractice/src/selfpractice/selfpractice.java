package selfpractice;
import java.util.Scanner;
public class selfpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("how much apple do you want to buy?");
int amount_of_apple=input.nextInt();
int unit=15;
double bill=unit*amount_of_apple;
if (amount_of_apple<10) {
	bill=bill;
}
else if(amount_of_apple>10 && amount_of_apple<20) {
	bill=bill*1.05;
	
}
else {
	bill=bill*1.2;
}

System.out.println("do you want your parcel as home delilvery?(true/false)");
boolean hd=input.nextBoolean();
if(hd==true) {
	bill=bill+40;
	System.out.println("you want to give some tips or not?(true/false)");
	boolean tips=input.nextBoolean();
	if(tips==true) {
		System.out.print("how much you want to give tips?");
		int amount_of_tips=input.nextInt();
		bill=bill+amount_of_tips;
	}
	
	
}
else {
	bill=bill;
}
System.out.print("your total bill is ; "+bill);
input.close();

	}

}
