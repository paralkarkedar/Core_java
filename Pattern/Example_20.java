class Example_20
{
	public static void main(String[] args) 
	{
		//rows
		for(int i=0;i<5;i++)
		{
			//space
			for(int j=4;j>i;j--)
			{
				System.out.print(" ");
			}
			
			int number=1;
			
			for(int k=0;k<=i;k++)
			{
				System.out.print(number+" ");
				
				number = number * (i-k)/(k+1);
			}
			
			//new line
			System.out.println();
		}
	}
}