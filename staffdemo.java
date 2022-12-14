package stffproject;

import java.util.Scanner;

public class staffdemo 
{

	public static void main(String[] args) 
	{
		int tno,t1no;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no of teaching staff");
		tno= sc.nextInt();
		teaching[] t=new teaching[tno];
		
		for (int i = 0; i < tno; i++) 
		{
			t[i]=new teaching();
			System.out.println("enter the"+i+1+"teaching details" );
			t[i].read();
		}
		System.out.println("teaching staffs details are");
		for (int i = 0; i < tno; i++) 
		{
			t[i].display();
			System.out.println("------------------");
				
		}
		
		System.out.println("enter the no of the technical staffs");
		t1no=sc.nextInt();
		technical[] t1=new technical[t1no];
		
		for (int i = 0; i < t1no; i++) 
		{
			t1[i]=new technical();
			System.out.println("enter the"+i+1+"technical details" );
			t1[i].read();
		}
		System.out.println("technical staffs details are");
		for (int i = 0; i < t1no; i++) 
		{
			t1[i].display();
			System.out.println("------------------");
				
		}
		
		System.out.println("enter the no of the contract staffs");
		int t2no = sc.nextInt();
		contract[] t2=new contract[t2no];
		
		for (int i = 0; i < t2no; i++) 
		{
			t2[i]=new contract();
			System.out.println("enter the"+i+1+"contract details" );
			t2[i].read();
		}
		System.out.println("contract staffs details are");
		for (int i = 0; i < t2no; i++) 
		{
			t2[i].display();
			System.out.println("------------------");
				
		}
		
			
	}

}
