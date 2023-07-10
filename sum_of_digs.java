package tylquestions;

import java.util.Scanner;

public class sum_of_digs {
	
	public static int SumofDigits(int n){ 	
		if (n<10) {
			return n;
		}
		else {
			int sum=0;
			while(n!=0) {
				sum+=n%10;
				n/=10;
			}
			return SumofDigits(sum);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int result=SumofDigits(n);
		System.out.println("ans is"+result);
	}
}
