package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample2 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sekarvijaya\\Man\\NewSample\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Task no 1;;;;
		// driver.get("https://www.amazon.com/");
		// driver.manage().window().maximize();
		// driver.findElement(By.xpath("//input[@type='text']")).sendKeys("i phone
		// x",Keys.ENTER);
		// WebElement clck = driver.findElement(By.xpath("(//span[@class='a-size-medium
		// a-color-base a-text-normal'])[2]"));
		// Actions ac=new Actions(driver);
		// ac.contextClick(clck).perform();
		// Robot jr=new Robot();
		//
		// for (int i = 0; i <=1; i++) {
		// jr.keyPress(KeyEvent.VK_DOWN);
		// jr.keyRelease(KeyEvent.VK_DOWN);
		//
		// }
		//
		// jr.keyPress(KeyEvent.VK_ENTER);
		// jr.keyRelease(KeyEvent.VK_ENTER);
		// Thread.sleep(5000);
		// String parnt = driver.getWindowHandle();
		// Set<String> allwind = driver.getWindowHandles();
		// for (String string : allwind) {
		// if (! parnt.equals(string)) {
		// driver.switchTo().window(string);
		// }
		//
		// }
		// String text =
		// driver.findElement(By.xpath("//span[@id='priceblock_ourprice']")).getText();
		// System.out.println(text);
		// Task no 2
		// driver.get("https://www.snapdeal.com/");
		// driver.manage().window().maximize();
		// driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys("iphone
		// 7", Keys.ENTER);
		// driver.findElement(By.xpath("(//*[@class='product-title'])[1]")).click();
		// String parwind = driver.getWindowHandle();
		// Set<String> allwind = driver.getWindowHandles();
		// for (String string2 : allwind) {
		// if (!parwind.equals(allwind)) {
		// driver.switchTo().window(string2);
		//
		// }
		// }
		// String text =
		// driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		// System.out.println(text);
		// Task no 3
		// driver.get("https://www.flipkart.com/");
		// driver.manage().window().maximize();
		// Robot r = new Robot();
		// r.keyPress(KeyEvent.VK_ESCAPE);
		// r.keyRelease(KeyEvent.VK_ESCAPE);
		// driver.findElement(By.xpath("//input[@title='Search for products, brands and
		// more']")).sendKeys("hp laptop",
		// Keys.ENTER);
		// Thread.sleep(5000);
		// driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[1]")).click();
		// Set<String> allwind = driver.getWindowHandles();
		// List<String> l = new ArrayList<>();
		// l.addAll(allwind);
		// driver.switchTo().window(l.get(1));
		// String text = driver.findElement(By.xpath("//div[@class='_30jeq3
		// _16Jk6d']")).getText();
		driver.get("http://www.greenstechnologys.com/python-training.html");
		driver.manage().window().maximize();
		WebElement text = driver.findElement(By.xpath("//*[text()=' Selenium Test Papers']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView('true')", text);
		driver.findElement(By.id("Curricu-accordiannn1")).click();
		driver.findElement(By.xpath("//*[text()='Selenium Day 10 Task']")).click();

	}
}
