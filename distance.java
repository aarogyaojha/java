package converter;

import java.util.Scanner;

public class distance {
	
	double meter,km,miles;
	
	public void metertokm()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the distance in meter");
		meter=sc.nextDouble();
		double res=meter/1000;
		System.out.println("result is: "+res+"km");
	}
	
	public void kmtometer()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the distance in meter");
		km=sc.nextDouble();
		double res=km*1000;
		System.out.println("result is: "+res+"meter");
	}
	
	public void kmtomiles()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the distance in km");
		km=sc.nextDouble();
		double res=km/1.6;
		System.out.println("result is: "+res+"miles");
	}
	
	public void milestokm()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the distance in miles");
		km=sc.nextDouble();
		double res=km*1.6;
		System.out.println("result is: "+res+"km");
	}

}
	
