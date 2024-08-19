package Richika_Java;

public class StringDigit {
    public static void main(String s[]) {
        String str = "a2e3";
        for(int i= 0; i<= str.length()-1;i++){
            if(Character.isAlphabetic(str.charAt(i))){
                System.out.print("");
            }
            else{
                int x= Character.getNumericValue(str.charAt(i));
                for(char j=str.charAt(i-1); j<x;j++){
                  System.out.print(j);
                }
            }
        }

    }
}
