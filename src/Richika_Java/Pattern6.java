package Richika_Java;

public class Pattern6 {
    public static void main(String s[]) {
        for (int i = 1; i<= 5; i++) {
            for (int k =4; k>= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j<= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}