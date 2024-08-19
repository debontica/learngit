package Richika_Java;

public class Armstrong {
    public void armstrong(int n) {
        int num = n;
        int temp= num;
        int rem;
        int sum = 0;
        while (num > 0) {
            rem = num % 10;
            sum = (rem*rem*rem)+sum;
            num = num / 10;
        }
        if (sum == temp)
        {
            System.out.println(temp+ " is a armstrong");
        } else {
            System.out.println(temp + " is not a armstrong");
        }
    }
    public static void main(String s[])
    {
        Armstrong a= new Armstrong();
        a.armstrong(153);
    }
}
