package Richika_Java;

public class StringDuplicateCharacter {
    public static void main(String[] s){
        String str="Richika";
        int count;
        char[] ch= str.toCharArray();
        for(int i=0; i<= ch.length-1;i++){
            count=1;
            for(int j=i+1; j<=ch.length-1;j++){
                if(ch[j]==ch[i]){
                    count++;
                }
            }
            if(count>1){

                System.out.print(ch[i]+ "-" +count+" ");
            }
        }
    }
}
