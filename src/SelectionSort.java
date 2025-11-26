public class SelectionSort {

    static int[] sort(int[] arr){
        int min_index;
        int n = arr.length;
        for(int i = 0 ; i< n-1; i++){
            // assume curr index is minimum
            min_index = i;
            for (int j= i+1; j< n; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }

            swap(arr, i , min_index);

        }
        return  arr;
    }

    private static void swap(int[] arr, int j, int i) {
        int temp;
        temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
