package org.sample;


	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Sample {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sekarvijaya\\Mani\\Mani\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://infinity.icicibank.com");
		//WebElement btnok = driver.findElement(By.xpath("//*[@href='#OKTab']"));
			//btnok.click();
			//WebElement btnclck = driver.findElement(By.xpath("//*[@class='btn btn-danger']"));
			//btnclck.click();
			//Alert all= driver.switchTo().alert();
			//all.accept();
//			 WebElement btnclc = driver.findElement(By.xpath("(//*[@data-toggle='tab'])[2]"));
//			 btnclc.click();
//			 WebElement btncan = driver.findElement(By.xpath("//*[@class='btn btn-primary']"));
//			 btncan.click();
//			 Alert al =driver.switchTo().alert();
//			 al.dismiss();
//			WebElement btnclc = driver.findElement(By.xpath("(//*[@data-toggle='tab'])[3]"));
//			btnclc.click();
//			WebElement btnon = driver.findElement(By.xpath("//*[@class='btn btn-info']"));
//			btnon.click();		
//		Alert all= driver.switchTo().alert();
//			all.sendKeys("mani");
//			all.accept();
//			
			
//			WebElement btnlog = driver.findElement(By.xpath("//*[@type='submit']"));
//			btnlog.click();
//			Alert all= driver.switchTo().alert();
//			String text = all.getText();
//			System.out.println(text);
//			all.accept();
//			WebElement btncon = driver.findElement(By.xpath("(//a[@href='javascript:void(0);'])[3]"));
//			btncon.click();
//			WebElement btn = driver.findElement(By.xpath("(//*[@class='btn btn-default'])[1]"));
//			btn.click();
//			Alert all=driver.switchTo().alert();
//			all.accept();
//			
//			WebElement login = driver.findElement(By.id("DUMMY1"));
//			login.sendKeys("hello");
//			login.click();
//			WebElement clc = driver.findElement(By.xpath("(//input[@type='password'])[4]"));
//			clc.sendKeys("123");
//			WebElement btn = driver.findElement(By.xpath("(//input[@type='Submit'])[1]"));
//			btn.click();
//			
//			Alert acc = driver.switchTo().alert();
//			acc.accept();
//			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
	
}

