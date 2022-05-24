package com.infoTech.tests;

import com.infoTech.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KlavyeTuslari extends TestBase {

    @Test
    public void asagiYukari() throws InterruptedException {
        driver.get("https://amazon.com");
        Actions actions=new Actions(driver);
        //Asagi inmek istiyorsak

        Thread.sleep(2000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        //yeterli gelmezse bir daha yazilabilir
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        //sayfanin en asagisina gitmek istiyorsaniz
        actions.sendKeys(Keys.END).perform();
        Thread.sleep(2000);
        //yukariya dogru gitmek isterseniz
        actions.sendKeys(Keys.PAGE_UP).perform();
        //saga gitmek isterseniz
        actions.sendKeys(Keys.ARROW_RIGHT).perform();
        //sola gitmek icin
        actions.sendKeys(Keys.ARROW_LEFT).perform();
    }

    @Test
    public void kucukBuyukYazma() throws InterruptedException {
        driver.get("http://google.com");
        //google guvenlik duvari
        WebElement guvenlikDuvari= driver.findElement(By.xpath("//*[.='Ik ga akkoord']"));
        Thread.sleep(3000);
        guvenlikDuvari.click();

        WebElement arama= driver.findElement(By.name("q"));

        Actions actions=new Actions(driver);
        Thread.sleep(3000);
        //Mause'ile arama kutusuna tikladim
        actions.moveToElement(arama).click()
                .keyDown(Keys.SHIFT).sendKeys("meRhabA")  //shift tusuna bastim ve yazimi gonderdim
                .keyDown(Keys.SHIFT).sendKeys("  nasilsiniz") //shift tusundan elimi kaldirdim ve yazimi gonderdim
                .perform();

    }

}
