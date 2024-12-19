
/*
Q) Write a java program to concatinate two strings?

input:
	Ihub20
	Talent30

output:
	IhubTalent50
*/
class String_07 
{
	public static void main(String[] args) 
	{
		String s1 = "Ihub20";
		String s2 = "Talent30";
		
		String word =  s1.replaceAll("[^A-Za-z]","");
		
		int num1 = Integer.parseInt(s1.replaceAll("[^0-9]",""));
		
		String word1 = s2.replaceAll("[^A-Za-z]","");
		int num2 = Integer.parseInt(s2.replaceAll("[^0-9]",""));
		
		String words = word + word1;
		int sum = num1+num2;
		
		System.out.println(words+sum);
	}
}
