package Richika_Java;

public class StringCharAdd {
    public static void main(String s[]){
        String s1="Richika";
        int pos= 2;
        char value='i';
        char[] ch= s1.toCharArray();
        for(int i= ch.length-1; i>=2; i--){
            ch[i]=ch[i-1];
        }
        ch[pos]= value;
        System.out.println(ch);

    }
}
