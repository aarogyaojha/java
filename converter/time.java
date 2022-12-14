package converter;

import java.util.Scanner;

public class time 
{
	double hour,min,sec;
	
	public void hrtomin()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the time in hr");
		hour=sc.nextDouble();
		double res=hour*60;
		System.out.println("result is: "+res+"min");
		
	}
	public void mintohr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the time in min");
		min=sc.nextDouble();
		double res=min/60;
		System.out.println("result is: "+res+"hr");
	}
	public void hrtosec()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the time in hr");
		hour=sc.nextDouble();
		double res=hour*60*60;
		System.out.println("result is: "+res+"sec");
	}
	public void sectohr()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the time in sec");
		sec=sc.nextDouble();
		double res=sec/(60*60);
		System.out.println("result is: "+res+"hr");
	}

}
