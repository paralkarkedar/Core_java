package MegaDriveInterviewProgram;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 152;
        int temp = number;

        int rev = 0;;
        int rem = 0;
        while (number>0) {
            rem = number%10;
            rev = rev + rem*rem*rem;
            number = number/10;
        }
        if(number == temp){
            System.out.println("Following number is armstrong number");
        }
        else{
            System.out.println("The followign number is not armstrong number");
        }
    }
}
