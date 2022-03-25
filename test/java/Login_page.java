import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

    WebDriver driver;
    By username = By.xpath("//input[@id='user-name']");
    By password  = By.xpath("//*[@id='password']");
    By Login_click = By.xpath("//*[@id='login-button']");
    String Username ="Hii";

    public Login_page(WebDriver driver){
        this.driver  = driver;
    }

    public void enter_username(String Username1)
    {
        WebElement element1 = driver.findElement(username);
        element1.sendKeys(Username1);
    }

    public void Enter_password(String Pass)
    {
        WebElement element2 = driver.findElement(password);
        element2.sendKeys(Pass);
    }


    public void click_on_login()
    {
        WebElement element3  = driver.findElement(Login_click);
        element3.click();
    }


}

