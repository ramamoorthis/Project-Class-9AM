package org.comp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibGlobal {
	public static WebDriver driver;
	public static WebDriver getDriver()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\balamurugan\\eclipse-workspace\\MavenProjects\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
		return driver;	
	}
	public static void loadUrl(String url)
	{
		driver.get(url);

	}
	public void title()
	{
	System.out.println(driver.getTitle());
	}
	public static void skey(WebElement element,String data)
	{
		element.sendKeys(data);
	}
	public static void btnClick(WebElement element)
	{
	element.click();
	}
	public static void maximize()
	{
		driver.manage().window().maximize();
	}
	public WebElement locatorById(String data)
	{
	return driver.findElement(By.id(data));
}
}