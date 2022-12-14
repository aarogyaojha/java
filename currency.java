package converter;

import java.util.Scanner;

public class currency {

	double rs,dollar,euro,yen;
	
	public void rstodollar() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rs");
		rs=sc.nextDouble();
		double res=rs/82.53;
		System.out.println("result is: "+res);
					
	}
	
	public void dollartors()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the dollar");
		dollar=sc.nextDouble();
		double res=dollar*82.53;
		System.out.println("result is: "+res);
		
	}
	
	
	public void eurotors()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the euro");
		euro=sc.nextDouble();
		double res=euro*86.3;
		System.out.println("result is: "+res);
	}
	
	public void rstoeuro()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rs");
		rs=sc.nextDouble();
		double res=rs/86.3;
		System.out.println("result is: "+res);
	}
	
	public void rstoyen()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rs");
		rs=sc.nextDouble();
		double res=rs/0.61;
		System.out.println("result is: "+res);
	}
	
	public void yentors()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the yen");
		yen=sc.nextDouble();
		double res=yen*0.61;
		System.out.println("result is: "+res);
	}
	

}
