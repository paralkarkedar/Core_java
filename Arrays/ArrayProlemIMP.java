/*
Q) Write a java program to determine the smallest number of coins needed to total 
86 rupees. Use the denominations provided in the array {1,2,5,10}? 
 
Output: 
 	1 coin(s) of 1 rupee(s) 
 	1 coin(s) of 5 rupee(s) 
 	8 coin(s) of 10 rupee(s)
*/

class  ArrayProlemIMP
{
	public static void main(String[] args) 
	{
		int[] denominations = {1,2,5,10};
		
		int amount = 86;
		
		int[] result = minimumCoin(denominations, amount);
		
		for(int i=0;i<result.length;i++)
		{
			if(result[i] > 0){
				System.out.println(result[i]+" coin(s) of " +denominations[i]+" rupee(s)");
			}
		}
	}
	
	public static int[] minimumCoin(int[] denominations, int amount){
		int[] coinsCount = new int[denominations .length];
		for(int i = denominations.length-1; i>=0 ; i--){
			coinsCount[i]  = amount/denominations[i];
			amount %= denominations[i]; 
		}
		return coinsCount;
	}
}