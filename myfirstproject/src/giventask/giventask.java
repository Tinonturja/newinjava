package giventask;
import java.util.Scanner;
public class giventask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("how much apple do you want to buy");
		//declare the data type of amount of apple
		int unit;
		//now call a scanner
		Scanner input=new Scanner(System.in);
		//assign the variable unit in the new scanner
		unit=input.nextInt();
		float unit_price_of_apple=15.0f;
		//before declare the bill value you have to declare the data type of bill
		double bill;
		bill=unit*unit_price_of_apple;
		//check the bill. if the buying unit of the user exceeds 10 units but don't cross the limit
		//of 20 units 5% vat will be applicable.in case of greater than 20 units 10% applicable
		
		if(unit>0 && unit<=10) {
			bill=bill;
		}
		else if (unit>10 && unit<=20) {
			bill=bill*1.05;
		}
		else
		{bill =bill*1.1;}
		
		//now ask the user weather he would take it as home delivery or not
		boolean hd;
		System.out.print("how do like to collect your parcel?(yes/no)");
		hd=input.nextBoolean();
		boolean tips;
		if(hd) {
			bill=bill+40;
			System.out.print("do you want to give some tips?(yes/no)");
			tips=input.nextBoolean();
			if(tips) {
				float tip_amount;
				System.out.print("how much tips do want to give?");
				tip_amount=input.nextFloat();
				bill=bill+tip_amount;
			}
			else {
				bill=bill;
			}
			bill=bill;
		}
		
		System.out.print("your bill is "+bill);
		
		
		
	}

}
