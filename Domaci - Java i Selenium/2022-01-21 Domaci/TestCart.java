package DemoBlaze;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestCart extends BasePage {

    @BeforeMethod
    public void setUpPage() {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.demoblaze.com/index.html");
    }

    @Test
    public void getPhonesElements() throws InterruptedException {
        phonescategory.clickPhones();
        Thread.sleep(1000);
        List<WebElement> elementsFromPhoneCategory = phonescategory.getCategoryElements();


        int fullPrice = 0;
        System.out.println(phonescategory.getCategoryName());
        int item = 1;
        for (WebElement phone : elementsFromPhoneCategory) {
            System.out.println("Item " + item + ":");
            String[] parts = phone.getText().split("\n");
            System.out.println("  Title: " + parts[0]);
            System.out.println("  Description: " + parts[2]);
            System.out.println("  Price: " + parts[1]);

            int price = Integer.valueOf(parts[1].substring(1));
            fullPrice = fullPrice + price;
            item++;
        }

        System.out.println("Total items from " + phonescategory.getCategoryName() + " = " + elementsFromPhoneCategory.size());
        System.out.println("The total price of all products from " + phonescategory.getCategoryName() + " = " + fullPrice + "$");
    }

        @Test
        public void getLaptopElements() throws InterruptedException {
            laptopscategory.clickLaptops();
            Thread.sleep(1000);
            List<WebElement> elementsFromLaptopsCategory = laptopscategory.getCategoryElements();

            int fullPrice2 = 0;
            System.out.println(laptopscategory.getCategoryName());
            int item2 = 1;
            for(WebElement laptop : elementsFromLaptopsCategory) {
                System.out.println("Item " + item2 + ":");
                String[] parts = laptop.getText().split("\n");
                System.out.println("  Title: " + parts[0]);
                System.out.println("  Description: " + parts[2]);
                System.out.println("  Price: " + parts[1]);

                int price2 = Integer.valueOf(parts[1].substring(1));
                fullPrice2 = fullPrice2 + price2;
                item2++;
            }
            System.out.println("Total items from " + laptopscategory.getCategoryName() + " = " + elementsFromLaptopsCategory.size());
            System.out.println("The total price of all products from " + laptopscategory.getCategoryName() + " = " + fullPrice2 + "$");
        }

        @Test
        public void getMonitorElements() throws InterruptedException {
            monitorscategory.clickMonitors();
            Thread.sleep(1000);
            List<WebElement> elementsFromMonitorsCategory = monitorscategory.getCategoryElements();

            int fullPrice3 = 0;
            System.out.println(monitorscategory.getCategoryName());
            int item3 = 1;
            for (WebElement monitor : elementsFromMonitorsCategory) {
                System.out.println("Item " + item3 + ":");
                String[] parts = monitor.getText().split("\n");
                System.out.println("  Title: " + parts[0]);
                System.out.println("  Description: " + parts[2]);
                System.out.println("  Price: " + parts[1]);

                int price3 = Integer.valueOf(parts[1].substring(1));
                fullPrice3 = fullPrice3 + item3;
                item3++;
            }
            System.out.println("Total items from " + monitorscategory.getCategoryName() + " = " + elementsFromMonitorsCategory.size());
            System.out.println("The total price of all products from " + monitorscategory.getCategoryName() + " = " + fullPrice3 + "$");
        }


    @Test
    public void addThreePhonesToCart() throws InterruptedException {
        Thread.sleep(1000);
        phonescategory.clickSamsungS6();
        Thread.sleep(1000);
        phonescategory.clickAddToCart();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        clickHome();
        Thread.sleep(1000);
        phonescategory.clickNexus6();
        Thread.sleep(1000);
        phonescategory.clickAddToCart();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        clickHome();
        Thread.sleep(1000);
        phonescategory.clickSamsungS7();
        Thread.sleep(1000);
        phonescategory.clickAddToCart();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        clickCart();
        Thread.sleep(1000);
        int expectedResult = 3;
        Assert.assertEquals(getCartElements().size(), expectedResult );
        Thread.sleep(1000);
        clearCart();


    }
 @Test
    public void addThreeDifferentItems1() throws InterruptedException{
        Thread.sleep(1000);
        laptopscategory.clickLaptops();
        Thread.sleep(1000);
        laptopscategory.clickSonyVaioI5();
        Thread.sleep(1000);
     laptopscategory.clickAddToCart();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        clickHome();
        laptopscategory.clickLaptops();
        Thread.sleep(1000);
        laptopscategory.clickMacBookAir();
        Thread.sleep(1000);
        laptopscategory.clickAddToCart();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        clickHome();
        monitorscategory.clickMonitors();
        Thread.sleep(1000);
        monitorscategory.clickAssusFullHd();
        Thread.sleep(1000);
        monitorscategory.clickAddToCart();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        clickCart();
        Thread.sleep(1000);
        int expectedResult = 3;
        Assert.assertEquals(getCartElements().size(), expectedResult);
         Thread.sleep(1000);
         clearCart();
    }

    @Test
    public void addThreeDifferentItems2() throws InterruptedException {
        Thread.sleep(1000);
        phonescategory.clickPhones();
        Thread.sleep(1000);
        phonescategory.clickSamsungS6();
        Thread.sleep(1000);
        phonescategory.clickAddToCart();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        clickHome();
        laptopscategory.clickLaptops();
        Thread.sleep(1000);
        laptopscategory.clickMacBookAir();
        Thread.sleep(1000);
        laptopscategory.clickAddToCart();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        clickHome();
        monitorscategory.clickMonitors();
        Thread.sleep(1000);
        monitorscategory.clickAssusFullHd();
        Thread.sleep(1000);
        monitorscategory.clickAddToCart();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        clickCart();
        Thread.sleep(1000);
        int expectedResult = 3;
        Assert.assertEquals(getCartElements().size(), expectedResult);
        Thread.sleep(1000);
        clearCart();

    }


}
