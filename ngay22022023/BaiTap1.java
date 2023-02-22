package baitapbotuc.ngay22022023;

import java.util.Scanner;

public class BaiTap1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai mang");
        int a = sc.nextInt();
        int [] arraynumber = new int[a];

        for (int i = 0; i < a; i++) {
            System.out.println("Nhap so" + i);
            arraynumber [i] = sc.nextInt();

        }

        for (int i = 0; i < a; i++) {
            System.out.println(arraynumber[i]);

        }
    }
}










