package sort;

public class BubbleSort {

    public static int[] sort (int[] arr, int n){
        boolean swapped;
        int temp;
        for(int i =0 ; i < n-1; i ++){
            swapped = false;
            for(int  j =0; j< n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int j) {
        int temp;
        temp = arr[j];
        arr[j] = arr[j +1];
        arr[j +1] = temp;
    }
}
