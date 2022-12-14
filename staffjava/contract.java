package stffproject;

import java.util.Scanner;

public class contract extends staff
{
	int period;
	
	public void read() 
	{
		super.read();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the time period");
		period=sc.nextInt();
	}
	
	public void display() 
	{
		super.display();
		System.out.println("the time period is"+period+"yr");
	}

}
