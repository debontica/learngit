package Richika_Java;

public class Swapping {
    public void swapping(int n, int m)
    {
        int a=n;
        int b=m;
        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("a=" +a);
        System.out.println("b=" +b);

    }
    public static void main(String s[]){
        Swapping s1= new Swapping();
        s1.swapping(10, 11);
    }
}
