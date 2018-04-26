package com.google.webpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb_login 
{
	static
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
	//WebDriver driver=new FirefoxDriver();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
	driver.manage().deleteAllCookies();
	driver.get("https://www.fb.com");
	WebElement button=driver.findElement(By.xpath("//a[contains(text(),'Forgotten ')]"));
	button.click();
	driver.navigate().back();
	Thread.sleep(2000);
	WebElement firstname=driver.findElement(By.id("u_0_k"));
	firstname.sendKeys("HARA HARA");
	WebElement surname=driver.findElement(By.id("u_0_m"));
	surname.sendKeys("MAHA DEV");
	WebElement email=driver.findElement(By.id("u_0_p"));
	email.sendKeys("Kailsah@mount.com");
	Thread.sleep(1000);
	WebElement remail=driver.findElement(By.id("u_0_s"));
	remail.sendKeys("Kailsah@mount.com");
	Thread.sleep(1000);
	WebElement password=driver.findElement(By.id("u_0_w"));
	password.sendKeys("parvathi");
	WebElement bday=driver.findElement(By.id("day"));
	Select day=new Select(bday);
	day.selectByIndex(8);
	Thread.sleep(2000);
	WebElement bmonth=driver.findElement(By.id("month"));
	Select month=new Select(bmonth);
	month.selectByValue("1");
	Thread.sleep(2000);
	WebElement byear=driver.findElement(By.id("year"));
	Select year=new Select(byear);
	year.selectByVisibleText("1996");
	Thread.sleep(2000);
	WebElement radio=driver.findElement(By.xpath("//input[@name='sex' and @value='2']"));
	radio.click();
	WebElement signup=driver.findElement(By.xpath("//button[.='Sign Up']"));
	signup.click();
	Thread.sleep(2000);
	}

}
