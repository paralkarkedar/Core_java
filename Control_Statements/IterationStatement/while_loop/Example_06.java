/*Q) Write a java program to find out given number is armstrong or not?

input:
	153

output:
	It is a armstrong number (1*1*1+5*5*5+3*3*3)(1+125+27)(153)*/

import java.util.Scanner;
class Example_06
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number");
		int n = sc.nextInt();
		
		 int temp = n;
		 int rem , sum =0;
		 
		 while(n>0){
			rem = n%10;
			sum = sum + rem*rem*rem;
			n = n/10;
			
		 }
		 if(temp == sum){
			System.out.println("the number is armstron number.......");
		}
		else
			System.out.println("the number is not armstron number.........");
	}
}
