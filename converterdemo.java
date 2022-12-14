package converter;

import java.util.Scanner;

public class converterdemo
{

	public static void main(String[] args) 
	{
		int choice,x,ch;
		currency c1=new currency();
		time t1=new time();
		distance d1=new distance();
		
		do
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("for currency converter press 1");
			System.out.println("for time converter press 2");
			System.out.println("for distance converter press 3");
			ch=sc.nextInt();
			switch (ch)
			{
				case 1:
				{
						System.out.println("to convert from rs to dollar press 1");
						System.out.println("to convert from dollar to rs press 2");
						System.out.println("to convert from euro to rs press 3");
						System.out.println("to convert from rs to euro press 4");
						System.out.println("to convert from rs to yen press 5");
						System.out.println("to convert from yen to rs press 6");
						System.out.println("enter your choice");
						
						choice=sc.nextInt();
						switch (choice) 
						{
							case 1:
								c1.rstodollar();
								break;
							case 2:
								c1.dollartors();
								break;
							case 3:
								c1.eurotors();
								break;
							case 4:
								c1.rstoeuro();
								break;
							case 5:
								c1.rstoyen();
								break;
							case 6:
								c1.yentors();
								break;
						 }
				}
				break;
				case 2:
				{
						System.out.println("to convert from hr to min press 1");
						System.out.println("to convert from min to hr press 2");
						System.out.println("to convert from hr to sec press 3");
						System.out.println("to convert from sec to hr press 4");
						System.out.println("enter your choice");
						
						choice=sc.nextInt();
						switch (choice)
						{
							case 1:
								t1.hrtomin();
								break;
							case 2:
								t1.mintohr();
								break;
							case 3:
								t1.hrtosec();
								break;
							case 4:
								t1.sectohr();
								break;
						 }
				}
				break;
				case 3:
				{
						System.out.println("to convert from meter to km press 1");
						System.out.println("to convert from km to meter press 2");
						System.out.println("to convert from miles to km press 3");
						System.out.println("to convert from km to miles press 4");
						System.out.println("enter your choice");
						
						choice=sc.nextInt();
						switch (choice) 
						{
							case 1:
								d1.metertokm();
								break;
							case 2:
								d1.kmtometer();
								break;
							case 3:
								d1.milestokm();
								break;
							case 4:
								d1.kmtomiles();
								break;
						 }
				}
				break;
					
			}
			
			System.out.println("enter 0 to continue and 1 to exit");
			x=sc.nextInt();
		}while(x==0);
	}

}
