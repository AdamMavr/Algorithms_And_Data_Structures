// Дан неупорядоченный список цифр от 0 до 9, ставить из этих цифр наибольшее число
// Жадный алгоритм - на каждом шаге выбирать наибольшую цифру, присоединять ее к результирующему числу
// и удалять цифру из исходного массива
// здесь сосредоточены решения к которым я пришел сам
package Lesson05_GreedyAlgorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TaskOfNums {
    public static void main(String[] args) {
        System.out.println(sort(543609));
    }

    public static int sort(int num) {
        // создаем массив строк и помещаем в него число преобразованное в строку с помощью метода valueOf, разделяем их пустой строкой
        String[] numsArr = String.valueOf(num).split("");
        // сортируем массив в порядке убывания с помощью Collections.reverseOrder()
        Arrays.sort(numsArr, Collections.reverseOrder());
        // соединяем элементы отсортированного массива в строку ничем не разделяя, и преобразуем в integer
        return Integer.valueOf(String.join("", numsArr));
    }
}

//    public static int maxNum(int num) {
//        int result = 0; // итоговый результат который будет возвращать метод
//
//        // цикл, который будет идти от максимального числа вниз пока i больше или равно нулю
//        for(int i = 9; i >= 0; i--){
//            // локальная переменная которая хранит в себе значение аргумента
//            int localNum = num;
//
//            // пока значение аргумента больше 0 цикл будет работать
//            while(localNum > 0) {
//                // получаем последнюю цифру от общего числа
//                int digit = localNum % 10;
//                // если эта цифра равна текущей цифре цикла
//                if(digit == i) {
//                    // умножаем ее на 10
//                    result *= 10;
//                    // и присваиваем в переменную результата
//                    result += digit;
//                }
//                // число аргуиента делим на 10 и присваиваем в локальную переменную
//                localNum /= 10;
//            }
//        }
//        return result;
//    }
//}


// int[] result = new int[numbers.length];
//        Integer[] arr = {9, 7, 7, 1, 1, 1, 3};
//        int result = 0;
//
//        for(int num : arr) {
//            result = 10 * result + num;
//        }
//
//        Arrays.sort(arr, Comparator.reverseOrder());
//        System.out.println(result);