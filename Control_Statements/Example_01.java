
//Q) Write a java program to find out greatest of two numbers?
import java.util.Scanner;
class Example_01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		
		if(a>b) System.out.println("This number is the greaterst: " + a);
		if(b>a)System.out.println("This number is the greaterst: " + b);
		
		
	
	}
}