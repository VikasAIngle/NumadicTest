/**
 * 
 */
package com.Numadic.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Numadic.Base.TestBase;
import com.Numadic.Util.TestUtil;

/**
 * @author vikasingle
 *
 */
public class TestCases extends TestBase
{
	
	
	@Test(priority = 0)
	public void firstScenario() throws Exception
	{
		driver.get("https://numadic.com/careers/");
		
		//TestUtil.clickOn(driver, repo.getLocator("header"));
		
		TestUtil.explicitWait(19, repo.getLocator("header"));
		
		Assert.assertEquals(driver.findElement(By.xpath(repo.getLocator("header"))).getText(), "JOIN OUR CREW");
		
		
		TestUtil.selectFromDropdown(repo.getLocator("jobTypeDropdown"), "Internship");
		
		Assert.assertEquals(driver.findElement(By.xpath(repo.getLocator("internMsg"))).getText(), "There are no available job positions that match your filters.");
		
	}
	
	
	
	@Test(priority = 1)
	public void secondScenario() throws Exception
	{
		
		TestUtil.selectFromDropdown(repo.getLocator("jobTypeDropdown"), "Full time");
		
		TestUtil.JSClick(repo.getLocator("clickQAEng"));
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://numadic.com/careers/qa-engineer.php");
		
		
		//Assert.assertEquals(driver.findElement(By.xpath(repo.getLocator("applyHereBtn"))).getText(), "Apply here now");
		
		TestUtil.scrollEle(repo.getLocator("applyHereBtn"));
		
		
		TestUtil.JSClick(repo.getLocator("applyHereBtn"));
	//	
		//Assert.assertEquals(driver.getCurrentUrl(), "https://numadic.com/careers/#careersFormContainer");
		
		
		String currentURL = driver.getCurrentUrl();
		
		System.out.println(currentURL);
		
		Assert.assertEquals(currentURL.contains("https://numadic.com/careers"), true);
		
		TestUtil.explicitWait(20, repo.getLocator("clickQAEng"));
		
		
		//new Actions(driver).moveToElement(new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath(repo.getLocator("clickQAEng"))))).build().perform();
        
		
		
		Actions actions = new Actions(driver);
		
		//actions.moveByOffset(30, 50);
		
		actions.moveToElement(driver.findElement(By.xpath(repo.getLocator("clickQAEng")))).perform();
		
		//Thread.sleep(3000);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
