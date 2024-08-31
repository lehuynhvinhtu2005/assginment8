package string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class baitaptrentruong {

    public static void importData(ArrayList<Integer> arr) {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print("Phan tu thu " + (i + 1) + " la: ");
            arr.set(i, keyboard.nextInt());
        }
    }

    public static void printData(ArrayList<Integer> arr) {
        System.out.print("Array contents: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int findMax2(ArrayList<Integer> arr) {
        Collections.sort(arr);
        return arr.get(arr.size() - 2);
    }

    public static void deleteOddNumbers(ArrayList<Integer> arr) {
        arr.removeIf(num -> num % 2 != 0);

        printData(arr);
    }
}
