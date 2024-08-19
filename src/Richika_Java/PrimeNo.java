package Richika_Java;

public class PrimeNo {

        public void primeno(int pn)
        {
            int num=pn;
            int temp= num;
            int flag=0;
            for(int i=2; i<= num-1; i++) {
                if (num % i == 0) {
                    flag = flag + 1;
                }
            }
                if(flag==0)
                {
                    System.out.println(temp+ " is prime number");
                }
                else{
                    System.out.println(temp+ " is not prime number");
                }
            }

    public static void main(String s[])
    {
        PrimeNo p= new PrimeNo();
        p.primeno(23);
    }
}
