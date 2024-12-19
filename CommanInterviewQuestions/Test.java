package CommanInterviewQuestions;

abstract class Plan 
{
	//instance variable
	protected double rate;

	//abstract method
	public abstract void getRate();

	//concrete method
	public void getBillDetails(int units)
	{
		System.out.println("Total Units :"+units);
		System.out.println("Total Bill :"+ units*rate);
	}
}
class DomesticPlan extends Plan 
{
	public void getRate()
	{
		rate=2.5d;
	}
}
class CommercialPlan extends Plan
{
	public void getRate()
	{
		rate=5.0d;
	}
}
public class Test 
{
	public static void main(String[] args)
	{
		DomesticPlan dp=new DomesticPlan();
		dp.getRate();
		dp.getBillDetails(250);

		CommercialPlan cp=new CommercialPlan();
		cp.getRate();
		cp.getBillDetails(250);
	}
}
