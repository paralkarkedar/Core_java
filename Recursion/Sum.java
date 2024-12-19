
import java.util.*;
class Sum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number:");
		int b = sc.nextInt();
		
		System.out.println(sum(a,b));
		
	}
	
	public static int sum(int a , int b){
	
	if(a == 0)
		return b;
	
	return (a--, b++);
	
	
	}
}
