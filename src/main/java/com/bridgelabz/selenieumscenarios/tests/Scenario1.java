package com.bridgelabz.selenieumscenarios.tests;


import java.util.concurrent.TimeUnit;

import org.omg.PortableServer.THREAD_POLICY_ID;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 * @author Shaik shaiksha vali
 *
 */
public class Scenario1 {

	public static void main(String[] args) {

	      
		System.setProperty("webdriver.chrome.driver", "C:/Users/rahi/Downloads/chromedriver_win32 (1)/chromedriver.exe"); 
		WebDriver driver=new ChromeDriver(); 
		 
		// Launch website  
//	    driver.get("https://www.google.com/"); 
//	    
//	    String title=driver.getTitle();
//	    System.out.println("The title is--->"+title);
//	    String currenturl= driver.getCurrentUrl();
//	    System.out.println("The title is--->"+currenturl);
//	    String pageSource=driver.getPageSource();
//	    System.out.println("THe page source is---->"+pageSource);
//	    driver.quit();
//	    driver.get("https://www.facebook.com");
		/**
		 * Another way for navigating to webpage
		 */
//	    Navigation navigator=driver.navigate();
//	    navigator.to("https://www.google.com");
////	    navigator.back();
////	    navigator.forward();
//	    navigator.to("https://www.facebook.com");
//	    navigator.back();
//	    driver.navigate().back();
//	    navigator.forward();
//	    navigator.refresh();
	    
//		/**
//		 * Date picker
//		 */
//		driver.get("https://www.expedia.co.in/");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("hotel-checkout-hp-hotel")).click();
//		driver.switchTo().frame("datepicker-dropdown");
//		driver.findElement(By.xpath("//[@id=hotel-checkout-wrapper-hp-hotel]/div/div/div[2]/table/tbody/tr[4]/td[5]/button"));
		
		/**
		 * locators
		 */
//		driver.get("https://www.facebook.com");
//		driver.manage().window().maximize();
//		 driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("shaiksha");
//		 driver.findElement(By.cssSelector("#u_0_o")).sendKeys("shaik");
//		 driver.findElement(By.name("reg_email__")).sendKeys("iamshaiksha2019@gmail.com");
//		 driver.findElement(By.name("reg_email_confirmation__")).sendKeys("iamshaiksha2019@gmail.com");
//		 driver.findElement(By.name("reg_passwd__")).sendKeys("Shaiksha@123");
////		 driver.findElement(By.id("day")).click();
//		 driver.findElement(By.linkText("Sign Up")).click();;
		driver.get("localhost:4200/login");
		driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("iamshaiksha2019@gmail.com");
		 driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("Shaiksha@123");
		 driver.findElement(By.xpath("/html/body/app-root/app-login/div/mat-card/div[3]/button[1]/span")).click();
		 
//		 Navigation nav=driver.navigate();
//		 nav.refresh();
//		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		 nav.to("http://localhost:4200/dashboard/notes");
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//		 driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div[1]/mat-toolbar/mat-toolbar-row/button/span/mat-icon")).click();
//		 driver.findElement(By.xpath("//input[@id='noteclick ']")).click();
//		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		 driver.findElement(By.id("title")).click();
////		 driver.findElement(By.id("description")).clear();
//		 driver.findElement(By.id("title")).sendKeys("cucumber testcase passed");
////		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		 driver.findElement(By.id("description")).click();
////		 driver.findElement(By.id("description")).clear();
//		 driver.findElement(By.id("description")).sendKeys("selenieum testcase passed");
////		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		 try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 driver.findElement(By.xpath(("/html/body/app-root/app-dashboard/div/div[2]/mat-sidenav-container/mat-sidenav-content/app-note/div/mat-card/button/span"))).click();
//		 nav.refresh();
		 
		 
//		 driver.findElement(By.xpath(("/html/body/app-root/app-dashboard/div/div[1]/mat-toolbar/mat-toolbar-row/div[4]/button[5]"))).click();
//		 try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 driver.findElement(By.xpath(("//img[@id='mat-menu-panel-173']/div/div/button/span/img"))).click();
		 driver.findElement(By.xpath(("/html/body/app-root/app-dashboard/div/div[1]/mat-toolbar/mat-toolbar-row/button/span/mat-icon"))).click();
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		 driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/mat-sidenav-container/mat-sidenav/div/div[3]/button[1]/span/span")).click();
//		 try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 driver.findElement(By.id("trash")).click();
//		 try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		 driver.findElement(By.id("editlabel")).click();
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		driver.findElement(By.id("edit")).sendKeys("cucumber");
		driver.findElement(By.id("done")).click();
	}
}
	          