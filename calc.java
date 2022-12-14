package project1;

import java.util.Scanner;

public class calc
{

	public static void main(String[] args)
	{
		int num1,num2;
		String op;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the first number");
		num1=sc.nextInt();
		
		System.out.println("enter the second number");
		num2=sc.nextInt();
		
		System.out.println("enter the operator");
		op=sc.next();
		
		switch (op)
		{
			case "+":
			{
				System.out.println("your result is"+(num1+num2));
				break;
			}
			case "-":
			{
				System.out.println("your result is"+(num1-num2));
				break;
			}
			case "*":
			{
				System.out.println("your result is"+(num1*num2));
				break;
			}
			case "/":
			{
				if (num2==0)
				{
					System.out.println("enter a valid number");
					break;
				}
				else
				{
					System.out.println("your result is"+(num1/num2));
					break;
				}
			}
				case "%":
				{
					if (num2==0)
					{
						System.out.println("enter a valid number");
						break;
					} 
					else
					{
						System.out.println("your result is"+(num1%num2));
						break;
					}
				}
			}
		}
	}
