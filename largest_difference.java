package tylquestions;

import java.util.Arrays;
import java.util.Scanner;

public class largest_difference {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int difference=arr[n-1]-arr[0];
		System.out.println("Difference is "+difference);
	}
}
