package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NssTodoListPage {

	
 WebDriver driver;
	
	public NssTodoListPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By toggleCheckBox = By.cssSelector("input[type='checkbox'][name='allbox']");
	
	
	

	public void clickToggleAllCheckBox() {
		driver.findElement(toggleCheckBox).click();
	}
	
	public void ToggleAllCheckBox() {
		String str = driver.findElement(toggleCheckBox).getAttribute("checked");
		if (str.equalsIgnoreCase("true"))
		{
		    System.out.println("Checkbox selected");
		}
		
	}
	
	
	
}

	
	

