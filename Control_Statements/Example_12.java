import java.util.Scanner;
class Example_12
{
	public static void main(String[] args) 
	{
		System.out.println("Please Enter the you char : ");
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		
		switch(ch){
			case  'A': System.out.println("Vowel.........");
			break;
		    case  'E': System.out.println("Vowel.........");
			break;
		    case  'I': System.out.println("Vowel.........");
			break;
		    case  'O': System.out.println("Vowel.........");
			break;
		    case  'U': System.out.println("Vowel.........");
			break;
			
			default:  System.out.println("Please enter the valid character...");
	}
	}
}
