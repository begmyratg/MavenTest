package tests;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.TestBase;

public class WebTablesExample extends TestBase {

	public void login() {
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test" + Keys.ENTER);

	}

	@Test
	public void printWholeTable() {
		login();
		WebElement table = driver.findElement(By.id("ctl00_MainContent_orderGrid"));
		System.out.println(table.getText());
	}

	@Test
	public void printAllHeaders() {
		login();
		List<WebElement> headers = driver.findElements(By.xpath("//table [@ id='ctl00_MainContent_orderGrid']//th"));
		for (WebElement header : headers) {
			System.out.println(header.getText());
		}
	}

	@Test
	public void printRows() {
		login();
		List<WebElement> allRows = driver.findElements(By.xpath("//table [@ id='ctl00_MainContent_orderGrid']//tr"));
		System.out.println("Number of rows: " + allRows.size());
		for (WebElement row : allRows) {
			System.out.println(row.getText());
		}

		System.out.println("___________________________________________");
		// print 1 row
		System.out.println("printing row-" + 3);
		System.out.println(allRows.get(2).getText());
	}

	@Test
	public void printTableSize() {
		login();
		List<WebElement> allRows = driver.findElements(By.xpath("//table [@ id='ctl00_MainContent_orderGrid']//tr"));
		System.out.println("Number of rows : " + allRows.size());

		List<WebElement> allColumns = driver
				.findElements(By.xpath("//table [@ id='ctl00_MainContent_orderGrid']//tr[1]/th"));
		System.out.println("Number of columns : " + allColumns.size());

		int numberOfCells = allRows.size() * allColumns.size();
		System.out.println("All cells number: " + numberOfCells);

	}

	@Test
	public void printRow2() {
		login();
		WebElement row = driver.findElement(By.xpath("//table [@ id='ctl00_MainContent_orderGrid']/tbody/tr[2]"));
		System.out.println(row.getText());
	}

	@Test
	public void printAllCellsInOneRow() {
		login();
		List<WebElement> cells = driver
				.findElements(By.xpath("//table [@ id='ctl00_MainContent_orderGrid']/tbody/tr[4]/td"));
		for (WebElement header : cells) {
			System.out.println(header.getText());
		}
		// table [@ id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td[2]
	}

	@Test
	public void dimentinalList() {
		login();

		String[][] mda = new String[8][11];
		int inner = 2;
		int auter = 1;
		for (int i = 0; i <= 7; i++) {
			auter++;
			for (int j = 0; j <= 10; j++) {
				mda[i][j] = driver.findElement(By.xpath(
						"//table [@ id='ctl00_MainContent_orderGrid']/tbody/tr[" + auter + "]/td[" + inner + "] "))
						.getText();
				inner++;
			}
			inner = 2;
		}
		for (String[] strings : mda) {
			System.out.println(Arrays.toString(strings));
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println(mda[3][3]);
	}
	
	@Test
	public void allColumns() {
		login();
		List<WebElement> allNames = driver.findElements(By.xpath("//table [@ id='ctl00_MainContent_orderGrid']/tbody/tr/td[2]"));
		for (WebElement name:allNames) {
			System.out.println(name.getText());
		}
	}
	
	

}
