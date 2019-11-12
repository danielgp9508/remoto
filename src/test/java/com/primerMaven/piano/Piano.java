package com.primerMaven.piano;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Piano {
	
	WebDriver driver;
	String url = "https://teclado-pianovirtual.online/";
	//char notas
	int tiempo = 600; 
	int acumulador = 0;
	String cancion = "rrwertrewqww=qwewq=yttt=trr=qwewq=q==y=qw=ytrewq=";
	String nota="";
	
	@Test
	public void test() throws InterruptedException {
		WebElement nota1 = driver.findElement(By.xpath("//*[@id=\"octaveselector\"]/option[4]"));
		WebElement las3 = driver.findElement(By.xpath("//button[@id='klawisz58']"));
		WebElement fa3 = driver.findElement(By.xpath("//button[@id='klawisz53']"));
		WebElement re4 = driver.findElement(By.xpath("//button[@id='klawisz62']"));
		WebElement sol4 = driver.findElement(By.xpath("//button[@id='klawisz67']"));
		WebElement fa4 = driver.findElement(By.xpath("//button[@id='klawisz65']"));
		WebElement res4 = driver.findElement(By.xpath("//button[@id='klawisz63']"));
		WebElement las4 = driver.findElement(By.xpath("//button[@id='klawisz70']"));
		WebElement do4 = driver.findElement(By.xpath("//button[@id='klawisz72']"));
		WebElement re3 = driver.findElement(By.xpath("//button[@id='klawisz50']"));
		WebElement sol3 = driver.findElement(By.xpath("//button[@id='klawisz55']"));
		
		nota1.click();
		Thread.sleep(tiempo);
		las3.click();
		Thread.sleep(tiempo);
		fa3.click();
		Thread.sleep(tiempo);
		las3.click();
		Thread.sleep(tiempo);
		re4.click();
		Thread.sleep(tiempo);
		sol4.click();
		Thread.sleep(tiempo);
		fa4.click();
		Thread.sleep(tiempo);
		las3.click();
		Thread.sleep(tiempo);
		fa3.click();
		Thread.sleep(tiempo);
		las3.click();
		Thread.sleep(tiempo);
		re4.click();
		Thread.sleep(tiempo);
		sol4.click();
		Thread.sleep(tiempo);
		fa4.click();
		Thread.sleep(tiempo);
		//------------------
		re4.click();
		las3.click();
		Thread.sleep(tiempo);
		do4.click();
		Thread.sleep(tiempo);
		res4.click();
		fa3.click();
		Thread.sleep(tiempo);
		las3.click();
		Thread.sleep(tiempo);
		re3.click();
		Thread.sleep(tiempo);
		sol4.click();
		Thread.sleep(tiempo);
		fa4.click();
		Thread.sleep(tiempo);
		las4.click();
		Thread.sleep(tiempo);
		do4.click();
		sol3.click();
		Thread.sleep(tiempo);
		re4.click();
		re3.click();
		Thread.sleep(tiempo);
		re4.click();
		Thread.sleep(tiempo);
		sol3.click();
		Thread.sleep(tiempo);
		re3.click();
		Thread.sleep(tiempo);
		
		
		//button[@id='klawisz48']
		
		/*while(acumulador <= cancion.length()-1) {
			nota = String.valueOf(cancion.charAt(acumulador));
			if(cancion.charAt(acumulador) == '=' ) {
				nota1.sendKeys(Keys.TAB);
				Thread.sleep(tiempo);
				System.out.print(nota);
			}else {
				System.out.print(nota);
				nota1.sendKeys(nota);
				Thread.sleep(tiempo);
			}
			acumulador += 1;
		}*/		
	}
	
	@Before
	public void Before() {
	
		System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe ");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		WebElement nota1 = driver.findElement(By.xpath("/html")); 
		
           System.out.print(" :) JHINDY :) "); 
          
	}
	
	@After
	public void After() {
		

		System.out.println("Gasten algo en la maquina");

		System.out.println("jhindy es tremendo voltaje");

		System.out.println("Cristian es tremendo voltaje");

		
	}

}
