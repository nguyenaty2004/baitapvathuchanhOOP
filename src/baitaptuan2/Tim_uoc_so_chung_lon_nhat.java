package baitaptuan2;

import java.util.Scanner;

public class Tim_uoc_so_chung_lon_nhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a:");
        a = input.nextInt();
        System.out.println("Nhap b:");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Khong có so uoc chung");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("Uoc chung lon nhat la: "+a);
    }
}
