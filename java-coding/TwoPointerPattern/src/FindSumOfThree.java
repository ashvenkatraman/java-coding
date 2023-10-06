import java.util.Arrays;

public class FindSumOfThree {

    public static boolean findSumOfThree(int[] nums, int target){

        int left =0;
        int right=0;
        int sum = 0;

        Arrays.sort(nums);

        System.out.print ("Sorted array: [");
        for (int a : nums){
            System.out.print(a + ", ");
        }
        System.out.println("], Target = " + target);
        System.out.println("Array length = " + nums.length);

        for (int element = 0;element <= nums.length - 2;element++){
            left = element+1;
            right = nums.length-1;

            for (int inner = element+1; inner <= nums.length-2; inner++){

                sum = nums[left] + nums[right] + nums[element];

                System.out.println("Element " + element + ":" + nums[element] + ", left " + left + ": " + nums[left]+ ", right " + right + ": " + nums[right] + ", sum: " + sum);

                if (sum == target){
                    return true;
                }
                else if ((sum < target)&&(left<right-1)){
                    left += 1;
                }
                else if ((sum > target)&&(right>left+1)){
                    right -= 1;
                }

            }
        }


        return false;
    }


}
