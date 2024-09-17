
//Q) Write a java program to perform sum of 10 natural numbers?
import java.util.Scanner;
class Example_02 
{
	public static void main(String[] args) 
	{
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Pleas enter the number");
		//int n = sc.nextInt();
		
		int i = 1, sum =0;
		
		do{
			sum = sum + i;
			i++;
			
		}while(i<=10);
		System.out.println(sum);
	}
}
