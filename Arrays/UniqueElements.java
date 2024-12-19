//Q) Write a java program to display unique elements from given array?

/*
class UniqueElements {
    public static void main(String[] args) {
        int[] arr = {6, 8, 2, 3, 1, 5, 4, 2, 6, 8};

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println(arr[i]);
            }
        }
    }
}
*/



// second approach

class UniqueElements {
    public static void main(String[] args) {
        int[] arr = {6, 8, 2, 3, 1, 5, 4, 2, 6, 8};

        for(int i =0; i< arr.length; i++){
			int count = 0;
			for(int j = 0; j<arr.length; j++){
				
				if(arr[i]  == arr[j]){
					count++;
				}
			}
			if(count == 1)
				System.out.println(arr[i]);
        }
    }
}