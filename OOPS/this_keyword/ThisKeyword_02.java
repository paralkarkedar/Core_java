//3) To refer current class constructors 
class A
{
	A(){
		System.out.println("this is non-argu constructor");
	}
	
	A(int i){
		this();
		System.out.println("this is integer type argu constructor");
		System.out.println(i);
	}
	A(double d ){
		this(10);
		System.out.println("this is double type argu constructor");
		System.out.println(d);
	}
}
class  ThisKeyword_02
{
	public static void main(String[] args) 
	{
		A a = new A(20.6d);
	}
}
