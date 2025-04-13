// 1.	write a program that takes an array of length N, take a variable k (less than the array's length), retrieves the kth element, and sorts the array such that the kth element becomes the first element without using a sorting method.
// Ex: input: [3,6,8,7,9,5,]
// 	   K=3
// Output: [7,6,8,3,9,5].

package SegroSoft;

public class SwapTheK {
    public static void main(String[] args) {
        int arr[] = {3,6,8,7,9,5};
          int k =3;
        int temp = arr[0];
        arr[0] = arr[k];
        arr[k] = temp;
        
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
