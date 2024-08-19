package Richika_Java;

public class MaxNumber {
    public static void main(String s[])
    {
        int[] arr= {2,3,5,6,4};
        int max= arr[0];
        for(int i= arr[1]; i<=arr.length-1; i++){
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.print(max);
    }
}
