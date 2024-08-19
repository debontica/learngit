package Richika_Java;

public class Swapping3rd {
    public void swapping(int n, int m)
    {
        int a=n;
        int b=m;
        int temp =0;
        temp= a;
        a=b;
        b= temp;
        System.out.println("a=" +a);
        System.out.println("b=" +b);

    }
    public static void main(String s[]){
        Swapping3rd s1= new Swapping3rd();
        s1.swapping(5, 6);
    }
}
