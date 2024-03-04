package practicesformid;

public class midpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Write a java program to show the first 20 numbers of the following series:
//0, 1, 2, 5, 12, 29, 70, 169, 408, 985, 2378, 5741, 13860, 33461
		
		int a=0;
		int b=1;
		int c=2;
		int d;
		int i;
		
		System.out.print(a+" "+b+" "+c);
		
		//int count=2;
		for(i=1;i<=17;i++) {
			
			d=c*2+b;
			System.out.print(" "+d);
			
			b=c;
			c=d;
			//if(d%2==0) {
				//count+=1;
			//}
			
			
			
		}

	}

}
