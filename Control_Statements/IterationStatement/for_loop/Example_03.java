/* Q) Write a java program to check given number is perfect or not?

input:
	6

output:
	It is a perfect number */

import java.util.Scanner;
class Example_03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the mnumber ");
		int n = sc.nextInt();
		
		int sum =0;
		
		for(int i = 1; i<n; i++){
			
			if(n%i==0){
				sum = sum + i;
			}
			}
			if(sum == n){
				System.out.println(" The following number is perfect number......");
			}
			else
				System.out.println(" The following number is Not perfect number......");
	}
}
