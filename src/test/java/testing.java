import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testing {
    WebDriver _globalDriver;

    @BeforeTest
    public void setUp() {
        _globalDriver = new ChromeDriver();
        _globalDriver.get("https://www.saucedemo.com/");
    }

    @Test
    public void test1() {
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("standard_user");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys("secret_sauce");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
        String productsPage = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span")).getText();
        Assert.assertEquals(productsPage, "Products");
    }

    @Test
    public void test2() {
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("standard_use");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys("secret_sauc");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
        String loginFailed = _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[3]")).getText();
        Assert.assertEquals(loginFailed, "Epic sadface: Username and password do not match any user in this service");
    }

    @Test
    public void test3() {
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("standard_user");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys("secret_sauce");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")).click();
        String inCart = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div")).getText();
        Assert.assertEquals(inCart, "Sauce Labs Backpack");
    }

    @Test
    public void test4() {
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("standard_user");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys("secret_sauce");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")).click();
        String inCart = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/a/div")).getText();
        Assert.assertEquals(inCart, "Sauce Labs Backpack");
    }

    @Test
    public void test5() {
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("standard_user");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys("secret_sauce");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[1]")).sendKeys("2");
        String quantityInCart = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[1]")).getText();
        Assert.assertEquals(quantityInCart, "2");
    }

    @Test
    public void test6() {
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("standard_user");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys("secret_sauce");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/button[2]")).click();
        String checkoutButtonActive = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span")).getText();
        Assert.assertEquals(checkoutButtonActive, "Checkout: Your Information");
    }

    @Test
    public void test7() {
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("standard_user");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys("secret_sauce");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/button[1]")).click();
        String gotBack = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span")).getText();
        Assert.assertEquals(gotBack, "Products");
    }

    @Test
    public void test8() {
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("standard_user");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys("secret_sauce");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/button[2]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[1]/input")).sendKeys("Eulalija");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[2]/input")).sendKeys("Petroke");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[3]/input")).sendKeys("76152");

    }

    @Test
    public void test9() {
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("standard_user");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys("secret_sauce");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/button[2]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[1]/input")).sendKeys("Eulalija");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[2]/input")).sendKeys("Petroke");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[3]/input")).sendKeys("76152");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[2]/input")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[9]/button[2]")).click();
        String orderComplited = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/h2")).getText();
        Assert.assertEquals(orderComplited, "Thank you for your order!");
    }

    @Test
    public void test10() {
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("standard_user");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys("secret_sauce");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a/span")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/button[2]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[1]/input")).sendKeys("Eulalija");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[2]/input")).sendKeys("Petroke");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[3]/input")).sendKeys("76152");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[2]/button")).click();
        String orderCancelled = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[2]/span")).getText();
        Assert.assertEquals(orderCancelled, "Your Cart" );
    }

    @Test
    public void test12() {
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("standard_user");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys("secret_sauce");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/button[2]")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[1]/input")).sendKeys("Eulalija");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[2]/input")).sendKeys("Petroke");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[1]/div[3]/input")).sendKeys("76152");
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/form/div[2]/input")).click();
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[9]/button[2]")).click();
        String orderNotPurchased = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/h2")).getText();
        Assert.assertEquals(orderNotPurchased, "Your order is not completed, your cart is empty");
    }



    @Test
    public void testX() {
        _globalDriver.findElement(By.id("user-name")).sendKeys("standard_user");// user
        _globalDriver.findElement(By.id("password")).sendKeys("secret_sauce");// password
        _globalDriver.findElement(By.id("login-button")).click(); //login
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")).click();//add to cart
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/button")).click();//add to cart
        _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]")).click();
        _globalDriver.findElement(By.id("checkout")).click();// checkou
        _globalDriver.findElement(By.id("first-name")).sendKeys("vaida");//ckeckout
        _globalDriver.findElement(By.id("last-name")).sendKeys("ziustr");//pavarde
        _globalDriver.findElement(By.id("postal-code")).sendKeys("44172"); //pasto kodas
        _globalDriver.findElement(By.id("continue")).click();//testi pereinant oprie apmokejimo

        String price1 = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div")).getText().replace("$", "");
        String price2 = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[1]/div[4]/div[2]/div[2]/div")).getText().replace("$", "");
        double priceInPage = Double.parseDouble(price1) + Double.parseDouble(price2); //suma turiu uzrasyti.konvertuoju i double

        String priceInCart = _globalDriver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div[2]/div[6]")).getText().replace("Item total: $", "");

        Assert.assertEquals(Double.parseDouble(priceInCart), priceInPage);


    }
}
