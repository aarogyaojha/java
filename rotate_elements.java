package tylquestions;

import java.util.Scanner;

public class rotate_elements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter value of k");
		int k=sc.nextInt();
		for (int i = 0; i < k; i++) {
			int temp= arr[n-1];
			for(int j=n-1;j>0;j--)
				arr[j]=arr[j-1];
		arr[0]=temp;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

}
