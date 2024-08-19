package Richika_Java;

public class StringReverse {
    public static void main(String s[]){
        String name= "Richika";
        String rev=" ";
        for(int i=name.length()-1; i>=0; i--){
             rev= rev+name.charAt(i);
        }
        System.out.print(rev);
    }
}
