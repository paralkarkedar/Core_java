import java.util.Scanner;
//Q) Write a java program to perform swapping of two numbers?
class Swap 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter the tow number");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b =sc.nextInt();
		
		System.out.println("Number before swap:" + a+" "+ b);
		
		int temp = a;
		a = b;
		b=a;
		
		System.out.println("Number after swap:" + a+" " + b);
		
	}
}
