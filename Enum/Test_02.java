import java.time.Month;

enum Months{
    JAN,FEB,MAR;
}

public class Test_02 {
    public static void main(String[] args) {
        Months[] m = Months.values();
        for( Months m1 : m   ){
                 System.out.println(m1 +"--------------------"+m1);
        }
    }
}
