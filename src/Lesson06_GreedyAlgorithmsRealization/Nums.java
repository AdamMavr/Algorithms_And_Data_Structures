// Дан неупорядоченный список цифр от 0 до 9, ставить из этих цифр наибольшее число
// Жадный алгоритм - на каждом шаге выбирать наибольшую цифру, присоединять ее к результирующему числу
// и удалять цифру из исходного массива
// здесь конкретный жадный алгоритм

package Lesson06_GreedyAlgorithmsRealization;

import java.util.Arrays;
import java.util.Collections;

public class Nums {
    public static void main(String[] args) {
        int[] digits = {1, 3, 7, 9, 5};
        System.out.println(maxNumberFromDigits(digits));
    }

    public static String maxNumberFromDigits(int[] digits) {
        // более короткая запись того же алгоритма
        //Arrays.stream(digits) - переводим массив в поток
        // boxed - помещает каждый примитив из потока в класс обертку
        // sorted(Collections.reversOrder() - сортируем в обратном порядке
        // map(String::valueOf) - приводим числа к строкам
        // toArray(String[]::new) - переводим строки в массив строк
        // String.join - склеивает элементы массива в строку
        return String.join("", Arrays.stream(digits).boxed()
                .sorted(Collections.reverseOrder())
                .map(String::valueOf)
                .toArray(String[]::new));
        // сложность алгоритма сортировки массива - O(n*log(n)), где n - размер массива
        // сложность конкатенации отсортированного массива со строкой - O(n)
        // конечная сложность будет O(n*log(n)), так как мы не рассматриваем наиболее быстрые оценки

        // длинная форма записи данного жадного алгоритма
//        Arrays.sort(digits); // сортировка массива
//        String result = ""; // строка куда будет записываться итоговое значение
//        // цикл, который начинается с последнего числа отсортированного массива и идет вниз. на каждом цикле мы конкатенируем число со строкой результата
//        for(int i = digits.length - 1; i >= 0; i--) {
//            result += digits[i];
//        }
//        return result;
    }
}
