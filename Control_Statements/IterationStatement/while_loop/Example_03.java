//Q) Write a java program to find out factorial of a given number?
import java.util.Scanner;
class Example_03 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter the number: ");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int i =n , fact =1;
		
		while(i>=1){
			
			fact = fact * i;
			
			i--;
		}
		System.out.println(fact);
		
		
	}
}