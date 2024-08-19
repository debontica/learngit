package RichikaPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test
{
    String name = "Rohit";
    String name1 = "Tinai";

    void concatCheck()
    {
        String result = name.concat(name1);
        System.out.println(result);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.concatCheck();

    }

}
