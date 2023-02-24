package baitapbotuc.ngay24022023;

import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] arrayNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int size= arrayNumber.length;

        for (int i = 1; i < arrayNumber.length; i++) {
            System.out.print( i +"\t");

        }
        for (int j = 0; j < arrayNumber.length / 2; j++) {
            int temp = arrayNumber[j];
            arrayNumber[j] = arrayNumber[size - 1 - j];
            arrayNumber[size - 1 - j] = temp;
        }

        System.out.printf( "Dao nguoc thanh ", "");
        for (int i = 1; i < arrayNumber.length; i++) {
            System.out.print(arrayNumber[i] + "\t");
        }
    }

}
