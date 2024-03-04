package object;
import java.util.Scanner;

public class student {

	public  int id;
	public  String name;
	public float cgpa;
	
	/*constructor way
	constructor er kaj holo variable initialize kora.it almost looks like
	method.but etar kono return type nai
	public Student(int id,String name, cgpa){
	this.name=name;
	this.cgpa=cgpa;(here the variable with this is class variable) 
	}
	//constructor overloading
	 public Student(){
	 }variable can be two types
	 local and class
	 
	 
	*
	*
	*
	*
	*
	*
	*
	*/
	Scanner input=new Scanner(System.in);
	public void Display() {
		System.out.print("enter your id");
		id=input.nextInt();
		System.out.print("enter your name");
		name=input.next();
		System.out.print("enter your cgpa ");
		cgpa=input.nextFloat();
		System.out.println("Student id: "+id+ "name: "+name+ "cgpa: "+cgpa);
		
	}
public  void FindMax(float cgpa1,float cgpa2,float cgpa3) {
	if (cgpa1>cgpa2 && cgpa1>cgpa3) {
		System.out.print("highest cgpa"+ cgpa1);
	}
	else if(cgpa2>cgpa3 && cgpa2>cgpa1) {
		System.out.print("highest cgpa"+ cgpa2);
}
	else {
		System.out.print("highest cgpa"+ cgpa3);
	}
		
	}
}///access modifier+return type+null
