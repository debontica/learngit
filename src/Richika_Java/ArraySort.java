package Richika_Java;

public class ArraySort {
    public static void main(String s[])
    {
        int[] arr={2,4,6,8};
        for(int i=0; i<= arr.length-1; i++)
        {
            for(int j= i+1; j<= arr.length-1;j++)
            {
                if(arr[j]> arr[i])
                {
                    int temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }
        for (int values: arr)
        {
            System.out.print(values);
        }
    }
}
