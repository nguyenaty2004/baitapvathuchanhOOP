package baitapbotuc.ngay20022023;

import java.util.Scanner;

public class BaiTap7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nghap so nguyen to");
        int number = sc.nextInt();
        if (number<2)
            System.out.println(" Day khong phai so nguyen to");
        else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)){
                if (number % i ==0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number +"Day la so nguyen to");
            else
                System.out.println("Day ko phải so nguyen to");
        }
    }
}

