package Richika_Java;

public class StringWordsReverse {
    public static void main(String[] args) {
        String str="I love java programming";
        String rvsString = "";
        String words[] = str.split("\\s");

        for (int i = words.length-1; i >= 0; i--)
        {
            rvsString= rvsString+words[i]+" ";
        }
        System.out.print(rvsString );
    }
}
