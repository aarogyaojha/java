package tylquestions;

import java.util.Iterator;
import java.util.Scanner;

public class traversal_left_right {
	public static void traversal(int [] arr,int middleindex) {
		int length=arr.length;
		int left=middleindex;
		int right=middleindex;
		
		while(left>=0 && right<length) {
			System.out.println(arr[left]+"");
			if (left!=right) {
				System.out.println(arr[right]+"");
			}
			left--;
			right++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		int middleindex=arr.length/2;
		
		System.out.println("original array:");
		printarray(arr);;
		
		System.out.println("Traveresed array:");
		traversal(arr,middleindex);
		
		System.out.println("updated array:");
		printarray(arr);
	}
	
	public static void printarray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
