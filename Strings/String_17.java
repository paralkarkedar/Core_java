/*Q) Write a java program to display most repeating character from given string?

input:
	ihubtalentinstitute

output:
	t repeating for 5 times  */
public class String_17 {
    public static void main(String[] args) {
        String str = "ihubtalentinstitute";
        char alphabet = ' ';
        int MaxCount =0;
        for(int i = 0; i<str.length();i++){
            int count = 0;
            for(int j = 0; j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(MaxCount<count){
                MaxCount = count;
                alphabet = str.charAt(i);
            }
        }
        System.out.println(alphabet+" is repeating for "+MaxCount+" times");
    }
}
