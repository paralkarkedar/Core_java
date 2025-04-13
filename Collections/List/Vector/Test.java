import java.util.*;
class Test  
{
	public static void main(String[] args) 
	{
		Vector<Integer> v=new Vector<Integer>();
		System.out.println(v.capacity());
		
		for(int i=1;i<=10;i++)
		{
			v.add(i);
		}
		System.out.println(v); //[1,2,3,4,5,6,7,8,9,10]
		
		System.out.println(v.get(0));//1
		System.out.println(v.get(v.size()-1));//10
		
		v.remove(5);
		System.out.println(v); ////[1,2,3,4,5,7,8,9,10]
		
		v.clear();
		System.out.println(v); // []
	}
}