interface Father 
{
	float HT=6.2f;
	void height();
}
interface Mother 
{
	float HT=5.8f;
	void height();
}
class Child implements Father,Mother 
{
	public void height()
	{
		float height=(Father.HT+Mother.HT)/2;
		System.out.println("Child Height :"+height);
	}
}
class Interface_02
{
	public static void main(String[] args)
	{
		Child c=new Child();
		c.height();
	}
}
