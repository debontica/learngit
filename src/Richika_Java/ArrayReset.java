package Richika_Java;

public class ArrayReset {
    public static void main(String s[])
    {
        int[] arr={2,4,6,8};
        int pos=2;
        int value=9;
        for(int i=arr.length-1; i>=2; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos]= value;
        for(int values: arr){
            System.out.print(values+ " ");
        }
    }
}
