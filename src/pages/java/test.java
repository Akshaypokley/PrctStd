import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.io.File;
import java.util.List;
import java.util.NoSuchElementException;

public class test {
   static WebDriver driver;
   static String Smessage;
    public static void main(String args []) throws Exception {
        LoginFunction("https://amit-uchekar.herokuapp.com/admin/login","admin@example.com","password");
       // Delete_UpdateFun("Delete Product","21");
        ErrorFunn("chek_crtprofun");
    }

    static void LoginFunction(String Url,String LoginNm,String Pass) {
        System.setProperty("webdriver.chrome.driver","src/pages/chromedriver.exe");
        driver=new ChromeDriver();

        driver.get(Url);
        driver.findElement(By.id("admin_user_email")).sendKeys(LoginNm);
        driver.findElement(By.id("admin_user_password")).sendKeys(Pass);
        driver.findElement(By.xpath("//*[@id='admin_user_submit_action']/input")).click();


    }
    public static void takeSnapShot(WebDriver driver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

        File DestFile=new File(fileWithPath);
    }



    static void ErrorFunn(String funNm) throws Exception {
        switch(funNm){
            case "chek_crtprofun":
                driver.findElement(By.xpath("//*[@id='products']/a")).click();
                driver.findElement(By.xpath("//*[@id=\"titlebar_right\"]/div/span/a")).click();
                driver.findElement(By.xpath("//*[@id=\"product_submit_action\"]/input")).click();
                /*try {
                    WebElement success_Mess = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[3]/div"));
                     Smessage = success_Mess.getText();
                }catch (NoSuchElementException e)
                {
                    System.out.println(e.getMessage());
                }

                if(Smessage.equals("Product was successfully created."))
                {
                    System.out.println("Product was successfully created.");
                }else {*/
                    WebElement success_Mess2=   driver.findElement(By.xpath("//*[@id=\"product_title_input\"]/p"));
                    String blkmessage=success_Mess2.getText();
                    if(blkmessage.equals("Please enter Title")&& blkmessage.equals("Please enter sku")&& blkmessage.equals("Please enter Description"))
                    {

                        System.out.println("Test Case Pass");
                    }else {
                        System.out.println("Faile");
                        takeSnapShot(driver,"F:\\IDEPROJECTS\\PrctStd\\errorSns\\faile.png");
                    }

                break;

        }



    }
    static void CreateproFun()
    {
        driver.findElement(By.id("")).click();

        WebElement Tile =driver.findElement(By.id(""));
        Tile.sendKeys("");
        WebElement sku =driver.findElement(By.id(""));
        sku.sendKeys("");
        WebElement Des =driver.findElement(By.id(""));
        Des.sendKeys("");

        driver.findElement(By.xpath("")).click();
    }

    static void Delete_UpdateFun(String funcNam,String uerInput) throws InterruptedException {
        switch (funcNam){
            case "Delete Product":
                driver.findElement(By.xpath("//*[@id='products']/a")).click();
                List<WebElement> listing1=driver.findElements(By.xpath("//*[@id='index_table_products']/tbody/tr/td[2]"));
                for (WebElement list1:listing1)
                {
                    String ActualProId=list1.getText();
                    if(ActualProId.equals(uerInput)) {
                        driver.findElement(By.xpath("//*[@id='product_" + uerInput + "']/td[8]/div/a[3]")).click();
                        Thread.sleep(2315);
                        if ((ExpectedConditions.alertIsPresent()) == null) {
                            System.out.println("alert was not present");
                        } else {
                            Alert alert = driver.switchTo().alert();
                            alert.accept();

                        }
                        break;
                    }
                    }

            case "Update Product":
                driver.findElement(By.xpath("//*[@id='products']/a")).click();
                List<WebElement> listing=driver.findElements(By.xpath("//*[@id='index_table_products']/tbody/tr/td[2]"));
                for (WebElement list:listing)
                {
                    String ActualProId=list.getText();
                    if(ActualProId.equals(uerInput)) {
                        driver.findElement(By.xpath("//*[@id='product_"+uerInput+"']/td[8]/div/a[2]")).click();

                        WebElement Tile = driver.findElement(By.id("product_title"));
                        Tile.clear();
                        Tile.sendKeys("JHSKJS");
                        WebElement sku = driver.findElement(By.id("product_sku"));
                        sku.clear();
                        sku.sendKeys("KSKJ");
                        WebElement Des = driver.findElement(By.id("product_description"));
                        Des.clear();
                        Des.sendKeys("KSG");

                        driver.findElement(By.xpath("//*[@id='product_submit_action']/input")).click();
                        break;
                    }

                }
                default:
                break;
        }
    }
}
