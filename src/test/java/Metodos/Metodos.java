package Metodos;



import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Elementos.Elementos;

public class Metodos {

	WebDriver driver;
	Elementos el = new Elementos();

	public void abrirNavegador() throws InterruptedException {
		String url = "https://www.ze.delivery/conta/entrar";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(el.cookies).click();
	}

	public void fecharNavegador() {
		driver.quit();

	}

	public void faqAcessarConta() throws Exception {

		driver.findElement(el.esqcSenha).click();
		Thread.sleep(2000);
		driver.findElement(el.faqAcessarConta).click();
		Thread.sleep(5000);
	}

	public void scrool() throws InterruptedException {
		JavascriptExecutor scr = (JavascriptExecutor) driver;
		scr.executeScript("window.scrollBy(0,800)", "");
		Thread.sleep(2000);
	}

	public void clickSim() throws Exception {
		Thread.sleep(2000);
		driver.findElement(el.btnInfoSim).click();

	}

	public void preencherLogin() throws InterruptedException {

		driver.findElement(el.email).click();
		driver.findElement(el.email).sendKeys(el.dadosEmail);
		driver.findElement(el.senhaClicar).click();
		Thread.sleep(1000);
		driver.findElement(el.senhaClicar).sendKeys(el.dadosSenha);
		driver.findElement(el.btnLogar).click();

	}

	public void esqueciSenhaDadosValidos() throws Exception {
		driver.findElement(el.esqcSenha).click();
		Thread.sleep(2000);
		driver.findElement(el.emialEsqcSenha).click();
		driver.findElement(el.emialEsqcSenha).sendKeys(el.dadosEmail);
		driver.findElement(el.btnEsqcSenha).click();

	}

	public void esqueciSenhaDadosInvalidos() throws Exception {
		driver.findElement(el.esqcSenha).click();
		Thread.sleep(2000);
		driver.findElement(el.emialEsqcSenha).click();
		driver.findElement(el.emialEsqcSenha).sendKeys("edcarlos20#hotmail.com");
		driver.findElement(el.btnEsqcSenha).click();

	}

	public void esqueciSenhaDadosEmBranco() throws Exception {
		driver.findElement(el.esqcSenha).click();
		Thread.sleep(2000);
		driver.findElement(el.emialEsqcSenha).click();
		driver.findElement(el.emialEsqcSenha).sendKeys(" ");
		driver.findElement(el.btnEsqcSenha).click();
		Thread.sleep(3000);

	}

	public void zoom50() {

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("document.body.style.zoom = '0.5'");
	}

	public void screenShot(String nome) throws IOException {
		TakesScreenshot screenShot = ((TakesScreenshot) driver);
		File screenFile = screenShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(screenFile, destFile);
	}

	public void testarPage() {
		String url = "https://faq-consumidor-zedelivery.sprinklr.com/articles/conta-e-privacidade/no-estou-conseguindo-acessar-minha-conta/621889ac3df9251d7ed0da19";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();

	}

	public void validarTexto(By elemento, String Mensagem) throws InterruptedException {
		String textoEsperado = driver.findElement(elemento).getText();
		Thread.sleep(2000);
		assertEquals(textoEsperado, Mensagem);

	}

	public void clickNao() {
		driver.findElement(el.btnInfoNao).click();

	}

	public void clicarProdutoSim(By elemento1, By elemento2, By elemento3) throws InterruptedException {

		driver.findElement(elemento1).click();
		Thread.sleep(2000);
		driver.findElement(elemento2).click();
		Thread.sleep(2000);
		driver.findElement(elemento3).click();
		Thread.sleep(2000);

	}

	public void clicarProdutoNao() throws InterruptedException {

		driver.findElement(el.produtoEnergetico).click();
		Thread.sleep(2000);
		driver.findElement(el.btnMaior18AnosNao).click();
		Thread.sleep(6000);
	}

	public void poupUp() {

		String novaJanela = driver.getWindowHandle();
		Set<String> janelas = driver.getWindowHandles();
		Iterator<String> iterator = janelas.iterator();
		while (iterator.hasNext()) {
			String janelaFilha = iterator.next();
			if(!novaJanela.equalsIgnoreCase(janelaFilha)) {
				driver.switchTo().window(janelaFilha);
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
				 wait.until(ExpectedConditions.invisibilityOfElementLocated(el.validarMsgPage404));
				 WebElement text = driver.findElement(el.validarMsgPage404);
				 String msgCapturada = text.getText();
				 assertEquals(el.validarMsgPage404text, msgCapturada);
				 System.out.println("Mensagem capturada com sucesso:  "+ msgCapturada);
				 System.out.println("passou no poupUp");
				
			}

		}

	}

	public void abrirPageProduto() throws InterruptedException {
		String urlPage = "https://www.ze.delivery/";
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(urlPage);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(el.cookies).click();

	}

}

