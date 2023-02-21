package Lesson07_FromAToBTask;

public class Main {
    public static void main(String[] args) {
        int[] stations = {0, 200, 375, 550, 750, 950};

        System.out.println(minStops(stations, 400));
    }

    public static int minStops(int[] stations, int capacity) {
        int result = 0; // оптимальное количество остановок
        int currentStop = 0; // остановка где находится машина
        // пока остановка где находится машина не является последним элементом массива (конечной точкой)
        while (currentStop < stations.length - 1) {
            // следующая остановка равна той остановке где сейчас находится машина
             int nextStop = currentStop;
             // пока следующая не является конечной точкой И следующая остановка минус нынешняя остановка меньше или равны баку в 400 инкрементим
             while(nextStop < stations.length - 1 && stations[nextStop + 1] - stations[currentStop] <= capacity) {
                nextStop++;
             }
            if(currentStop == nextStop) {
                return -1;
            }
            if(nextStop < stations.length - 1) {
                result++;
            }
            currentStop = nextStop;
        }
        return result;
    }
}
