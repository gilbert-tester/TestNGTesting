package TheATeam.TheATeam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WalMart_Project {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/mac/eclipse-workspace/TheATeam/Folder/Driver/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.walmart.com/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		
		driver.close();
		driver.quit();
		
		
		
		
		
	}

}
