package src.main.java;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverTest {
    static WebDriver driver;
    public void setproperties(String driverType,String url){
        if(driverType=="Chrome"){
            System.setProperty("webdriver.chrome.driver", "res/chromedriver.exe");
            driver=new ChromeDriver();
        }

        driver.navigate().to(url);
        driver.manage().window().maximize();

    }
}
