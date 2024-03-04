package forexam;
import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		System.out.println("Pattern 1");
	    Scanner input=new Scanner(System.in);
	    System.out.print("enter the number");
	    int num=input.nextInt();
	    int i,j;
	    for (i=1;i<=num;i++) {
	    	for(j=1;j<=num;j++) {
	    		System.out.print(j);
	    	}
	    	System.out.print("\n");
	    }
	    System.out.print("\n");
	    System.out.print("\n");
	    
//pattern-2
	    System.out.println("Pattern 2");
	    System.out.print("enter the number");
	    int num2=input.nextInt();
	    int m,n;
	    for (m=1;m<=num2;m++) {
	    	for(n=1;n<=num;n++) {
	    		System.out.print(m);
	    	}
	    	System.out.print("\n");
	    }
	    
	    System.out.print("\n");
	    System.out.print("\n");
//pattern-3
	    System.out.println("Pattern 3");
	    System.out.println("enter the number");
	    int num3=input.nextInt();
	    int o,p;
	    for (o=1;o<=num3;o++) {
	    	for(p=1;p<=o;p++) {
	    		System.out.print(p);
	    	}
	    	System.out.print("\n");
	    }
	    System.out.print("\n");
	    System.out.print("\n");
//pattern-4(with space)
	    //3 ta loop koraite hobe.ekta outer looop for row er jonno
	    //vitore 2 ta loop ghuraite hobe. one for space and another for number in each row
	    System.out.println("Pattern 4");
	    System.out.println("enter the number");
	    int num4=input.nextInt();
	    int e,r,t;
	    for (e=1;e<=num4;e++) {
	    	for(r=num4-e;r>=1;r--) {
	    		System.out.print(" ");
	    	}
	    	for(t=1;t<=e;t++) {
	    		System.out.print(t);
	    	}
	    	System.out.print("\n");
	    
	    }
	    System.out.print("\n");
	    System.out.print("\n");
    	
	    //pattern-5(with space triangle shaped)
	    System.out.println("Pattern 5");
	    System.out.println("enter the number");
	    int num5=input.nextInt();
	    int d,f,g,h;
	    for (d=1;d<=num5;d++) {
	    	for(f=num5-d;f>=1;f--) {
	    		System.out.print(" ");
	    	}
	    	for(g=1;g<=d;g++) {
	    		System.out.print(g);
	    		System.out.print(" ");}
	    	for	(h=num5-(d+1);h>=1;h--) {
	    		System.out.print(" ");
	    	}
	    	
	    	System.out.print("\n");  
	}
	    System.out.print("\n");
	    System.out.print("\n");
	    //pattern-6(with space triangle shaped)
	    
	}}
