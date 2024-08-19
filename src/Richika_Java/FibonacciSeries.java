package Richika_Java;

public class FibonacciSeries {
    public void fibonacci(){
     int a= 0;
     int b=1;
     int c;
     for(int i=1; i<=7; i++)
     {
       c=a+b;
       a=b;
       b=c;
       System.out.println(c);
     }
    }
    public static void main(String s[]){
        FibonacciSeries fb= new FibonacciSeries();
        fb.fibonacci();
    }
}
