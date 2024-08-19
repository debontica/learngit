package Richika_Java;

public class PrimenoSeries {
    public void primeno(int s ,int e) {
        int start = s;
        int end = e;
        int temp = 0;
        for (int i = start; i <= end; i++) {
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    temp = temp + 1;
                }
            }

            if (temp == 0) {
                System.out.println(i + " is prime number");
            } else {
                temp=0;
            }
        }
    }
    public static void main(String s[])
    {
        PrimenoSeries p= new PrimenoSeries();
        p.primeno(20, 30);
    }
}
