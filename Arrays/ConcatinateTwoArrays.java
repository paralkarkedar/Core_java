import java.util.Arrays;

public class ConcatinateTwoArrays {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9,10};
        int size1 = arr1.length;
        int size2 = arr2.length;
        int j = 0;
        arr1 = Arrays.copyOf(arr1, size1 + size2);
        for(int i = size1; i < arr1.length; i++){
            arr1[i] = arr2[j++];
        }

        for(int n : arr1){
            System.out.println(n);
        }
    }
}
