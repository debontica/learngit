package Richika_Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringCharacterCount {
    public static void main(String s[])
    {
        Map<Character,Integer> charMap= new HashMap<Character,Integer>();
        String str= "Richika";
        char[] ch= str.toUpperCase().toCharArray();
        for(char c: ch){
            if(charMap.containsKey(c)){
                charMap.put(c,charMap.get(c)+1);
            }
            else{
                charMap.put(c,1);
            }
        }
        System.out.print(charMap);
        }
}

