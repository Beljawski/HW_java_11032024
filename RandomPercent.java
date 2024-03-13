package hw_11032024;

import java.util.Arrays;
import java.util.Random;
//1. Загадать случайно 100 целых чисел в диапазоне от -100 до 100.
//Вычислить процент положительных чисел, процент отрицательных чисел
//и процент нулей. Вычислить процент чётных чисел и процент нечётных.
public class RandomPercent {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(201)-100;
        }
        System.out.println(Arrays.toString(array));
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            if (number>0){
                positiveCount++;
            } else if (number<0){
                negativeCount++;
            }else{
                zeroCount++;
            }

        }
        int totalNumbers = array.length;
        double positivePercentage = (double) positiveCount / totalNumbers * 100;
        double negativePercentage = (double) negativeCount / totalNumbers * 100;
        double zeroPercentage = (double) zeroCount / totalNumbers * 100;
        double evenPercentage = (double) evenCount / totalNumbers * 100;
        double oddPercentage = 100 - evenPercentage;
        System.out.println("Процент положительных чисел: " + positivePercentage + "%");
        System.out.println("Процент отрицательных чисел: " + negativePercentage + "%");
        System.out.println("Процент нулей: " + zeroPercentage + "%");
        System.out.println("Процент чётных чисел: " + evenPercentage + "%");
        System.out.println("Процент нечётных чисел: " + oddPercentage + "%");

    }
   
}
