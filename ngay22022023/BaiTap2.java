package baitapbotuc.ngay22022023;

//  Bài 2 Viết phương thức tính tổng các phần tử trong mảng vừa tạo ở câu 1


import java.util.Scanner;

public class BaiTap2 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Nhap do dai mang");
      int a = input.nextInt();
      int[] arrayNumber = new int[a];
      System.out.println(a);

      for (int i = 0; i < a; i++) {
         System.out.println("Nhap so" + i);
         arrayNumber[i] = input.nextInt();
      }


      for (int i = 0; i < a; i++) {
         System.out.println(arrayNumber[i]);

      }
      sum(arrayNumber);

   }

   public static void  sum(int[] arr) {
      int sum= 0;
      for (int i = 0; i < arr.length; i++) {
         sum = sum + arr[i];

      }

      System.out.println(sum);
   }
}

