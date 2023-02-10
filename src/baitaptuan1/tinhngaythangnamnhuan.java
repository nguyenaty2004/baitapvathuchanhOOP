package baitaptuan1;

import java.util.Scanner;

public class tinhngaythangnamnhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Nam");
        double year = sc.nextDouble();
        if (year % 4 == 0 ) {
            if (year % 100 == 0) {
                if (year %  400 == 0 ){
                    System.out.println( "Day la Nam Nhuan");
                } else {
                    System.out.println("Day ko phai nam nhuan");
                }

            } else {
                System.out.println("Day la Nam Nhuan");
            }
        }else {
            System.out.println("Day ko phai nam nhuan");
        }


    }
}
