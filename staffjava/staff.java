package stffproject;

import java.util.Scanner;

public class staff 
{
	String name;
	int staffid;
	float salary;
	long phoneno;
	
	public void read() 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name");
		name=sc.next();
		
		System.out.println("enter the staffid");
		staffid=sc.nextInt();
		
		System.out.println("enter the salary");
		salary=sc.nextFloat();
		
		System.out.println("enter the phoneno");
		phoneno=sc.nextLong();
		
	}
	
	public void display()
	{
		System.out.println("the name is"+name);
		System.out.println("the staffid is"+staffid);
		System.out.println("the salary is"+salary);
		System.out.println("the phoneno is"+phoneno);
	}
	

}
