package baitapbotuc.ngay24022023;

public class baitap3 {
    public static void main(String[] args) {
        int [] numbers ={2,3,5,7,11,-12    ,18,19,23,29,};

        int minNumberInArray = findMinInArray(numbers);
        System.out.println("Min: "  + minNumberInArray);
    }

    private static int findMinInArray(int[] numbers) {
        int min = numbers[0];

        for (int i = 0; i <numbers .length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }

        }
        return min;

    }
}
