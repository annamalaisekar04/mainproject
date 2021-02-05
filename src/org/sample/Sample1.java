package org.sample;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sekarvijaya\\Man\\NewSample\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("http://www.greenstechnologys.com");
		// TakesScreenshot ts=(TakesScreenshot)driver;
		// File src = ts.getScreenshotAs(OutputType.FILE);
		// File des=new File("M:\\Screenshot\\greens.png");
		// des.mkdir();
		// FileUtils.copyFile(src, des);
		// driver.get("https://www.flipkart.com/");
		// WebElement butt = driver.findElement(By.xpath("//button[@class='_2KpZ6l
		// _2doB4z']"));
		//
		// butt.click();
		// WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		// text.sendKeys("iphone", Keys.ENTER);
		// TakesScreenshot ts = (TakesScreenshot) driver;
		// File src = ts.getScreenshotAs(OutputType.FILE);
		// File des = new File("M:\\Screenshot\\flipkart.png");
		// FileUtils.copyFile(src, des);
		// driver.get("https://www.amazon.in");
		// WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
		// text.sendKeys("motorolo",Keys.ENTER);
		// TakesScreenshot ts= (TakesScreenshot)driver;
		// File src = ts.getScreenshotAs(OutputType.FILE);
		// File des= new File("M:\\Screenshot\\amazon.png");
		// FileUtils.copyFile(src, des);
		// driver.get("https://www.snapdeal.com/");
		// WebElement text =
		// driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		// text.sendKeys("lenovo lap",Keys.ENTER);
		// TakesScreenshot ts=(TakesScreenshot)driver;
		// File src = ts.getScreenshotAs(OutputType.FILE);
		// File des=new File("M:\\Screenshot\\snapdeal.png");
		// FileUtils.copyFile(src, des);
		// driver.get("http://greenstech.in/selenium-course-content.html");
		// WebElement text = driver.findElement(By.id("heading20"));
		// text.click();
		// TakesScreenshot ts=(TakesScreenshot)driver;
		// File src = ts.getScreenshotAs(OutputType.FILE);
		// File des= new File("M:\\Screenshot\\greensportal.png");
		// FileUtils.copyFile(src, des);
		// driver.get("http://greenstech.in/selenium-course-content.html");
		// WebElement butt =
		// driver.findElement(By.xpath("(//div[@data-toggle='collapse'])[16]"));
		// butt.click();
		// TakesScreenshot ts=(TakesScreenshot)driver;
		// File src = ts.getScreenshotAs(OutputType.FILE);
		// File des=new File("M:\\Screenshot\\greensjava.png");
		// FileUtils.copyFile(src, des);
		// driver.get("http://toolsqa.com/");
		// WebElement text = driver.findElement(By.xpath("//span[text()='Recent
		// Articles']"));
		// JavascriptExecutor js=(JavascriptExecutor)driver;
		// js.executeScript("arguments[0].scrollIntoView('true')", text);
		// TakesScreenshot ts=(TakesScreenshot)driver;
		// File src = ts.getScreenshotAs(OutputType.FILE);
		// File des=new File ("M:\\Screenshot\\toolssd.png");
		// FileUtils.copyFile(src, des);
		// driver.get("http://toolsqa.com/");
		// WebElement text = driver.findElement(By.xpath("//span[text()='Selenium
		// Training Benefit']"));
		// JavascriptExecutor js =(JavascriptExecutor)driver;
		// js.executeScript("arguments[0].scrollIntoView('true')", text);
		// String text2 = text.getText();
		// System.out.println(text2);
		// TakesScreenshot ts=(TakesScreenshot)driver;
		// File src = ts.getScreenshotAs(OutputType.FILE);
		// File des=new File ("M:\\Screenshot\\toolsytraining.png");
		// FileUtils.copyFile(src, des);

	}

}
