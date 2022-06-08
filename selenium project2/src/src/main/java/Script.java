package src.main.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Script extends DriverTest {
	
	 public void loadPage(String dType,String url){
	   setproperties(dType,url);
	   System.out.print("load page");
	}
	
	 // login
    public void TestA() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		driver.findElement(By.id("nli_log_in_button")).click();
		
		WebElement username=driver.findElement(By.id("login"));
		WebElement password=driver.findElement(By.id("password"));
		username.sendKeys("qatest2022");
		password.sendKeys("brainp0p");
		driver.findElement(By.id("btnLogin")).click();	
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		WebElement limitExceedPage=driver.findElement(By.id("continue"));
		
		// handle login issue
		if(limitExceedPage.isDisplayed()) {
			driver.findElement(By.id("continue")).click();
			System.out.print("Maximum users exceed page found!");
		}
		
		Thread.sleep(1000);
		String expectedTitle = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[1]/div/div/div[3]/div[2]/div/div/div[1]/div/div[2]/div/h2")).getText();
		String actualTitle = "Today’s BrainPOP Topic";
		assertEquals(actualTitle, expectedTitle);
    }
    
	
    // Search and validate values
    public void TestB() {
    	/*
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
	
		System.out.print("inside search");
		
		WebElement searchInput=driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/div/div/div[2]/div/div/div/div/div/div[2]/input"));
		searchInput.sendKeys("Challenge");
		driver.findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/div/div/div[2]/div/button")).click();
		
		
		// calculate list
		int expectedValue = driver.findElements(By.xpath("/html/body/div[2]/div[3]/div[3]/div[3]/div/ul/li")).size();
		// get value from xpath
		String actualValue = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[3]/div[1]/h2/span[2]")).getText();
		assertEquals(actualValue, String.valueOf(expectedValue));
		
    }
	


    // select DNA
    public void TestC() {	
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[3]/div[3]/div/ul/li[15]/a/div")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    
    // watch movie
    public void TestD() {	
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		// click watch now button
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div[1]/div/main/div[4]/div/div/div/div[1]/div[2]/a")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// click play icon
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[1]/div/div/main/div[2]/div/div/div/div/div/div[1]/div/div/div/div[2]/div[2]/button[1]")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// click mute icon
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[1]/div/div/main/div[2]/div/div/div/div/div/div[1]/div/div/div/div[2]/div[2]/div/button")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[1]/div/div/main/div[2]/div/div/div/div/div/div[1]/div/div/div/div[2]/div[2]/div/button")).click();
		
		// click captions
		//driver.findElement(By.id("caption")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// click settings
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[1]/div/div/main/div[2]/div/div/div/div/div/div[1]/div/div/div/div[2]/div[2]/button[3]")).click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[1]/div/div/main/div[2]/div/div/div/div/div/div[1]/div/div/div/div[2]/div[2]/button[3]")).click();
		

		
		// validate full video 
		/*
		String lengthOfVideo = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[1]/div/div/main/div[2]/div/div/div/div/div/div[1]/div/div/div/div[2]/div[1]/time[2]")).getText();
		System.out.print(lengthOfVideo);
		
		try {
			Thread.sleep(Integer.valueOf(lengthOfVideo)*60 + 500 );
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		validate final screen elements
		String expectedReplayText = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[1]/div/div/main/div[2]/div/div/div/div/div/div[1]/div/div/div/div[1]/div[3]/div/div/ul/li[1]/button/span")).getText();
		String actualReplayText = "Replay the movie";
		
		assertEquals(actualReplayText, expectedReplayText);
		*/
    }


    
    // toggle cc
    
    public void TestE() {	
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		// click cc
		driver.findElement(By.id("caption")).click();
		
		WebElement cc = driver.findElement(By.id("caption"));
		String expectedCCText = cc.getAttribute("class");
		String actualCCText = "control_item button-wrapper medium";
		
		assertNotEquals(actualCCText, expectedCCText);
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// click again
		driver.findElement(By.id("caption")).click();
		
		WebElement cc2 = driver.findElement(By.id("caption"));
		String expectedCCText2 = cc2.getAttribute("class");
		String actualCCText2 = "control_item button-wrapper medium";
		
		assertEquals(actualCCText2, expectedCCText2);
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    
    // got to features list
    public void TestF() {	
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		// click on DNA icon 
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[1]/div/div/main/div[1]/div/nav/ul/li[3]/a/span")).click();
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// goto related reading page
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div[1]/div/main/div[4]/div/div/div/div[2]/div/ul/li[5]/a/div/div[2]/div")).click();
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// click on DNA icon to go back
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/ul/li[3]/div/a")).click();
    
    }
   
    
    // topic page - select feature
    public void TestG() {	
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		/*
		List <WebElement> listings = driver.findElements(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div[1]/div/main/div[2]/div/div[2]/ul/li[1]"));
		Random r = new Random();
		int randomValue = r.nextInt(listings.size()); //Getting a random value that is between 0 and (list's size)-1
		listings.get(randomValue).click(); //Clicking on the random item in the list.
		
		*/
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div[3]/div[1]/div/main/div[2]/div/div[2]/ul/li[8]/a/div/div[2]/div")).click();
		
		
		System.out.print("randome one selected");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
    }
  
    

    
    
   
	

}
