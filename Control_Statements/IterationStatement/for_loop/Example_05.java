/*Q) Write a java program to find out fibonacci series of a given number?

fibonacci series : 0 1 1 2 3 5 8 
*/  


import java.util.Scanner;
class Example_05 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the mnumber ");
		int n = sc.nextInt();
		
		int a=  0 , b = 1, c;
		
		System.out.println(a + " " + b);
		
		for(int i = 2; i<=n; i++){
			
			c = a+b;
			System.out.println(c + " ");
			a = b;
			b= c;
			
		}
	}
}
