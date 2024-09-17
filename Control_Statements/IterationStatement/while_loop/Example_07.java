/*
Q) Write a java program to display reverse of a given number?

input:
	123

output:
	321
*/


import java.util.Scanner;
class Example_07 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int n = sc.nextInt();
		
		
		int rem,rev =0;
		while(n>0){
		
		rem = n%10;
		rev = rev*10+rem;
		n = n/10;
		}
		
		System.out.println(rev);
	}
}
