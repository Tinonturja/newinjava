package practicesformid;
import java.util.Scanner;
public class midpractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner(System.in);
		float unit_price=52.5f;
		double price;
		System.out.println("enter the amount of pineapple you want to buy");
		int amount=input.nextInt();
		price=amount*unit_price;
		if(amount>=5 && amount<10) {
			price=price*.9;
			
		}
		else if(amount>=10) {
			price=price*.8;
		}
		price=(price*1.15)+50;
		double roundedprice=Math.round(price*10000)/10000.0;
		System.out.print("total price is: "+roundedprice);
		
	}

}
