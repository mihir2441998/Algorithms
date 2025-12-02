package sort;

import java.util.Arrays;

public class RadixSort {

    public static int[] sort(int[] arr){

        int max = getMaxArrElement(arr);

        for (int exp = 1; max/exp > 0; exp*=10){
            countSort(arr, exp);
        }
        return arr;
    }

    private static void countSort(int[] arr, int exp) {

        int[] output = new int[arr.length];
        int[] count = new int[10];
        Arrays.fill(count, 0);

        for(int i = 0; i< arr.length; i++){
            int digit = (arr[i]/exp)%10;
            count[digit] += 1;
        }

        for(int i = 1; i< count.length; i++){
            count[i] = count[i] + count[i-1];
        }

        for (int i=arr.length-1 ; i>=0; i--){
            int digit = (arr[i]/exp)%10;
            output[count[digit]-1] = arr[i];
            count[digit]--;
        }

        for(int i =0; i<output.length; i++){
            arr[i] = output[i];
        }
    }

    private static int getMaxArrElement(int[] arr) {
        int max = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
