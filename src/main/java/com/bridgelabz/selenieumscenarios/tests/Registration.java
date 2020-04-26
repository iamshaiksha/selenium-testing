package com.bridgelabz.selenieumscenarios.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 * @author Shaik Shaiksha vali
 *
 */
public class Registration {
	WebDriver driver;
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:/Users/rahi/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("localhost:4200/register");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("Fundoonotes"))
		{
			WebElement name= driver.findElement(By.xpath("//input[@id='mat-input-0']"));
			name.sendKeys("shaiksha");
			WebElement email=driver.findElement(By.xpath("//input[@id='mat-input-1']"));
			email.sendKeys("shaiksha123@gmail.com");
			WebElement password=driver.findElement(By.xpath("//input[@id='mat-input-2']"));
			password.sendKeys("Shaiksha@123");
			driver.findElement(By.xpath("//input[@id='mat-input-3']")).clear();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement mobileNumber=driver.findElement(By.xpath("//input[@id='mat-input-3']"));
			mobileNumber.sendKeys("7993374636");
			driver.findElement(By.xpath("/html/body/app-root/app-registration/div/mat-card/div[5]/button[1]")).click();
			try {
				Thread.sleep(4500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		else
		{
			System.out.println(" plzz check your url");
		}


	}

}
