package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Object extends Page{
    public Object(WebDriver driver) {
        super(driver);
    }

    public void clickMenu() throws InterruptedException {
        Thread.sleep(3000);
        pesquisaQa.click();
    }
    public void preencherNome(String nome) throws InterruptedException {
        Thread.sleep(3000);
        txtnome.sendKeys(nome);
    }

    public void preencherSobreNome(String sobreNome) throws InterruptedException {
        Thread.sleep(3000);
        txtsobreNome.sendKeys(sobreNome);
    }

    public void preencherEmail(String email) throws InterruptedException {
        Thread.sleep(3000);
        txtemail.sendKeys(email);
    }

    public void preencherConfirmarEmail(String confirmaEmail) throws InterruptedException {
        Thread.sleep(3000);
        txtconfirmaEmail.sendKeys(confirmaEmail);
    }

    public void preencherTelefone(String telefone) throws InterruptedException {
        Thread.sleep(3000);
        txttelefone.sendKeys(telefone);
    }

    public void clickRadioIdade() throws InterruptedException {
        Thread.sleep(3000);
        WebElement radioEle = driver.findElement(By.id("nf-label-class-field-10-1"));
        boolean select = radioEle.isSelected();
        System.out.print(select);
        if (select == false) {
            radioEle.click();
        }
    }

    public void selectTempoQA() throws InterruptedException {
        Thread.sleep(3000);
        Select tempo = new Select(driver.findElement(By.id("nf-field-11")));
        tempo.selectByVisibleText("Menos de 5 anos");
        tempo.selectByValue("menos-de-5-anos");
    }

    public void selectAtraiuArea() throws InterruptedException {
        Thread.sleep(3000);
        Select area = new Select(driver.findElement(By.id("nf-field-12")));
        area.selectByVisibleText("Desafio");
        area.selectByValue("desafio");
    }

    public void radioPrecisarMelhorar() throws InterruptedException {
        Thread.sleep(3000);
        WebElement radioEle = driver.findElement(By.xpath("//label[@id='nf-label-class-field-13-3']"));
        boolean select = radioEle.isSelected();
        System.out.print(select);
        if (select == false) {
            radioEle.click();
        }
     }

    public void preencherLinguagem(String linguagem) throws InterruptedException {
        Thread.sleep(3000);
        txtLinguagem.sendKeys(linguagem);
    }

    public void preencherPlanoDeCarreira(String carreira) {
        txtplanoCarreira.sendKeys(carreira);
    }

    public void clickBtnEnviar() throws InterruptedException {

        Thread.sleep(3000);
        btnEviar.click();
    }
    public Boolean validarMensagemSucesso() throws InterruptedException {
        Thread.sleep(3000);
        return  validarPesquisaSucesso.isDisplayed();
    }
}
