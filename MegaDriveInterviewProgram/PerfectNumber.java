package MegaDriveInterviewProgram;

public class PerfectNumber {
    public static void main(String[] args) {
        int n = 4;
         int sum = 0;
        for(int i = 1; i<n; i++){
            if(n%i == 0){
                sum = sum + i;
            }
        }
        if(n == sum){
            System.out.println("Followign number is perfect number");
        }else{
            System.out.println("followign number is not perfect");
        }

      
    }
}
