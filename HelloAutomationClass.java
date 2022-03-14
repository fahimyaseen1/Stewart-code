package helloAutomation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HelloAutomationClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.print("aaaaa");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://qa1-access-ia.stewart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Email"));
		WebElement username = driver.findElement(By.id("Email"));
		username.clear();
		username.sendKeys("TPSTESTER1");


		driver.findElement(By.id("Password"));
		WebElement password = driver.findElement(By.id("Password"));
		password.clear();
		password.sendKeys("p@ssw0rd");

//		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/form/div[3]/div/input")).click();

				Thread.sleep(8000);

		

		driver.findElement(By.xpath(".//div[1]//div/div[2]//ul[1]/li[5]/a[@href='/PostPolicyEndorsement/Detail']")).click();
		Thread.sleep(8000);

		driver.findElement(By.xpath("//*[@id=\"txtFileNumber\"]")).sendKeys("EPQA-0.6239711356804821");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@id=\"IssuingAgency\"]/option[4]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"btnSearchOrginalJacket\"]")).click();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("//*[@id=\"txtOPN\"]")).sendKeys("Test");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"ddlState\"]/option[52]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"txtLiability\"]")).sendKeys("1500");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"ddlFormType\"]/option[4]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"ddlUnderwriter\"]/option[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"btnOpenAssociatePropertyWindow\"]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"chkAssociateProperty\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"btnAssociatePropertySave\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"gridProperties\"]/div[3]/table/tbody/tr/td[1]/a[1]/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"gridProperties\"]/div[3]/table/tbody/tr/td[1]/a[2]/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"gridProperties\"]/div[3]/table/tbody/tr/td[1]/a[2]/button")).click();
		Thread.sleep(2000);
		
		
		
		
		driver.findElement(By.xpath(".//div[1]//div/div[2]//ul[1]/li[4]/a[@href='/Jacket/Detail']")).click();
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//*[@id=\"txtFileNumber\"]")).sendKeys("EPQA-0.6239711356804821");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"txtDate\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[4]/a")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"IssuingAgencyLocation\"]/option[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"LiabilityAmt\"]")).sendKeys("1500");
		Thread.sleep(2000);

//		driver.findElement(By.xpath("//*[@id=\"IssuingAgency\"]/option[4]")).click();
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"FormType\"]/option[4]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"Form\"]/option[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"ddlState\"]/option[44]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"TransactionType\"]/option[4]")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id=\"btnOpenAssociatePropertyWindow\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"chkAssociateProperty\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"btnAssociatePropertySave\"]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"gridProperties\"]/div[3]/table/tbody/tr/td[1]/a[1]/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"gridProperties\"]/div[3]/table/tbody/tr/td[1]/a[2]/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"gridProperties\"]/div[3]/table/tbody/tr/td[1]/a[2]/button")).click();
		Thread.sleep(2000);
		
		

	}

}
