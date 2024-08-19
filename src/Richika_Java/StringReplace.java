package Richika_Java;

public class StringReplace {
    public static void main(String s[]) {
        String s1 = "Tata Consultancy Services";
        String sr = s1.replace("Tata", "T.").replace("Consultancy", "C.").replace("Services", "S").replaceAll("\\s+", "");
        System.out.println(sr);
    }
}
