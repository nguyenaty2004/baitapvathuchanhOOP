package baitaptuan1;

import java.util.Scanner;

public class thuchanhgiaiphuongtrinhbacnhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");
        double a = sc.nextDouble();
        System.out.println("nhap b");
        double b = sc.nextDouble();
        System.out.println("nhap c");
        double c = sc.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.println(answer);

        }else {
            if (b == c ){
              System.out.println("Phuong Trinh Vo So Nghiem");
            } else {
                System.out.println("Phuong Trinh Vo Nghiem");
            }
        }

    }
}
