
//Q) Write a java program to check given number is prime or not?
import java.util.*;
class Example_01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		boolean flag = true;
		
	  for( int  i =2; i<=n/2; i++){
		if(n%i){
			flag = false;
			break ;
		}
	  }
	
	if(flag == true)
		System.out.println("GIven number is the prime number");
	else
		System.out.println("GIven is not number is the prime number");
}
}