package SegroSoft;
// 3.	write a program that should convert the given number to binary number and count the number of 1's are present in the binary number?

// Ex: Input Num=13  ( binary no: 1101 )
// Output: 3

import java.util.*;
public class BinaryToNUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String binary = Integer.toBinaryString(num);
        int count = 0;

        System.out.println(binary);
           for(char ch : binary.toCharArray()){
            if(ch == '1'){
              count++;
            }
           }
           System.out.println(count);

    }
}
