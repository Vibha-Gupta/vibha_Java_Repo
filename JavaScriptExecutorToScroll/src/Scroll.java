import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Scroll {

	public static void main(String[] args) throws Exception {
		
		System.out.println(System.getProperty("user.dir")+"/chromedriver");
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		FileWriter fr=new FileWriter(System.getProperty("user.dir")+"/Links.txt");
		 BufferedWriter br=new BufferedWriter(fr);
			for (WebElement element: list){
				String link = element.getAttribute("href");
				 br.write(link);
				 br.newLine();
			}
		br.close();
		
		
		
		driver.quit();
		System.out.println("driver quit");
	}
	
	
	
	
	

}
