import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Next_page  {
    WebDriver driver ;
    By price = By.xpath("(//div[@class = \"inventory_item_price\"])[1]");
    By add_to_cart  = By.xpath("(//button[text()='Add to cart'])[1]");
    By drop_down_list = By.xpath("//option[text()=\"Price (high to low)\"]");
    public Next_page(WebDriver driver){
        this.driver = driver;
    }

    public void Drop_down(){
        WebElement element3 = driver.findElement(drop_down_list);
        element3.click();
    }

    public WebElement Add_to_cart(){
        WebElement element4 = driver.findElement(add_to_cart);
        return element4;

    }
    public float find_price(){
        WebElement element5 = driver.findElement(price);
        //element5.getText().replace("$","");
        float Price = Float.parseFloat(element5.getText().replace("$",""));
        return Price;
    }

}
