public class SumOfTwoArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        int[] newArr = new int[arr.length];
        for(int i = 0; i<arr.length && i<arr2.length; i++){
                   newArr[i] = arr[i] + arr2[i];

        }

        for(int n : newArr){
            System.out.println(n);
        }

    }
}
