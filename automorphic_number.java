package tylquestions;

import java.util.Scanner;

public class automorphic_number {
	
	public static boolean check(int n) {
		int square=n*n;
		while(n>0)
		{
			if (n%10!=square%10) {
				return false;
			}
			n=n/10;
			square=square/10;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to check");
		int n=sc.nextInt();
		int temp=n;
		boolean result=check(n);
		if(result==true)
		{
			System.out.println("automorphic");
		}
		else {
			System.out.println("not automorphic");
		}
		
	}

}
