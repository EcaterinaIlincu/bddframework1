package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class InventoryPage {

    private final SelenideElement GalaxyPhone = $(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a"));
    private final SelenideElement addToCart = $(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a"));


    public void selectPhone() {
        GalaxyPhone.should(Condition.clickable).click();
    }

    public void AddPhoneToTheCart() {
        addToCart.should(Condition.clickable).click();
    }

}
