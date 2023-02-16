package Lesson01_FibonacciNumber;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userNum = scan.nextInt();

        long[] mem = new long[userNum + 1]; // массив для мемоизации, чтобы запоминать повторы для error метода
        Arrays.fill(mem, -1); // метод который заполняет массив одинаковыми значениями
        System.out.println(error(userNum, mem));
    }

    // правильный метод с оценкой O(n)
    private static long fibNums(int n) {
        long[] nums = new long[n + 1]; // O(n)

        // по условию первое и второе число равны 0 и 1
        nums[0] = 0; // O(1)
        nums[1] = 1; // O(1)

        for (int i = 2; i <= n; i++) { // O(n)
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n]; // O(1)
    }

    // неправильный метод через рекурсию, который можно исправить с помощью мемоизации
    // мемоизация - сохранение результатов выполнения функций для предотвращения повторных вычислений (Lesson02)
    // без мемоизации сложность алгоритма составляет O(2^n)
    private static long error(int n, long[] mem) {
        // условие исключающее повторные вычисления
        if(mem[n] != 1) {
            return mem[n];
        }

        if (n <= 1) {
            return n;
        }

        long result = error(n - 1, mem) + error(n - 2, mem);
        mem[n] = result;
        return result;
    }
}