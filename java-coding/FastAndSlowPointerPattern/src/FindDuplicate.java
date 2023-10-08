import java.util.*;

public class FindDuplicate{

    public static int traverseArrayLoopForward(int[] nums, int ptr, int distance){

        int len = nums.length;
        int reducedDistance = distance % nums.length;
        int newPtr = 0;

        if (ptr + reducedDistance >= nums.length){
            newPtr = ptr + reducedDistance - nums.length;
        }
        else
            newPtr = ptr + reducedDistance;

        System.out.println("Array size: " + nums.length + ", Start: " + ptr + " + " + distance + " = " + newPtr);
        return newPtr;

    }

    /* I made my solution at the bottom way too complicated but it works in O(1) I think.
    If only 1 number duplicates, and if the array is always n+1, then essentially every number
    exists in the array, so you can use the contents of the cell to traverse over the array, instead
    of what I did, which is go through the array in a loop for each element.  Maybe I'm at O(n) or O(n2) then?
    Optimized code to run this is here:

    public static int findDuplicate(int[] nums) {
          int fast = nums[0];
          int slow = nums[0];

          while (true) {
              slow = nums[slow];
              fast = nums[nums[fast]];

              if (slow == fast) {
                  break;
              }
          }

          slow = nums[0];

          while (slow != fast) {
              slow = nums[slow];
              fast = nums[fast];
          }

          return fast;
    }
     */
    public static int findDuplicate(int[] nums) {

        // Replace this placeholder return statement with your code
        int slow = 0;
        int fast = 0;

        //System.out.println("Testing traverse function:");
        //int[] qq = {1,2,3,4,5};
        //for (int a = 0;a<=21;a++){
        //   System.out.println(qq.length + " elements, 2 -> " + a + " returns: " + traverseArrayLoopForward(qq,2,a));
        //}

        for (int a = 0; a <= nums.length; a++){
            while (fast != slow){
                if (nums[fast] == nums[slow])
                    return nums[fast];
                slow = traverseArrayLoopForward(nums, slow, 1);
                fast = traverseArrayLoopForward(nums, fast, 2);
            }
            fast = traverseArrayLoopForward(nums, fast, 1);
        }

        return 0;
    }
}