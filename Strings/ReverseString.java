public class ReverseString {
    public static void main(String[] args) {
        String str = "sanika";
         char arr[] = str.toCharArray();

         for(int i =str.length()-1; i>=0; i++){
            System.out.println(arr[i]);
         }
    }
}
