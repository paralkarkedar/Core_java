//Q) Write a java program to find out given year is a leap year or not?
import java.util.Scanner;
class Example_06 
{
	public static void main(String[] args) 
	{
		System.out.println("Please Enter the Year");
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		if(year%4 == 0 && year%100!=0 || year%400==0)
			System.out.println("The following year is leap year.............");
	   else
		System.out.println("The following not year is leap year.............");
	}
		
}
