/*3) 
*
* *
* * * 
* * * * 

*/

class Example_10 
{
	public static void main(String[] args) 
	{
		for(int i = 1; i<=4; i++){
			
			//space 
			
			for(int j = 4; j>i; j--){
			System.out.print("  ")	;
			}
			for(int j = 1; j<=i;j++){
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
