//Q) Write a java program to display prime numbers from 1 to 100?

class Example_02 
{
	public static void main(String[] args) 
	{
		for(int i = 2; i<=100; i++){
			boolean flag = true;
			
			for(int j = 2; j <= i/2; j++ ){
				
				if(i%j == 0){
					flag = false;
					break;
				}
				
				}
				if(flag == true)
				System.out.println(i + " ");
			}
	}
}
