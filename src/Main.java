import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        System.out.println();
        task4();
        //task5();
        //task6();
        //task7();
        //task8();
        //task9();
        //task10();
    }

    public static void task1() {

        System.out.println("Задача 1. Объявите три массива.");
        int[] integerNumbers = new int[]{1, 2, 3}; //Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.
        double[] arrayNumbers = {1.570, 7.654, 9.986};//Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
        float[] array = new float[]{1.1F,2.2F,3.3F,4.4F,5.5F,6.6F,7.7F,8.8F,9.9F}; //произвольный массив объявленный с помощью ключевого слова
    }

    public static void task2() {
        System.out.println("Задача 2.Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.");
        System.out.println("Решение: ");
        int[] integerNumbers = new int[]{1, 2, 3};
        double[] arrayNumbers = {1.570, 7.654, 9.986};//Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
        float[] array = new float[]{1.1F,2.2F,3.3F,4.4F,5.5F,6.6F,7.7F,8.8F,9.9F}; //произвольный массив объявленный с помощью ключевого слова
        for (int i = 0; i < integerNumbers.length; i++) {
            if (i == integerNumbers.length - 1) {
                System.out.print(integerNumbers[i]);System.out.println();
            } else System.out.print(integerNumbers[i] + ", ");
        }
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (i == arrayNumbers.length - 1) {
                System.out.print(arrayNumbers[i]);System.out.println();
            } else System.out.print(arrayNumbers[i] + ", ");
        }
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);System.out.println();
            } else System.out.print(array[i] + ", ");
        }

    }
    public static void task3() {
        System.out.println("Задача 3.Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки запятую ставить не надо.");
        System.out.println("Решение: ");
        int[] integerNumbers = new int[]{1, 2, 3};
        double[] arrayNumbers = {1.570, 7.654, 9.986};//Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
        float[] array = new float[]{1.1F,2.2F,3.3F,4.4F,5.5F,6.6F,7.7F,8.8F,9.9F}; //произвольный массив объявленный с помощью ключевого слова
        for (int i = integerNumbers.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(integerNumbers[i]);System.out.println();
            } else System.out.print(integerNumbers[i] + ", ");
        }
        for (int i = arrayNumbers.length-1; i >=0; i--) {
            if (i == 0) {
                System.out.print(arrayNumbers[i]);System.out.println();
            } else System.out.print(arrayNumbers[i] + ", ");
        }
        for (int i = array.length-1; i >=0 ; i--) {
            if (i == 0) {
                System.out.print(array[i]);System.out.println();
            } else System.out.print(array[i] + ", ");
        }

    }
    public static void task4() {
        System.out.println("Задача 4.Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).");
        System.out.println("Решение: ");
        int[] integerNumbers = new int[]{1, 2, 3};
        //double[] arrayNumbers = {1.570, 7.654, 9.986};//Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.
        //float[] array = new float[]{1.1F, 2.2F, 3.3F, 4.4F, 5.5F, 6.6F, 7.7F, 8.8F, 9.9F}; //произвольный массив объявленный с помощью ключевого слова
        for (int i = 0; i < integerNumbers.length; i++) {
            if (integerNumbers[i] % 2 != 0) {
                integerNumbers[i] += 1;
            }
        }
            System.out.print("Распечатка доработанного массива: ");
            for (int i = 0; i < integerNumbers.length; i++) {// распечатка обработанного массива
                if (i == integerNumbers.length - 1) {
                    System.out.print(integerNumbers[i]);
                    System.out.println();
                } else System.out.print(integerNumbers[i] + ", ");
            }
            System.out.print("Распечатка доработанного массива при помощи Arrays.toString: ");
            System.out.println(Arrays.toString(integerNumbers));
        }

    }


