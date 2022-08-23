/**
 * 
 */
package com.Numadic.Util;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Numadic.Base.TestBase;



/**
 * @author vikasingle
 *
 */
public class TestUtil extends TestBase
{

	
	public static void explicitWait(int Seconds, String path)
	{
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Seconds));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(path)));
	}
	
	public static void JSClick(String path)
	{
		TestUtil.explicitWait(10, path);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", driver.findElement(By.xpath(path)));
		
	}
	
	
	public static void sendKeys(String path, String txt)
	{
		TestUtil.explicitWait(10, path);
		
		WebElement ele = driver.findElement(By.xpath(path));
		
		ele.clear();
		ele.sendKeys(txt);
	}
	
	public static void clickOn(String path)
	{
		TestUtil.explicitWait(10, path);
		driver.findElement(By.xpath(path)).click();
	}
	
	public static void selectFromDropdown(String path, String txt)

	{
		TestUtil.explicitWait(20, path);
		
		Select select = new Select(driver.findElement(By.xpath(path)));
		
		select.selectByVisibleText(txt);
		
		
		
	}
	
	public static void scrollEle(String path) throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		TestUtil.explicitWait(20, path);
		//Vertical scroll down by 600  pixels		
//        jse.executeScript("window.scrollBy(0,600)");
        
        Thread.sleep(3000);
		
        // Scroll till required element
		jse.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(path)));
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
