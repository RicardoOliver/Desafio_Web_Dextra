package pageObjects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Page {
    WebDriver driver;
    public Page(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//a[contains(text(),'Pesquisa – QA')]")
    WebElement pesquisaQa;

    @FindBy(id="nf-field-5")
    WebElement txtnome;

    @FindBy(id="nf-field-6")
    WebElement txtsobreNome;

    @FindBy(id="nf-field-7")
    WebElement txtemail;

    @FindBy(id="nf-field-8")
    WebElement txtconfirmaEmail;

    @FindBy(id="nf-field-17")
    WebElement txttelefone;

    @FindBy(id="nf-field-14")
    WebElement txtLinguagem;

    @FindBy(id="nf-field-15")
    WebElement txtplanoCarreira;

    @FindBy(id="nf-field-16")
    WebElement btnEviar;

    @FindBy(xpath = "//p[contains(text(),'Your form has been successfully submitted.')]")
    WebElement validarPesquisaSucesso;
}
