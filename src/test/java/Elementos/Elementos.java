package Elementos;

import org.openqa.selenium.By;



public class Elementos {

public By email = By.xpath("//input[@id='login-mail-input-email']");
public By senhaClicar = By.xpath("//input[@id='login-mail-input-password']");
//public By senhaDigitar = By.xpath("//label[@for='login-mail-input-password']");
public By btnLogar = By.xpath("//button[@id='login-mail-button-sign-in']");
public By esqcSenha = By.xpath("//a[@id='login-email-link-forgot-password']");
public By emialEsqcSenha = By.xpath("//input[@id='recover-password-input-email']");
public By btnEsqcSenha = By.xpath("//button[@id='recover-password-button-send']");
public By cookies = By.xpath("//button[@id='onetrust-reject-all-handler']");

public String url ="https://www.ze.delivery/conta/entrar";
public String dadosEmail = "bento_henrique_cardoso@bom.com.br";
public String dadosSenha = "DgfX4fO50b*";
public String validarMsgEmailIncompleto = "Eita, esse e-mail não parece correto";
public By ValidarEmailIncompleto = By.xpath("//p[text()='Eita, esse e-mail não parece correto']");
public String validarMsgEmailBranco = "O campo e-mail não pode ficar vazio";

public By faqAcessarConta = By.xpath("//a[@class='css-m6xmn6']");
public By btnInfoSim = By.xpath("//button[text()='Sim']");
public By btnInfoNao = By.xpath("//button[text()='Não']");

public By criarConta = By.xpath("//a[@id='create-account-link']");
public By nomeCadastro = By.xpath("//label[@for='signup-form-input-name']");
public By emailCadastro = By.xpath("//input[@id='signup-form-input-email']");
public By senhaCadastro = By.xpath("//input[@id='signup-form-input-password']");
public By cpfCadastro = By.xpath("//input[@id='signup-form-input-document']");
public By celCadastro = By.xpath("//label[@for='signup-form-input-phone']");
public By dataCadastro = By.xpath("//label[@for='signup-form-input-age']");
public By label1 = By.xpath("//input[@id='sign-up-form-input-terms']");
public By label2 = By.xpath("//input[@id='sign-up-form-input-marketing']");
public By btnCriarConta = By.xpath("//button[@id='signup-form-button-signup']");

public By alertMensagem = By.xpath("//section[@role='alert']");
public By alertValidarMsgNao = By.xpath("//p[@class='text text--normal css-1ry1tx8 css-jp8xm2']");
public By validarMsgEmailEmBranco = By.xpath("//p[@id='recover-password-input-email-error-message']");
public String validarMsgFaqNao = "Como podemos melhorar?";
public By ValidarMsgFaqNao = By.xpath("//p[text()='Como podemos melhorar?']");

public By validarMsgEndereco = By.xpath("//p[@class='css-1crxk2d']");
public String validarMsgOpsEndereco = "Ops, precisamos do seu endereço";
public By produtoEnergetico = By.xpath("//div[@id='featured-product-card-Energéticos']");
public String validarMsgPrdEnergetico = "Energéticos";
public By labelPrdEnergetico = By.xpath("//h1[@class='css-ixk8yh']");
public By produtoGelo = By.xpath("//div[@id='featured-product-card-Gelos']");
public String validarMsgPrdGelo = "Gelo";
public By labelPrdGelo = By.xpath("//h1[@class='css-ixk8yh']");
public By produtoAmendoin = By.xpath("//div[@id='featured-product-card-Amendoins']");
public By labelPrdPetiscos = By.xpath("//h1[@class='css-ixk8yh']");
public String validarMsgPrdPetiscos = "Petiscos";
public By btnMaior18AnosSim = By.xpath("//button[@id='age-gate-button-yes']");//antes de validar
public By btnMaior18AnosNao = By.xpath("//button[@id='age-gate-button-no']");
public By validarMsgPage404 = By.xpath("//p[@class='coh-paragraph ssa-instance-9e0ca749-8ee0-4614-96df-569076ca5b52 coh-ce-cpt_404-5ad775b5']");
public String validarMsgPage404text = "Ops, página não encontrada.";



/*
 * Bento Henrique Cardoso
cpf 552.805.618-78
rg 45.721.229-9
data nasc 21/08/1988
email: 
senha : DgfX4fO50b
cep 06471-003
rua Alameda Mar Egeu, 701
bairro: Alphaville Residencial Plus
fone: (11) 98426-4439

 */


}
