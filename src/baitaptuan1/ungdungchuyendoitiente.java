package baitaptuan1;

import java.util.Scanner;

public class ungdungchuyendoitiente {
    public static void main(String[] args) {
        System.out.println("nhap so tien can doi ");
        double VND =  23000;
        double USD;
         Scanner sc =new Scanner(System.in);

        USD = sc.nextDouble();
       double quydoi = USD * 23000;
       System.out.println("so tien doi ra la"+ quydoi);
    }
}
