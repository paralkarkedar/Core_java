//Method overloading

class MethodOverloading
{
	public void Search(int mobile){
		System.out.println("Data founded by the help of mobile number");
	}
	public void Search(String name){
		System.out.println("Data founded by the help name");
	}
	public void Search(long l ){
		 System.out.println("YHome address founed");
	}
	public static void main(String[] args) 
	{
		MethodOverloading  m = new MethodOverloading();
		m.Search(1234567);
		m.Search("Kedar");
		m.Search(12323278L);
	}
}
