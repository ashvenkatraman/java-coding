public class IsHappyNumber {
    public static boolean isHappyNumber(int n) {

        int fast = n;
        int slow = n;

        do {
            fast = SumOfSquaredDigits.sumOfSquaredDigits(SumOfSquaredDigits.sumOfSquaredDigits(fast));
            slow = SumOfSquaredDigits.sumOfSquaredDigits(slow);

            System.out.println("Fast: " + fast + ", Slow:" + slow);
            if (fast == 1){
                return true;
            }

            if (fast == slow){
                return false;
            }


        } while ((fast != 1) && (fast != slow));


        System.out.println("If we got here, something went wrong");
        return false;
    }
}
