package Lesson01_FibonacciNumber;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibNums(100));
    }

    // правильный метод
    private static long fibNums (int n) {
        long[] nums = new long[n + 1];
        nums[0] = 0;
        nums[1] = 1;

        for (int i = 2; i <= n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n];
    }

    // неправильный метод через рекурсию
    private static long error(int n) {
        if (n <= 1) {
            return n;
        }
        return error(n - 1) + error(n - 2);
    }
}
