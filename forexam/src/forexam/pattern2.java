package forexam;
import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Pattern 5");
	    System.out.println("enter the number");
	    int num5=input.nextInt();
	    int d,f,g,h;
	    int a=0;
	    
	    for (d=1;d<=num5;d++) {
	    	for(f=num5-d;f>=1;f--) {
	    		System.out.print(" ");
	    	}
	    	for(g=1;g<=d;g++) {
	    		a+=1;
	    		System.out.print(a);
	    		System.out.print(" ");}
	    	for	(h=num5-(d+1);h>=1;h--) {
	    		System.out.print(" ");
	    	}
	    	
	    	System.out.print("\n");  

	}
	    int num=input.nextInt();
	    int i,j;
		for(i=num;i>=1;i--) {
			for (j=i;j<=num;j++) {
				System.out.print(j);

}
}}}