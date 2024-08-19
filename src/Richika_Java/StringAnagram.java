package Richika_Java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringAnagram {
    public static void main(String s[])
    {
        String s1= "SILENT";
        String s2= "LISTEN";
        char[]ch1= s1.toCharArray();
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2))
        {
            System.out.print("Strings are Anagram");
        }
        else
        {
            System.out.print("Strings are not Anagram");
        }
    }
}
