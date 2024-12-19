/*
 * Q) Write a java program to check given string is anagram or not?

input:
	silent 
	listen 

output:
	It is a anagram string 
 */

import java.util.Arrays;

public class String_18 {
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";

        char[] carr1 = str1.toCharArray();
        char[] carr2 = str2.toCharArray();
        Arrays.sort(carr1);
        Arrays.sort(carr2);
        boolean flag = true;
        for(int i = 0; i<carr1.length && i<carr2.length;i++){
                  if(carr1[i] != carr2[i]){
                          flag = false;
                          break;
                  }
        }
        if(flag == true){
            System.out.println("the following string is anagram string");
        
        }else{
            System.out.println("the following string is not anagram string");
        }
        
    }
}
