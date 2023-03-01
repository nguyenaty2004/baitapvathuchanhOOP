package baitapbotuc.ngay01032023;

import java.util.Scanner;

public class Bai_Tap_1 {
    public static void main(String[] args) {
        int[] mylist;
        Scanner scanner= new Scanner(System.in);
        mylist = new int[10];
        for (int i=0;i<10;i++){
            System.out.print("Nhap phan tu thu "+(i+1)+" cua mang: ");
            mylist[i]= scanner.nextInt();

        }
        System.out.print("Mang da nhap: ");
        for (int i = 0; i < mylist.length; i++) {
            System.out.print(mylist[i]+" ");
        }
    }
}
