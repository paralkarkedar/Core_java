/*Various ways to declare methods in java
========================================
There are four ways to declare methods in java.

1) No returntype with No argument method 

2) No returntype with Argument method 

3) With returntype with No argument method 

4) With returntype with Argument method

*/







/*

1) No returntype with No argument method 


import java.util.*;
class Example_01 
{
	public static void main(String[] args) 
	{
		sum();
	}
	
	public static void sum(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the firs number: ");
		int a = sc . nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		
		int c = a+b;
		System.out.println(c);
	}
}
*/





/*

2) No returntype with Argument method 





import java.util.*;
class Example_01 
{
	public static void main(String[] args) 
	{
		sum(3,5);
	}
	
	public static void sum(int a, int b){
		
		int c = a+b;
		System.out.println("Sum = "+ c);
	}
}


*/





/*

3) With returntype with No argument method 



import java.util.Scanner;
class Example_01 
{
	public static void main(String[] args) 
	{
		System.out.println(sum());
	}
	
	public static int sum(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the firs number: ");
		int a = sc . nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		int c = a+b;
		return c;
	}
}









*/


/* 4) With returntype with Argument method

import java.util.Scanner;
class Example_01 
{
	public static void main(String[] args) 
	{
		System.out.println(sum(4,8));
	}
	
	public static int sum(int a, int b ){
		int c = a+b;
		return c;
	}
}


*/