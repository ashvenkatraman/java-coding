public class SumOfSquaredDigits {

    public static int sumOfSquaredDigits(int n){

        int digit;
        int sum = 0;

        while (n > 0) {
            digit = n % 10;
            n = n / 10;
            sum = sum + (int)Math.pow(digit, 2);
        }

        return sum;
    }
}
