import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.KeyStroke;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollFunction {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(10000);
		driver.get("https://www.google.com");
	
		//JavascriptExecutor execute = (JavascriptExecutor)driver;
		//execute.executeScript("window.scrollBy(0,1000)");
		//execute.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		//System.out.println("scrolled to bottom of the page ...");
		Thread.sleep(5000);
		
		Robot robo = new Robot();
		/*robo.mousePress(InputEvent.BUTTON3_MASK);
		robo.mouseRelease(InputEvent.BUTTON3_MASK);
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);*/
		
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_S);
		robo.keyRelease(KeyEvent.VK_S);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
		
		System.out.println("end");
		//driver.quit();
		
		
		
		
		
		
		
		
		
		
	}

}
