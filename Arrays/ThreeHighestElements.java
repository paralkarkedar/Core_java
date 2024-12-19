
/*Q) Write a java program to display three highest elements from given array?

input:
	5 8 1 2 9 6 7 4 

output:
	9 8 7 
	
	*/
	
class ThreeHighestElements 
{
	public static void main(String[] args) 
	{
		int[] arr = {5 , 8 ,1 ,2, 9 ,6 ,7 ,4};
		
		int firstElement = Integer.MIN_VALUE;
		int secondElement = Integer.MIN_VALUE;
		int thirdElement = Integer.MIN_VALUE;
		
		for(int i : arr){
			if(i>firstElement){
				thirdElement = secondElement;
				secondElement = firstElement;
				firstElement = i;
			}
			
			 else if (i> secondElement){
				thirdElement = secondElement;
				secondElement = i;
			}
			
			 else if (i> thirdElement){
				
				thirdElement= i;
				
			}
		}
		System.out.println(firstElement+" "+ secondElement+" "+ thirdElement);
	}
}
