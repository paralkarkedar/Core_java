abstract class  Plan {
   // instance variable
   protected double rate;

   // abstract method 
   public abstract void getRate();

   // concrete method
   public void getBillDetails(int units){
    System.out.println("Total units: "  +units);
    System.out.println("Total Bill: " + units*rate);

   }
    
}
class DomesticPlan extends Plan{
      public void getRate(){
        rate = 2.5d;
      }
}

class CommericalPlan extends Plan{
    public void getRate(){
        rate = 4.3d;
    }
}
public class Example {
    public static void main(String[] args) {
            DomesticPlan dp = new DomesticPlan();
            dp.getRate();
            dp.getBillDetails(240);

            CommericalPlan cp = new CommericalPlan();
            cp.getRate();
            cp.getBillDetails(300);
    }
}
