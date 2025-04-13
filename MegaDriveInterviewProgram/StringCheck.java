package MegaDriveInterviewProgram;

import java.util.Scanner;

public class StringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter YOur Value:");

        String input =  sc.nextLine();

        if (input.matches("\\d+")) {
            System.out.println("It a Integer....");
        }else{
            System.out.println("It a String....");
        }
    }
}
