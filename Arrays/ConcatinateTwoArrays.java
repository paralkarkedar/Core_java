import java.util.Arrays;

public class ConcatinateTwoArrays {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9,10};
        int arr3[] = {11,12,13,14,15};
        int size1 = arr1.length;
        int size2 = arr2.length;
        int size3 = arr3.length;
        int j = 0;
        int k =0;
        arr1 = Arrays.copyOf(arr1, size1 + size2+ size3);
        for(int i = size1; i < size1+size2; i++){
            arr1[i] = arr2[j++] ;
           
        }

        for(int i = size1 + size2; i<arr1.length; i++){
            arr1[i] = arr3[k++];
        }

        // Copy elements of arr3 into arr1
       

        for(int n : arr1){
            System.out.println(n);
        }
    }
}
