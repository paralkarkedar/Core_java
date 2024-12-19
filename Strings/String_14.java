
/*Q) Write a java program to display reverse of a word in a string?

input:
	This is java class

output:
	sihT si avaj ssalc 
     */
public class String_14 {
    public static void main(String[] args) {
        String str = "This is java class";
        String[] arr = str.split(" ");

        for(String s : arr){
            char[] carr=s.toCharArray();;
            for(int i = carr.length-1; i>=0; i--){
                System.out.print(carr[i]);
            }
            System.out.println();
        }
    }
}
