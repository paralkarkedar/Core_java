public class Test {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
       int arr1[] = {1,2};
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();

        for(int i : arr){
            sb.append(i);
        }

        for(int i : arr1){
            sb1.append(i);
        }

        int a = Integer.parseInt(sb.toString());
        int b = Integer.parseInt(sb1.toString());

        System.out.println(a*b);
    
    }
}
