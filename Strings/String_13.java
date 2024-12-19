
/*Q) Write a java program to display reverse of a sentence ?

input:
	This is java class 

output:
	class java is This  */
public class String_13 {
    public static void main(String[] args) {
        String str = "This is java class";
        String sarr[] = str.split(" ");

        for(int i = sarr.length-1;i>=0;i--){
                  System.out.println(sarr[i]);
        }
    }
}
