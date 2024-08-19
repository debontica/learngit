package Richika_Java;

public class Factorial {
    public void factorial(int n)
    {
        int f=1;
        int num = n;
        for(int i=1; i<= num; i++)
        {
            f=f*i;
        }
        System.out.println(f+ " is factorial of " + num);
    }
    public static void main(String s[]){
        Factorial f1= new Factorial();
        f1.factorial(5);
    }
}
