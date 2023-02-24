package baitapbotuc.ngay24022023;


import java.util.Arrays;
import java.util.Scanner;

public class baitap1 {

        public static void main(String[] args) {
            int n;
            int[] arr = {2,3,5,7,11,13,17,19,23,29};
            Scanner sc= new Scanner(System.in);
            System.out.print("nhập số n = ");
            n = sc.nextInt();

            if(check(arr,n)) {
                System.out.println("có tồn tại trong mảng ");
            } else {
                System.out.println("không tồn tại trong mảng");
            }
            daonguoc(arr);
        }

    private static void daonguoc(int[] arr) {
    }

    public static boolean check(int[] songuyen, int n ) {
        boolean ketqua = false;

        for (int i = 0; i < songuyen.length; i++) {
            if (songuyen[i] == n) {
                ketqua = true;
            }
        }
        return ketqua;
    }
}