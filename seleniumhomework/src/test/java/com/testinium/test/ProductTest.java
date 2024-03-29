package com.testinium.test;

        import com.testinium.driver.BaseTest;
        import com.testinium.page.HomePage;
        import com.testinium.page.LoginPage;
        import com.testinium.page.ProductPage;
        import org.junit.Test;

public class ProductTest extends BaseTest {

    @Test
    public void productTest(){

        LoginPage loginPage = new LoginPage();

        loginPage.login();

        ProductPage productPage = new ProductPage();

        productPage.scrollAndSelect();
        productPage.addFourItemInFavourite();

        productPage.BackHome();
        productPage.Catalogue();
        productPage.YuksekOylama();
        productPage.TumKitaplarHobi();
        productPage.randomElement();
        productPage.ListelerimFavorilerim();
 //       productPage.Sepetim();
    }

}
