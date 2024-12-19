

/*
Q) Write a java program to remove spaces from given string?
*/
class String_05 
{
	public static void main(String[] args) 
	{
		String str = "ihub talent management";
		str = str.replaceAll("\\s","");
		System.out.println(str);
	}
}
