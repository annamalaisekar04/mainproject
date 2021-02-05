package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Java {
private static WebElement findElement;

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sekarvijaya\\Man\\NewSample\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demo.guru99.com/test/drag_drop.html");
Actions a= new Actions(driver);
 WebElement src = driver.findElement(By.xpath("//*[@class='block14 ui-draggable']"));
 WebElement des = driver.findElement(By.id("bank"));
  a.dragAndDrop(src, des).perform();
  WebElement src1 = driver.findElement(By.xpath("//*[text()=' 5000 ']"));
  WebElement des1 = driver.findElement(By.xpath("(//*[@class='placeholder'])[2]"));
  Actions a1= new Actions(driver);
  a1.dragAndDrop(src1, src1);



}
}
