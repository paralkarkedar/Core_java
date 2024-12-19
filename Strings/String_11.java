/*Q) Write a java program to display the string in sorting order?

input:
	dzbea

output:
	abdez */


import java.util.Arrays;

public class String_11 {
    public static void main(String[] args) {
        String str = "dzbea";
        char[] carr = str.toCharArray();
        Arrays.sort(carr);

        for(char i : carr){
            System.out.println(i);
        }
    }
}
