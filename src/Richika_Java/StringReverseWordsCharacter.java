package Richika_Java;

public class StringReverseWordsCharacter {
    public static void main(String s[]){
    String name= "Richika Sarker";
    String strrev=" ";
    String[] words= name.split("\\s");  //[richika, sarker]

    for(String word: words){
       String revword="";
        for(int i=word.length()-1; i>=0; i--)
        {
            revword= revword+word.charAt(i);
        }
        strrev= strrev+revword +" ";

    }
    System.out.print(strrev);
}
}
