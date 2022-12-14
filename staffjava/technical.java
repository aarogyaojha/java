package stffproject;

import java.util.Scanner;

public class technical extends staff
{
	int sno;
	String[] skills;
	
	public void read() 
	{
		super.read();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of skills");
		sno=sc.nextInt();
		skills=new String[sno];
		System.out.println("enter skills details");
		for (int i = 0; i < sno; i++) 
		{
			skills[i]=sc.next();
			
		}
	}
	
	public void display() 
	{
		super.display();
		System.out.println("the publications are");
		for (int i = 0; i < sno; i++) 
		{
			System.out.println(skills[i]);
			
		}
	}
		
		
}

