//Q) Write a java program to perform swapping of two numbers without using third variable?
import java.util.Scanner;
class Swaping 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter any two numbers:");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Elements before swap:" + a+ "" + b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("Elements after swap:" + a+ "" + b);
	}
}