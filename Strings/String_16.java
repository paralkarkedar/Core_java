/*Q) Write a java program display unique and duplicate characters from given string?

input:
	google

output:
	unique = gole
	duplicate = og   */
public class String_16 {
    public static void main(String[] args) {
        String str = "google";

        String unique = "";
        String duplicate = "";
        for(int i = 0; i<str.length();i++){
            String current = Character.toString(str.charAt(i));
            if(unique.contains(current)){
                if(!duplicate.contains(current)){
                      duplicate+=current;
                      continue;
                }
                else{
                    continue;
                }
            }
            unique+=current;
        }
        System.out.println("Unique = "+unique);
		System.out.println("Duplicate = "+duplicate);
    }
}
