//Q) Write a java program to display list of prime elements from given array?
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		int[] arr = {9,2,10,5,8,7,11};
		
		for(int i : arr){
			
			boolean flag = true;
			for(int k = 2; k<i/2; k++){
				
				if(i%k == 0){
					flag = false ;
					break;
				}
			
			} 
			if(flag == true){
					
			System.out.println(i);
			}
			
	     
			
		}
	}
}