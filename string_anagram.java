package tylquestions;

import java.util.Arrays;
import java.util.Scanner;

public class string_anagram {
	
	public static boolean areAnagram(String str1,String str2) {
		str1=str1.replaceAll("[^a-za=A-Z]", "").toLowerCase();
		str2=str2.replaceAll("[^a-za=A-Z]", "").toLowerCase();
		if (str1.length()!=str2.length()) {
			return false;
		}
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1,str2;
		System.out.println("enter 2 strings");
		str1=sc.next();
		str2=sc.next();
		boolean result=areAnagram(str1, str2);
		if (result) {
			System.out.println("are anagrams");
		}
		else {
			System.out.println("not anagrams");
		}
	}

}
