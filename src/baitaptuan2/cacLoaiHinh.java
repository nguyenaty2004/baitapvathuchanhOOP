package baitaptuan2;

public class cacLoaiHinh {
        public static void main(String[] args) {
            for (int i=0;i<3;i++){
                System.out.println("");
                for (int j=0;j<7;j++){
                    System.out.print("* ");
                }
            }
            System.out.println();

            System.out.println();
            for (int i=1; i<=6; i++){
                for(int j=1; j<i;j++){
                    System.out.print("* ");
                }
                System.out.println();

            }
            System.out.println();
            for (int i=6;i>=1;i--){
                for(int j=1; j<i;j++){
                    System.out.print("* ");
                }
                System.out.println();

            }

        }
    }
   
