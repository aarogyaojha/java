package project1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class studentdemo
{
	String usn,name,branch;
	long phoneno;
	
	public studentdemo()
	{
		usn=branch=name="";
		phoneno=0;
	}
	
	public void read(String n, String u, String b, long p)
	{
		name=n;
		usn=u;
		branch=b;
		phoneno=p;
	}
	public void display()
	{
		System.out.println(name+"\t"+usn+"\t"+branch+"\t"+phoneno);
		
	}
}
public class student {

	public static void main(String[] args)throws IOException
	{
		String u,n,b;
		long p;
		int no;
		studentdemo s[]=new studentdemo[10];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the number of students");
		no= Integer.parseInt(br.readLine());
		
		for (int i =0;i<no;i++)
		{
			s[i]=new studentdemo();
			System.out.println("enter your name");
			n=br.readLine();
			System.out.println("enter your usn");
			u=br.readLine();
			System.out.println("enter your branch");
			b=br.readLine();
			System.out.println("enter your phone number");
			p=Long.parseLong(br.readLine());
			s[i].read(n, u, b, p);

		}
		System.out.println("the details are");
		System.out.println("NAME\tUSN\tBRANCH\tPHONENO");
		
		for (int i=0;i<no;i++)
		{
			s[i].display();
		}
		

	}
}



