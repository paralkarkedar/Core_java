package Basics_Program;

public class SumOfNatural {
    public static void main(String[] args) {
        int even =0,odd=0;
        for(int i =1; i<=10; i++){
            if(i%2 == 0){
                even++;
            }
            else{
                odd++;
            }

        }
        System.out.println("Total Even:"+even);
        System.out.println("Total Odd:"+odd);
    }
}
