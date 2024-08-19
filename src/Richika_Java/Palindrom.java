package Richika_Java;

public class Palindrom {
    public void palindrom(int n) {
        int num = n;
        int temp= num;
        int rem;
        int rev = 0;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (rev == temp)
        {
            System.out.println(rev + "is a palindrom");
        } else {
            System.out.println(rev + "is not a palindrom");
        }
    }
    public static void main(String s[])
    {
        Palindrom p= new Palindrom();
        p.palindrom(121);
    }
}
