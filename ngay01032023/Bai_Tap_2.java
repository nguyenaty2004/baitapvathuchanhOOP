package baitapbotuc.ngay01032023;

public class Bai_Tap_2 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};

        int sum=0;
        for (int i = 0; i < array.length; i+=2) {
            sum = sum+ array[i];
        }
        System.out.print("Tong vi tri 1 3 5 7 9 : "+sum);
    }
}
