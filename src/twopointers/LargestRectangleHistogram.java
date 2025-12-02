package twopointers;

public class LargestRectangleHistogram {

    public static void largestRectangleHistogram(){
        int[] heights = new int[]{2,1,5,6,2,3};

        int maxVolume = 0;
        int left = 0;
        int right = heights.length-1;
        while(left <= right){
            int minHeight = Math.min(heights[left], heights[right]);
            int width = right - left;
            int volume = minHeight * width;

            maxVolume = Math.max(volume, maxVolume);

            if(heights[left] <= heights[right]){
                left++;
            }else {
                right--;
            }
        }
        System.out.println("Largest Rectangle in Histogram: "+ maxVolume);
    }
}
