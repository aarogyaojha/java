package stffproject;

import java.util.Scanner;

public class teaching extends staff
{
	String domain;
	String[] publications;
	int pno;
	
	public void read() 
	{
		super.read();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the domain");
		domain=sc.next();
		
		System.out.println("enter the number of publications");
		pno=sc.nextInt();
		publications=new String[pno];
		System.out.println("enter publication details");
		for (int i = 0; i < pno; i++) 
		{
			publications[i]=sc.next();
			
		}
	}
	
	public void display() 
	{
		super.display();
		
		System.out.println("the domain is"+domain);
		System.out.println("the publications are");
		for (int i = 0; i < pno; i++) 
		{
			System.out.println(publications[i]);
			
		}
	}
	
}
