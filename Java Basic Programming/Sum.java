import java.util.*;
//Q) Write a java program to perform sum of two numbers? 
class Sum 
{
	public static void main(String[] args) 
	{
		
		
		System.out.println("Please Enter the first number: ");
		Scanner sc = new Scanner(System.in);
		int a =  sc.nextInt();
		System.out.println("Enter the second number : ");
		int b = sc.nextInt();
		
		int c = a + b;
		
		System.out.println("The sum of two number:" + c);
		
	}
}