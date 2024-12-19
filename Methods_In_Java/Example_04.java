
//Q) Write a java program to check given number is palindrome or not?
import java.util.*;
class Example_04 
{
	public static void  main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the numbers: ");
	   int n = sc.nextInt();
	   boolean b = palindrom(n);
	   
	   if(b == true)
		   System.out.println("The given number is palindrom ");
	   else 
		   System.out.println("The given number is not palindrom..");
		   
	   
	}
	
	public static boolean  palindrom(int n){
		int temp = n;
		int rem ,rev = 0;
		
		while(n>0){
		rem = n%10;
		rev = rev  * 10 + rem;
		n = n/10;
		}
		
		if(temp == rev)
			return true ;
		else 
			return false;
	}
	
}
