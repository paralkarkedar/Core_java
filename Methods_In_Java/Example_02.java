//Q) Write a java program to display factorial of a given number using no returntype with no argument method?

import java.util.Scanner;
class Example_02 
{
	public static void main(String[] args) 
	{
	   factorial();
	}
	
	public static void factorial(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the  number: ");
		int n = sc.nextInt();
		int fact = 1;
		for(int i = n; i >0; i--  ){
			fact = fact*i;
		}
		
		System.out.println(fact);
	}
}