//A number is said to be special number when the sum of factorial of its digits is                                         .                      equal to the number itself.
//		Example- 145 is a Special Number as 1!+4!+5!=145
package tylquestions;

import java.util.Scanner;

public class special_number {
	public static int fact(int n) {
		if (n==0 || n==1) {
			return 1;
		}
		else
		{
			return n*fact(n-1);
		}
	}
	
	public static int sep_numbers(int n){
		int sum=0;
		while(n>0) {
			int rem=n%10;
			int factorial=fact(rem);
			sum=sum+factorial;
			n=n/10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number you wanna check");
		int n=sc.nextInt();
		int temp=n;
		int res=sep_numbers(n);
		
		if (temp==res) {
			System.out.println("special number");
		}
		else {
			System.out.println("not special number");
		}
	}
}
