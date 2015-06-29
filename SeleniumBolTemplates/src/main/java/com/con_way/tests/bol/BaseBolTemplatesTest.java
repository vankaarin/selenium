package com.con_way.tests.bol;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseBolTemplatesTest {

	void selectInputRadio(WebDriver driver, int option, String name) {
		List<WebElement> radios = driver.findElements(By.name(name));
		if (option > 0 && option <= radios.size()) {
			radios.get(option - 1).click();
		} else {
			throw new NotFoundException("option " + option + " not found");
		}
	}

	void selectInputOption(WebDriver driver, int option, String name) {
		List<WebElement> options = driver.findElements(By.name(name));
		if (option > 0 && option <= options.size()) {
			options.get(option - 1).click();
		} else {
			throw new NotFoundException("option " + option + " not found");
		}
	}

	void logIn(WebDriver driver, String url) {

		driver.get(url);
		driver.findElement(By.name("j_username")).clear();
		driver.findElement(By.name("j_username")).sendKeys("mdonato");
		driver.findElement(By.name("j_password")).clear();
		driver.findElement(By.name("j_password")).sendKeys("testcat2");
		driver.findElement(By.name("action")).click();
	}

}
