//Q) Write a java program to find out greatest of three numbers?
import java.util.Scanner;

class Example_02 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the first Number: ");
		int a = sc.nextInt();
		
		System.out.println("Please Enter the first Number: ");
		int b = sc.nextInt();
		
		System.out.println("Please Enter the first Number: ");
		int c = sc.nextInt();
		
		if((a>b) && (a>c)) 
			System.out.println("greater number is : " + a );
		if((b>a) && (b>c))
			System.out.println("greater number is : " + b);
		if((c>a) && (c>b))
			System.out.println("greater number is : " + c );
	}
}
