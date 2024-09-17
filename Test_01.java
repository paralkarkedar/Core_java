class Test_01{

//instance variable 
	int i=10;

	public static void main(String[] args)
	{
		Test_01 t1=new Test_01();
		Test_01 t2=new Test_01();

		System.out.println(t1.i);//10
		System.out.println(t2.i);//10

		t1.i=100;
		
		System.out.println(t1.i);//100
		System.out.println(t2.i);//10
	}
}