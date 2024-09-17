
//Q) Write a java program to find out given number is positive or negative by using nested if stmt?
class Example_10 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		
		if(n!=0)
		{
			if(n>0)
			{
				System.out.println("It is a positive number");
				System.exit(0);
			}
			
			System.out.println("It is a negative number");
		}
	}
}
