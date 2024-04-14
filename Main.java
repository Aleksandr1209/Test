import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int length = 10;
        double[] array = new double[length];
        for (int i = 0; i < length; i++) {
            array[i] = Math.random();
        }
        System.out.println("Массив случайных чисел: " + Arrays.toString(array));
        double max = array[0];
        for (int i = 1; i < length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        double min = array[0];
        for (int i = 1; i < length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        double average = sum / length;
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее значение: " + average);
    }
}