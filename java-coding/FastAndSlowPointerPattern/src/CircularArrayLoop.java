import java.util.*;

public class CircularArrayLoop{
    public static boolean circularArrayLoop(int[] nums) {

        int element = 0;
        int slow = 0;
        int fast = 0;
        boolean movingForward;
        int deltaToEndOfArray;
        int fastMovedThisManyTimes = 0;

        System.out.print("Input array = [");
        for (int z = 0; z<nums.length; z++){
            System.out.print(nums[z] + ", ");
        }
        System.out.println("]");


        for (int a = 0;a<nums.length;a++){

            if (nums[a] >0)
                movingForward = true;
            else
                movingForward = false;

            System.out.println("Element " + a + ": " + nums[a] + ", moving forward: " + movingForward);

            fast = a;
            slow = a;
            fastMovedThisManyTimes = 0;

            do {

                System.out.println("Slow: [" + slow + "]: " + nums[slow] + ", Fast: [" + fast + "]: " + nums[fast]);

                if (movingForward)
                {

                    if ((nums[slow] <0)||(nums[fast] < 0))
                        break;

                    // Iterate through a cycle with slow
                    deltaToEndOfArray = nums.length - 1 - slow;
                    if (slow + nums[slow] >  nums.length-1)
                    {
                        slow = nums[slow] - deltaToEndOfArray - 1;
                    }
                    else
                        slow = slow + nums[slow];

                    System.out.println("Slow: [" + slow + "]: " + nums[slow] + ", Fast: [" + fast + "]: " + nums[fast]);

                    // Iterate through an array loop once with fast
                    deltaToEndOfArray = nums.length - 1 - fast;
                    if (fast + nums[fast] >  nums.length-1)
                    {
                        fast = nums[fast] - deltaToEndOfArray - 1;
                    }
                    else
                        fast = fast + nums[fast];

                    fastMovedThisManyTimes++;

                    System.out.println("Slow: [" + slow + "]: " + nums[slow] + ", Fast: [" + fast + "]: " + nums[fast]);

                    if ((nums[slow] <0)||(nums[fast] < 0))
                        break;

                    // Iterate through an array loop once again with fast
                    deltaToEndOfArray = nums.length - 1 - fast;
                    if (fast + nums[fast] > nums.length-1)
                    {
                        fast = nums[fast] - deltaToEndOfArray - 1;
                    }
                    else
                        fast = fast + nums[fast];

                    fastMovedThisManyTimes++;

                    System.out.println("Slow: [" + slow + "]: " + nums[slow] + ", Fast: [" + fast + "]: " + nums[fast]);

                }
                else{
                    // Iterate through a cycle with slow
                    System.out.println("Slow: [" + slow + "]: " + nums[slow] + ", Fast: [" + fast + "]: " + nums[fast]);

                    if ((nums[slow] >0)||(nums[fast] > 0))
                        break;

                    if (slow + nums[slow] < 0)
                    {
                        slow = nums.length + (slow + nums[slow]);
                    }
                    else
                        slow = slow + nums[slow];

                    System.out.println("Slow: [" + slow + "]: " + nums[slow] + ", Fast: [" + fast + "]: " + nums[fast]);

                    // Iterate through an array loop once with fast
                    if (fast + nums[fast] < 0)
                    {
                        fast = nums.length + (fast + nums[fast]);
                    }
                    else
                        fast = fast + nums[fast];

                    fastMovedThisManyTimes++;
                    System.out.println("Slow: [" + slow + "]: " + nums[slow] + ", Fast: [" + fast + "]: " + nums[fast]);

                    if ((nums[slow] >0)||(nums[fast] > 0))
                        break;

                    // Iterate through an array loop once again with fast
                    if (fast + nums[fast] < 0)
                    {
                        fast = nums.length + (fast + nums[fast]);
                    }
                    else
                        fast = fast + nums[fast];

                    fastMovedThisManyTimes++;

                    System.out.println("Slow: [" + slow + "]: " + nums[slow] + ", Fast: [" + fast + "]: " + nums[fast]);

                }

                if ((slow == fast)&&fastMovedThisManyTimes>2)
                    return true;

                if (fastMovedThisManyTimes >= nums.length){
                    // We have iterated through the entire array with the fast pointer
                    // we can assume the starting element did not result in a loop
                    System.out.println("Iterated through the entire array.. quitting");
                    break;
                }


            }
            while (fast != slow);

        }


        return false;
    }
}