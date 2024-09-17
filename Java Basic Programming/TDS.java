
//Q) Write a java program to find out 10 percent of TDS from given salary ?
import java.util.Scanner;
class TDS 
{
	public static void main(String[] args) 
	{
		System.out.println("Please Enter your salary:");
		Scanner sc = new Scanner(System.in);
		
		int salary = sc.nextInt();
		
		//logic 
		
		float ans = (float)salary*10/100;
		
		System.out.println(ans);
		
	}
}
