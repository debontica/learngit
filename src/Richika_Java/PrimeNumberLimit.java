package Richika_Java;

public class PrimeNumberLimit {
    public static void main(String s[]) {

        int num=5;
        int count=0;
        int flag=0;
        while(count<=5){
        for(int i=2; i<= num-1; i++) {
            if (num % i == 0) {
                flag = flag + 1;
            }
            num++;
        }
        if(flag==0)
        {
            System.out.println(num + " is prime number");
            count=1;
        }
       count++;

        }
    }
}
