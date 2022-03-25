import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test_cases {

    static WebDriver driver = new ChromeDriver();
      Login_page login = new Login_page(driver);
    static String url = "https://www.saucedemo.com/";
     @BeforeTest
    public static void Setup()
    {   System.setProperty("webdriver.chrome.driver", "C:\\Users\\praparihar\\IdeaProjects\\Assignment 4_5\\chromedriver.exe");
        //Login_page login_page = new Login_page(driver);
        driver.get(url);
    }

    @Test(priority = 1)
    public void validate()
    {
        login.enter_username("performance_glitch_user");
        login.Enter_password("secret_sauce");
        login.click_on_login();

    }

    Next_page next_page = new Next_page(driver);
    @Test
    public void Check_cart_enabled()
    {
        next_page.Add_to_cart().isEnabled();

    }

    @Test(priority=2)
    public void most_expensive_product()
    {
        next_page.Drop_down();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(next_page.find_price());
        if (next_page.find_price()>100f){
            driver.quit();
        }
        next_page.Add_to_cart().click();
    }


}



