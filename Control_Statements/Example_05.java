//Q) Write a java program to check given number is positive or negative?
import java.util.Scanner;
class Example_05 
{
	public static void main(String[] args) 
	{
		System.out.println("Please Enter The Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num == 0)
			System.out.println("Please Enter the valid number........");
	
		if(num > 0)
			System.out.println("The Numbe Is Positive  " + num);
		else
			System.out.println("Number is Negative.......... " + num );
	}
}
