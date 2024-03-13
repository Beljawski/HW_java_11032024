package hw_11032024;
//Показать на экране прямоугольник размером MxN, состоящий из
//звёздочек. Затем сделать то же самое, но чтоб фигура внутри была пустая (остаётся только рамка).
public class Rectangle {
    public static void main(String[] args) {
        int sideM = 6;
        int sideN =4;

        System.out.println("прямоугольник размером 4x6 состоящий из звёздочек:");
        for (int i = 0; i < sideN; i++) {
            for (int j = 0; j < sideM; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("прямоугольник размером 4x6 пустой:");
        for (int i = 0; i < sideN; i++) {
            for (int j = 0; j < sideM; j++) {
                if (i == 0 || i == sideN - 1 || j == 0 || j == sideM - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
