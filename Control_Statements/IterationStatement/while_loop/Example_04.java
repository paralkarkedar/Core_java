//Q) Write a java program to display multiplication table of a given number?

import java.util.Scanner;
class Example_04
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter the number: ");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i = 1;
		while(i<=10){
			System.out.println(i*n);
			i++;
		}
		
	}
}

