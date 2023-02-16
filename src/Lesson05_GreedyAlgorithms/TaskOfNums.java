// Дан неупорядоченный писко цифр от 0 до 9, ставить из этих цифр наибольшее число
// Жадный алгоритм - на каждом шаге выбирать аибольшую цифру, присоединять ее к результирующему числу
// и удалять цифру из исходного массива

package Lesson05_GreedyAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

public class TaskOfNums {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 8, 9, 0, 4, 4, 5, 1, 9};
        int result;
        // int[] result = new int[numbers.length];

        int max = numbers[0];
        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println(max);


//        Integer[] arr = {9, 7, 7, 1, 1, 1, 3};
//        int result = 0;
//
//        for(int num : arr) {
//            result = 10 * result + num;
//        }
//
//        Arrays.sort(arr, Comparator.reverseOrder());
//        System.out.println(result);
    }
}
