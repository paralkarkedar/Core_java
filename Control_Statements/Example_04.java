//Q) Write a java program to find out given number is even or odd?
/*import java.util.Scanner;
class Example_04 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		
		if(num%2 == 0)
			System.out.println("The Following number is Even........");
		else
		System.out.println("The Following number is odd..................");
			
	}
}
*/

//approach2
//---------

import java.util.Scanner;
class Example_04 
{
	public static void main(String[] args) 
	{
		System.out.println("New approach");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		
		if((num&1) == 0)
			System.out.println("The Following number is Even........");
		else
		System.out.println("The Following number is odd..................");
			
	}
}