package Richika_Java;

public class MinNumber {
    public static void main(String s[])
    {
        int[] arr= {2,3,5,6,4};
        int min= arr[0];
        for(int value: arr){
            if(value<min)
            {
                min=value;
            }
        }
        System.out.print(min);
    }
}
