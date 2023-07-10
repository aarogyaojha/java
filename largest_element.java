package tylquestions;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class largest_element {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("enter the kth number");
		int k=sc.nextInt();
		Arrays.sort(arr);
		int result=arr[n-k];
		System.out.println("The result is"+result);
	}
}
