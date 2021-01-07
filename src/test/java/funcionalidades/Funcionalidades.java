package funcionalidades;
import org.openqa.selenium.WebDriver;
import utils.NavegadorFabrica;
import pageObjects.Object;
import utils.Enum.Navegador;
public class Funcionalidades {

    WebDriver driver;
    Object object;

    public void acessarTela() throws InterruptedException {
        NavegadorFabrica.configurarNavegador(Navegador.CHROME);
        driver = NavegadorFabrica.getDriver();
        NavegadorFabrica.maximizar();
        NavegadorFabrica.acessarPaginaWeb("https://bit.ly/3jOMrR9\n");
        object = new Object(driver);

    }

    public void clicarMenuPesquisaQa() throws InterruptedException{
       object.clickMenu();

    }
   public void preencherNome(String nome ) throws InterruptedException{
       object.preencherNome(nome);
    }

   public void preencherSobreNome(String sobreNome) throws InterruptedException {
       object.preencherSobreNome(sobreNome);
   }

    public void preencherEmail(String email) throws InterruptedException {
        object.preencherEmail(email);
    }

    public void preencherConfirmarEmail(String confirmaremail) throws InterruptedException {
        object.preencherConfirmarEmail(confirmaremail);
    }

    public void preencherTelefone(String telefone) throws InterruptedException {
        object.preencherTelefone(telefone);
    }

    public void preencherLinguagem (String liguagem) throws InterruptedException {
        object.preencherLinguagem(liguagem);
    }

    public void preencherPlanoCarreira (String textAreaPlano )throws InterruptedException {
        object.preencherPlanoDeCarreira(textAreaPlano);
    }

   public void clickIdade() throws InterruptedException {
       object.clickRadioIdade();
   }

   public void selectTempo() throws InterruptedException {
       object.selectTempoQA();
   }

   public void selectArea() throws InterruptedException {
       object.selectAtraiuArea();
   }

   public void radioPrecisaMelhorar() throws InterruptedException {
       object.radioPrecisarMelhorar();
   }

   public void btnEnviar() throws InterruptedException {
       object.clickBtnEnviar();
   }
   public void validarTextTela() throws InterruptedException {
        assert(object.validarMensagemSucesso());
    }
}
