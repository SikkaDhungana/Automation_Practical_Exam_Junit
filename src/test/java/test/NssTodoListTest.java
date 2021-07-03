package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page.NssTodoListPage;
import util.BrowserFactory;

public class NssTodoListTest {

	static WebDriver driver;

	@Test
	public void UserShouldBeAbleToClickOnToogleAllCheckBox() throws InterruptedException {

		driver = BrowserFactory.init();

	

		NssTodoListPage nssTodoListPage = PageFactory.initElements(driver, NssTodoListPage.class);
		nssTodoListPage.clickToggleAllCheckBox();
		Thread.sleep(2000);
		nssTodoListPage.ToggleAllCheckBox();
		
		
		BrowserFactory.tearDown();

	}
}


