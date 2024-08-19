package Richika_Java;

public class ArrayReverse {
    public static void main(String s[]){
       int[] arr={2,3,8,5,6,9};
       int start=0;
       int end= arr.length-1;
       int temp=0;
       while(start<end){
         temp= arr[start];
         arr[start]= arr[end];
         arr[end]= temp;
         start++;
         end--;
       }
       for(int values: arr)
       {
           System.out.print(values+ " ");
       }
    }
}
