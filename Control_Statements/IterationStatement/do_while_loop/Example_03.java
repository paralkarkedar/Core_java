//Q) Write a java program to find out factorial of a given number?
import java.util.Scanner;
class Example_03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Pleas enter the number");
		int n = sc.nextInt();
		
		int i = n,fact =1 ;
		do{
			fact = fact*i; //  5*5 + 5*4 + 5*3+ 5*2+5*1 = 120
			i--;
		}while(i>0);
		
		System.out.println(fact);
	}
}
