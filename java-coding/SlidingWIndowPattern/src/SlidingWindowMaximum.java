import java.util.*;

class SlidingWindowMaximum {

    public static int findMaximum(int[] nums, int left, int right){
        int max = nums[left];
        for (int a = left;a<=right;a++){
            if (nums[a] > max)
                max = nums[a];
        }
        return max;
    }

    public static int[] findMaxSlidingWindow(int[] nums, int w) {

        int leftWindow = 0;

        //int[] maximums = new int[nums.length - 1];
        List<Integer> maximumsArray = new ArrayList<Integer>();

        for (int a = 0,rightWindow=w-1;rightWindow<=nums.length-1;a++, leftWindow++, rightWindow++){
            System.out.println("Finding maximum between " + leftWindow + " and " + rightWindow);
            maximumsArray.add(findMaximum(nums,leftWindow,rightWindow));
        }

        int[] maximums = new int[maximumsArray.size()];
        for (int a = 0;a< maximumsArray.size();a++){
            maximums[a] = maximumsArray.get(a).intValue();
        }

        return maximums;
    }
}