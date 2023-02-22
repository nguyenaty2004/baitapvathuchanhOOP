package baitapbotuc.ngay22022023;

import java.util.Scanner;

public class BaiTap4 {

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Nhap do dai mang");
            int a = input.nextInt();
            int[] arrayNumber = new int[a];
            double max=0;

            for (int i=0; i< a; i++){
                System.out.println("Nhap so" + i);
                arrayNumber[i]= input.nextInt();
            }

            for(int i=0; i< a; i++){
                System.out.println(arrayNumber[i]);
            }
            for (double num: arrayNumber) {
                if(max < num)
                    max = num;
            }
            System.out.printf("Số lớn nhất trong mảng là:"+ max);
        }
}
