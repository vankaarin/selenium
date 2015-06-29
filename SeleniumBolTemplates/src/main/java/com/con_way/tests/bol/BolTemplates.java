package com.con_way.tests.bol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BolTemplates extends BaseBolTemplatesTest {
	private WebDriver driver;

	@Test
	public void testTemplates() throws Exception {

		logIn(driver,
				"https://tctsrw.con-way.com/webapp/bol_template_app/BolRequester.jsp");

		driver.findElement(By.linkText("Templates")).click();

		assertEquals("Bill Of Lading: Template Manager", driver.getTitle());

		selectInputRadio(driver, 1, "roleNew");

		driver.findElement(By.name("submitaction")).click();

		loadCreate();
		
		verifyCreate();

//		new Select(driver.findElement(By.name("template")))
//				.selectByVisibleText("test39");
//
//
//		List<WebElement> elements = driver.findElements(By
//				.partialLinkText("Modify"));
//		for (WebElement element : elements) {
//
//			String screen = element.getAttribute("href").split("=")[1];
//			switch (screen) {
//
//				case "shipper":
//					element.click();
//					verifyShipperInfo();
//					break;
//	
//				case "consignee":
//					element.click();
//					verifyConsigneeInfo();
//					break;
//	
//				case "billto":
//					break;
//	
//				case "customsbroker":
//					break;
//	
//				case "commodities":
//					break;
//	
//				case "codinformation":
//					break;
//	
//				case "referencenumbers":
//					break;
//	
//				case "pickuprequest":
//					break;
//	
//				default:
//					break;
//
//			}
//		}
//
	}

	private void verifyCreate() {
	      assertEquals("Bill Of Lading: Template Manager", driver.getTitle());
	      assertEquals("Changes have been saved to 'test40'", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[3]/td/b")).getText());
	      assertEquals("Con-way Freight, Inc...", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[2]/td/fieldset/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[2]")).getText());
	      assertEquals("Michelle Donato", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[2]/td/fieldset/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr[2]/td[2]")).getText());
	      assertEquals("2055 NW Savier St", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[2]/td/fieldset/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr[3]/td[2]")).getText());
	      assertEquals("Portland", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[2]/td/fieldset/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr[4]/td[2]")).getText());
	      assertEquals("OR", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[2]/td/fieldset/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr[5]/td[2]")).getText());
	      assertEquals("97209", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[2]/td/fieldset/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr[6]/td[2]")).getText());
	      assertEquals("(503)450-6054", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[2]/td/fieldset/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr[7]/td[2]")).getText());
	      assertEquals("yao.yi@con-way.com", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[2]/td/fieldset/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr[8]/td[2]")).getText());
	      assertEquals("consigneeCo", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[4]/td/fieldset/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[2]")).getText());
	      assertEquals("consigneeCareOf", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[4]/td/fieldset/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr[2]/td[2]")).getText());
	      assertEquals("12345 N 12th", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[4]/td/fieldset/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr[3]/td[2]")).getText());
	      assertEquals("Portland", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[4]/td/fieldset/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr[4]/td[2]")).getText());
	      assertEquals("OR", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[4]/td/fieldset/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr[5]/td[2]")).getText());
	      assertEquals("97212", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[4]/td/fieldset/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr[6]/td[2]")).getText());
	      assertEquals("(503)222-3434", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[4]/td/fieldset/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr[7]/td[2]")).getText());
	      assertEquals("billToCo", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[6]/td/fieldset/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr/td[2]")).getText());
	      assertEquals("billToCareOf", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[6]/td/fieldset/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr[2]/td[2]")).getText());
	      assertEquals("1234 S 13th", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[6]/td/fieldset/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr[3]/td[2]")).getText());
	      assertEquals("Portland", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[6]/td/fieldset/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr[4]/td[2]")).getText());
	      assertEquals("OR", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[6]/td/fieldset/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr[5]/td[2]")).getText());
	      assertEquals("97232", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[6]/td/fieldset/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr[6]/td[2]")).getText());
	      assertEquals("(503)555-6767", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[6]/td/fieldset/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr[7]/td[2]")).getText());
	      assertEquals("100", driver.findElement(By.cssSelector("tr.altbg > td.stdDisplayText")).getText());
	      assertEquals("800", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[10]/td/fieldset/table/tbody/tr/td/table/tbody/tr[2]/td[2]")).getText());
	      assertTrue(driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[10]/td/fieldset/table/tbody/tr/td/table/tbody/tr[2]/td[3]")).getText().matches("^exact:[\\s\\S]*my conway test$"));
	      assertEquals("N", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[10]/td/fieldset/table/tbody/tr/td/table/tbody/tr[2]/td[4]")).getText());
	      assertEquals("BAG", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[10]/td/fieldset/table/tbody/tr/td/table/tbody/tr[2]/td[5]")).getText());
	      assertEquals("12345-6", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[10]/td/fieldset/table/tbody/tr/td/table/tbody/tr[2]/td[6]")).getText());
	      assertEquals("92.5", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[10]/td/fieldset/table/tbody/tr/td/table/tbody/tr[2]/td[7]")).getText());
	      assertEquals("PREPAID", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[12]/td/fieldset/table/tbody/tr/td[2]/table/tbody/tr/td/table/tbody/tr[2]/td[2]")).getText());
	      assertEquals("PRO Type: Do not auto-assign a PRO number", driver.findElement(By.xpath("//div[@id='masTplAppContainer']/table/tbody/tr[6]/td/fieldset/table/tbody/tr[2]/td/table/tbody/tr[16]/td/fieldset/table/tbody/tr/td[2]/table/tbody/tr[2]/td")).getText());
	}

	private void verifyConsigneeInfo() {
		// TODO Auto-generated method stub
		
	}

	private void verifyShipperInfo() {
		// TODO Auto-generated method stub
		
	}

	private void loadCreate() {

		driver.findElement(By.name("company2")).clear();
		driver.findElement(By.name("company2")).sendKeys("consigneeCo");
		driver.findElement(By.name("name2")).clear();
		driver.findElement(By.name("name2")).sendKeys("consigneeCareOf");
		driver.findElement(By.name("address2")).clear();
		driver.findElement(By.name("address2")).sendKeys("12345 N 12th");
		driver.findElement(By.name("city2")).clear();
		driver.findElement(By.name("city2")).sendKeys("Portland");
		new Select(driver.findElement(By.name("statecountry2")))
				.selectByVisibleText("Oregon");
		driver.findElement(By.name("zip62")).clear();
		driver.findElement(By.name("zip62")).sendKeys("97212");
		driver.findElement(By.name("areacode2")).clear();
		driver.findElement(By.name("areacode2")).sendKeys("503");
		driver.findElement(By.name("phone2")).clear();
		driver.findElement(By.name("phone2")).sendKeys("2223434");
		driver.findElement(By.name("company3")).clear();
		driver.findElement(By.name("company3")).sendKeys("billToCo");
		driver.findElement(By.name("name3")).clear();
		driver.findElement(By.name("name3")).sendKeys("billToCareOf");
		driver.findElement(By.name("address3")).clear();
		driver.findElement(By.name("address3")).sendKeys("1234 S 13th");
		driver.findElement(By.name("city3")).clear();
		driver.findElement(By.name("city3")).sendKeys("Portland");
		new Select(driver.findElement(By.name("statecountry3")))
				.selectByVisibleText("Oregon");
		driver.findElement(By.name("zip63")).clear();
		driver.findElement(By.name("zip63")).sendKeys("97232");
		driver.findElement(By.name("areacode3")).clear();
		driver.findElement(By.name("areacode3")).sendKeys("503");
		driver.findElement(By.name("phone3")).clear();
		driver.findElement(By.name("phone3")).sendKeys("5556767");
		driver.findElement(By.name("pieces_1")).clear();
		driver.findElement(By.name("pieces_1")).sendKeys("100");
		driver.findElement(By.name("weight_1")).clear();
		driver.findElement(By.name("weight_1")).sendKeys("800");
		new Select(driver.findElement(By.name("commdescfromlist_1")))
				.selectByIndex(1);

		driver.findElement(By.name("submitaction")).click();
		assertEquals("Bill Of Lading: Create Template", driver.getTitle());
		driver.findElement(By.name("templatename")).clear();
		driver.findElement(By.name("templatename")).sendKeys("test40");
		driver.findElement(By.name("submitaction")).click();
		assertEquals("Bill Of Lading: Template Manager", driver.getTitle());

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		// String verificationErrorString = verificationErrors.toString();
		// if (!"".equals(verificationErrorString)) {
		// fail(verificationErrorString);
		// }
	}

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
