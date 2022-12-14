package project1;

import java.util.Iterator;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) 
	{
		int num,flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the num");
		num=sc.nextInt();
		
		for(int i=2;i<num;i++)
		{
			if (num%i==0)
			{
				flag=1;
				break;
			}
		}
		
		if (flag==0 || num==1)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}

	}

}
