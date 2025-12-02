package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void threeSum(){

        int[] nums = new int[]{-1,0,1,2,-1,-4};
        int target = 0;
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0 ; i< nums.length-2; i++){

            if(i>0 && nums[i] == nums[i-1]) continue;

            int  left = i+1;
            int right = nums.length-1;

            while (left < right){

                int sum = nums[i] + nums[left] + nums[right];

                if(sum == target){
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    left ++;
                    right --;

                    while(left < right && nums[left] == nums[left-1]) left++;

                    while (left < right && nums[right] == nums[right+1]) right--;
                }else
                if(sum < target){
                    left ++;
                }else{
                    right --;
                }
            }
        }

        for(List<Integer> pair: result){
            System.out.println(pair);
        }
    }
}
