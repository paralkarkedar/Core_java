/* 
Q) Write a java program to display square of a matrix?

Input:
	1 2 3 
	4 5 6
	7 8 9 
	*/
	
class  SquareOfMatrix
{
	public static void main(String[] args) 
	{
		int [][] arr = {{1 ,2, 3 },{4 ,5 ,6},{7 ,8 ,9}};
		
		int row = arr.length;
		int cols = arr[0].length;
		
		for(int i = 0; i <arr.length; i++){
			for(int j = 0; j<arr.length; j++){
				
				System.out.print(arr[i][j] * arr[i][j] + "  ");
			}
			System.out.println();
		}
		
	}
}
