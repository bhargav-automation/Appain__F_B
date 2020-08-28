package Customer_Application;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class keyword {

	static WebDriver driver;

	public void url(String url) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.get(url);
	}

	public void dropdown(String path, String value) {
		waitForElement(path);
		WebElement ops = driver.findElement(By.xpath(path));
		Select sel = new Select(ops);
		sel.selectByVisibleText(value);
	}

	public void Sendkeys(String path, String value) throws InterruptedException {
		Clickaction(path);
		waitForElement(path);
		driver.findElement(By.xpath(path)).sendKeys(value);

	}

	public void Sendkeys1(String path, String value) throws InterruptedException {
//		Clickaction(path);
//		waitForElement(path);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath(path)).sendKeys(value);

	}

	public void Clickaction(String path) throws InterruptedException {

		waitForElement(path);
		driver.findElement(By.xpath(path)).click();

	}

	public void ScrollUp(String path) throws InterruptedException {
		WebElement element = driver.findElement(By.xpath(path));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	}

	public void canvasESign(String element) {
		WebElement target = waitForElement(element);
		target.click();
		System.out.println(target);

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("canves-block"))).click();
		Actions builder = new Actions(driver);
		Action drawAction = builder.moveToElement(target, 20, 20) // start points x axis and y axis.
				.clickAndHold(target).moveByOffset(80, 80) // 2nd points (x1,y1)
				.dragAndDropBy(target, 80, 80).moveByOffset(150, 20) // 3rd points (x2,y2)
				.dragAndDropBy(target, 50, 20).moveByOffset(250, 20) // 3rd points (x2,y2)
				.dragAndDropBy(target, 200, 250).moveByOffset(150, 50) // 3rd points (x2,y2)

				.dragAndDropBy(target, 50, 20).release(target).build();
		drawAction.perform();
	}
    
	public String GetTex(String path)
	{
		waitForElement(path);
		String Valueterm = driver.findElement(By.xpath(path)).getText();
//		System.out.println("text "+Valueterm);
		return Valueterm;
	}
	public boolean Displayed(String path)
	{
		waitForElement(path);
		return driver.findElement(By.xpath(path)).isDisplayed();
	}
	public static WebElement waitForElement(String item) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(item)));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(item)));
		return element;
	}

}
