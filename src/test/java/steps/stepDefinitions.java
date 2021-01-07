package steps;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import funcionalidades.Funcionalidades;
import utils.Enum.Status;
import utils.NavegadorFabrica;
import utils.ReportExtentReports;
public class stepDefinitions {

    WebDriver driver;
    Funcionalidades func = new Funcionalidades();


    @Dado("que eu acesse a página da VV Test")
    public void que_tenha_acessado_a_tela_site() {
        try {
            func.acessarTela();
            ReportExtentReports.adicionarLog(Status.PASS,"Dado que eu acesse a página da VV Test", true);
        }
        catch(Throwable erro) {
            ReportExtentReports.adicionarLog(Status.FAIL,"Erro: " + erro, true);
        }
    }

    @E("acesse o menu  Pesquisa - QA")
    public void devo_clicar_no_link_de_programacao() {
        try {
            func.clicarMenuPesquisaQa();

            ReportExtentReports.adicionarLog(Status.PASS,"E acesse o menu  Pesquisa - QA", true);
        }
        catch(Throwable erro) {
            ReportExtentReports.adicionarLog(Status.FAIL,"Erro: " + erro, true);
        }
    }

    @Quando("eu preencher todos os campos obrigatórios {string} e {string} e {string} e {string} e {string} e {string} e {string}")
    public void selecionar_a_programacao_que_estiver_passando_na_hora(String nome,String SobreNome,
                                                                      String email,String confirmaEmail,
                                                                      String telefone,String liguagem,String plano) {
        try {
            func.preencherNome(nome);
            func.preencherSobreNome(SobreNome);
            func.preencherEmail(email);
            func.preencherConfirmarEmail(confirmaEmail);
            func.preencherTelefone(telefone);
            func.clickIdade();
            func.selectTempo();
            func.selectArea();
            func.radioPrecisaMelhorar();
            func.preencherLinguagem(liguagem);
            func.preencherPlanoCarreira(plano);
            func.btnEnviar();

            ReportExtentReports.adicionarLog(Status.PASS,"Quando eu preencher todos os campos obrigatórios"+nome+"e"+SobreNome+"e"+email+"e"+confirmaEmail+"e"+telefone+"e"+liguagem+"e"+plano, true);
        }
        catch(Throwable erro) {
            ReportExtentReports.adicionarLog(Status.FAIL,"Erro: " + erro, true);
        }
    }

    @Entao("deve ser direcionado para uma página de sucesso")
    public void validar_se_o_texto_e_a_hora_que_aparecem_na_programacao_e_o_mesmo_que_aparece_no_modal() {
        try {
            func.validarTextTela();
            ReportExtentReports.adicionarLog(Status.PASS,"Entao deve ser direcionado para uma página de sucesso", true);
        }
        catch(Throwable erro) {
            ReportExtentReports.adicionarLog(Status.FAIL,"Erro: " + erro, true);
        }
    }

    @Before
    public static void adicionarTesteNoReport(Scenario scenario) {
        String nomeTeste = scenario.getName();
        ReportExtentReports.adicionarTeste("SKY WEB", nomeTeste);
    }

    @After
    public static void finalizarTesteNoReport() {
        ReportExtentReports.finalizarTeste();
        NavegadorFabrica.fecharNavegador();
    }
}
