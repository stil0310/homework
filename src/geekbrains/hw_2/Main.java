package geekbrains.hw_2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = Main.reverseArray();
        System.out.println(Arrays.toString(arr));
        int[] arr1 = Main.numbersArray();
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = Main.changeArray();
        System.out.println(Arrays.toString(arr2));
        int arrMin = Main.min();
        System.out.println(arrMin);
        int arrMax = Main.max();
        System.out.println(arrMax);
        int[][] arr3 = Main.createArray();
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(Arrays.toString(arr3[i]));
        }
    }

    // Задание 1

    public static int[] reverseArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        return arr;
    }

    // Задание 2

    public static int[] numbersArray() {
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3 + 1;
        }
        return arr;
    }

    // Задание 3

    public static int[] changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        return arr;
    }

    // Задание 4

    public static int min() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int minValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        return minValue;
    }

    public static int max() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int maxValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    // Задание 5

    public static int[][] createArray() {
        int[][] arr = new int[8][8];

        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i][arr.length - i - 1] = 1;
        }
        return arr;
    }
}
