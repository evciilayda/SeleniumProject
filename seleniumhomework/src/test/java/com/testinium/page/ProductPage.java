package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import java.util.List;
import java.util.Random;

import static com.testinium.driver.BaseTest.driver;
import org.openqa.selenium.WebElement;

public class ProductPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);


    public ProductPage(){
        methods = new Methods();
    }

    public void scrollAndSelect(){
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("search-input"),"oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.waitBySeconds(2);
        methods.scrollWithAction(By.cssSelector("#product-577328"));
        methods.waitBySeconds(2);
    }
    public void addFourItemInFavourite(){
        methods.click(By.xpath("(//*[@class='fa fa-heart'])[5]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("(//*[@class='fa fa-heart'])[6]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("(//*[@class='fa fa-heart'])[7]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("(//*[@class='fa fa-heart'])[8]"));
        methods.waitBySeconds(2);
        }

    public void controlFavourite (){}
    public void BackHome(){

        methods.click(By.cssSelector(".logo-text>a>img"));
        methods.waitBySeconds(2);

    }
    public void Catalogue(){

        methods.click(By.xpath("//*[@class='lvl1catalog']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@title='Puan Kataloğundaki Türk Klasikleri']"));

    }
    public void YuksekOylama(){
        methods.selectByText(By.cssSelector(".sort>select"),"Yüksek Oylama");
        methods.waitBySeconds(5);
    }
    public void TumKitaplarHobi(){

        methods.hoverElement(By.xpath("(//*[contains(text(),\"Tüm Kitaplar\")])[3]"));
        methods.waitBySeconds(2);
        methods.findElement(By.xpath("//a[contains(@href, 'kategori/kitap-hobi/1_212.html')]")).click();
        methods.waitBySeconds(2);
    }
    public void randomElement() {

        List<WebElement> productElems = driver.findElements(By.cssSelector(".pr-img-link"));
        // get the len of productElems
        int maxProducts = productElems.size();
        // get random number
        Random random = new Random();
        int randomProduct = random.nextInt(maxProducts);
        // Select the list item
        productElems.get(randomProduct).click();
        methods.waitBySeconds(5);
        methods.findElement(By.xpath("//*[@id=\"button-cart\"]/span")).click();  //Sepete Ekle
        methods.waitBySeconds(5);
}
    public void ListelerimFavorilerim(){
        methods.hoverElement(By.xpath("//*[@class='menu top my-list']//li"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@class='menu top my-list']//li//li[1]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("(//*[@class='fa fa-heart-o'])[3]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"product-detail-favorite-product-div\"]/a/span"));
        methods.waitBySeconds(2);
    }
//    public void Sepetim(){
//        methods.click(By.xpath("//*[@id=\"cart-items\"]"));
//        methods.waitBySeconds(2);
//        methods.click(By.xpath("//*[@id=\"js-cart\"]"));
//        methods.waitBySeconds(2);
//        methods.click(By.xpath("//*[@class=\"fa fa-refresh green-icon\"]"));
//        methods.waitBySeconds(2);
//        methods.click(By.xpath("//*[@class='right']/a"));
//        methods.waitBySeconds(5);
//
//    }
}
