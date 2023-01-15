import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HRM {

    public static WebDriver driver;
    static String BaseURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @BeforeTest
    public static void WebSetup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ibos\\Desktop\\Test Environment\\Environment Softwares\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get((BaseURL));
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }

    @Test(priority = 0)
    public static void OrangeLogin() throws Exception {
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Admin");
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("admin123");
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Thread.sleep(1000L);
        //Assert.assertTrue(driver.getPageSource().contains("Dashboard"));
        //Assert.assertEquals(driver.findElement(By.xpath("//h6[contains(text(),'Dashboard')]")).getText(),"Dashboard");
    }

    @Test(priority = 1)
    public static void CreateEmployee() throws Exception {
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]/span[1]")).click();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//a[contains(text(),'Add Employee')]")).click();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Thread.sleep(1000L);

        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("Avishek");
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]")).sendKeys("Bhowmik");
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/label[1]/span[1]")).click();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Thread.sleep(1000L);

        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("avishek71");
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Bhowmik@123");
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/div[2]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("Bhowmik@123");
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/button[2]")).click();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Thread.sleep(1000L);
        //Assert.assertTrue(driver.getPageSource().contains("Avishek"));
        //Assert.assertEquals(driver.findElement(By.xpath("//h6[contains(text(),'Dashboard')]")).getText(),"Avishek");
        //Assert.assertTrue(driver.getPageSource().contains("Personal Details"));
    }

    @Test(priority = 2)
    public static void SearchEmployee() throws Exception {

        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Avishek");
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/button[2]")).click();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        Thread.sleep(1000L);
        //Assert.assertTrue(driver.getPageSource().contains("Record Found"));

    }

}



