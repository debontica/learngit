package RichikaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rohit {

        public static void main(String[] args)
        {
            ChromeDriver driver=new ChromeDriver();
            driver.get("https://www.google.com/");
            WebElement element=driver.findElement(By.xpath("//textarea[@name='q']"));
            element.sendKeys("Songs");
            element.submit();
        }
    }

