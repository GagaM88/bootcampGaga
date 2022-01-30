package DemoBlaze;
//da bi smo setovali projekat ovde ubacujemo samo one bazicne stvari

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.List;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wdwait;
    public Phones phonescategory;
    public Laptops laptopscategory;
    public Monitors monitorscategory;

    @BeforeClass
    public void setUP() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(15));
        phonescategory = new Phones(driver, wdwait);
        laptopscategory = new Laptops(driver, wdwait);
        monitorscategory = new Monitors(driver, wdwait);
    }

    public void clickCart() {
        driver.findElement(By.cssSelector(":nth-child(4) > .nav-link")).click();
    }

    public void clickHome() {
        driver.findElement(By.cssSelector(".active > .nav-link")).click();
    }

    public List<WebElement> getCartElements() {
        return driver.findElements(By.className("success"));
    }

    //metoda koja broji koliko ima elementa u carts-u, interira kroz svaki od tih elemenata i brise svaki proizvod iz korpe
    public void clearCart() throws InterruptedException {
        List<WebElement> cartElements = getCartElements();
        int listSize = cartElements.size();
            for (WebElement cartElement : cartElements) {
                List<WebElement> tabs = cartElement.findElements(By.tagName("td"));
                for (WebElement tab : tabs) {
                    if (tab.getText().equals("Delete")) {
                        for (int i = 0; i < listSize; i++) {
                        tab.findElement(By.tagName("a")).click();
                    }
                }
            }
        }
    }
    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}


