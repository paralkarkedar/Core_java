
//Q) Write a java program to check given alphabet is a vowel or not?
import java.util.Scanner;
class  Example_08
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Charcter: ");
		char ch = sc.next().charAt(0);
		
		if(ch == 'A' || ch == 'a')
			System.out.println("The given char is vowel  " + ch);
		 else if (ch == 'E' || ch == 'e')
			System.out.println("The given char is vowel  " + ch);
		 else if (ch == 'I' || ch == 'i')
			System.out.println("The given char is vowel  " + ch);
		 else if (ch == 'O' || ch == 'o')
			System.out.println("The given char is vowel  " + ch);
		  else if (ch == 'U' || ch == 'u')
			System.out.println("The given char is vowel  " + ch);
		else 
			System.out.println("The given char is Not vowel  " + ch);
		
	}
}
