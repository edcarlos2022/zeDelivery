package Executa;

import java.io.IOException;

import org.junit.Test;

import Elementos.Elementos;
import Metodos.Metodos;

public class Executa {

	Metodos metodos = new Metodos();
	Elementos el = new Elementos();

	@Test
	public void Ct06logar() throws Exception {
		metodos.abrirNavegador();
		metodos.preencherLogin();
		metodos.screenShot("Evidencia Logando");
		metodos.fecharNavegador();
		

	}

	@Test
	public void Ct01esqueciSenhaDadosValidos() throws Exception {
		metodos.abrirNavegador();
		metodos.esqueciSenhaDadosValidos();
		metodos.screenShot("Esqueci Senha dados Validos");
		metodos.fecharNavegador();

	}

	@Test
	public void Ct02esqueciSenhaDadosInvalidos() throws Exception {
		metodos.abrirNavegador();
		metodos.esqueciSenhaDadosInvalidos();
		metodos.screenShot("Esqueci Senha dados Invalidos");
		metodos.fecharNavegador();

	}

	@Test
	public void Ct03esqueciSenhaDadoEmBranco() throws Exception {
		metodos.abrirNavegador();
		metodos.esqueciSenhaDadosEmBranco();
		metodos.screenShot("Esqueci Senha em Branco");
		metodos.fecharNavegador();

	}

	@Test
	public void Ct04naoConsigoAcessarMinhaContaClickSim() throws Throwable {
		metodos.testarPage();
		metodos.scrool();
		metodos.clickSim();
		Thread.sleep(3000);
		metodos.fecharNavegador();

	}

	@Test
	public void Ct05naoConsigoAcessarMinhaContaClickNao() throws Throwable {
		metodos.testarPage();
		metodos.scrool();
		metodos.clickNao();
		Thread.sleep(3000);
		metodos.validarTexto(el.ValidarMsgFaqNao, el.validarMsgFaqNao);
		System.out.println("Mensagem validada com Sucesso!" + el.validarMsgFaqNao);
		metodos.fecharNavegador();

	}

	@Test
	public void Ct07produtosQueEuEncontroNoZeEnergeticoSim() throws InterruptedException {
		metodos.abrirPageProduto();
		metodos.scrool();
		metodos.clicarProdutoSim(el.produtoEnergetico, el.btnMaior18AnosSim, el.labelPrdEnergetico);
		metodos.validarTexto(el.labelPrdEnergetico, el.validarMsgPrdEnergetico);
	}

	@Test
	public void Ct08rodutosGelo() throws InterruptedException {
		metodos.abrirPageProduto();
		metodos.scrool();
		metodos.clicarProdutoSim(el.produtoGelo, el.btnMaior18AnosSim, el.labelPrdGelo);
		metodos.validarTexto(el.labelPrdGelo, el.validarMsgPrdGelo);
		metodos.fecharNavegador();
	}

	@Test
	public void Ct09produtosAmendoin() throws InterruptedException {
		metodos.abrirPageProduto();
		metodos.scrool();
		metodos.clicarProdutoSim(el.produtoAmendoin, el.btnMaior18AnosSim, el.labelPrdPetiscos);
		metodos.validarTexto(el.labelPrdPetiscos, el.validarMsgPrdPetiscos);
		metodos.fecharNavegador();
	}

	@Test
	public void Ct10produtosQueEuEncontroNoZeEnergeticoNao() throws InterruptedException, IOException {
		metodos.abrirPageProduto();
		metodos.scrool();
		metodos.clicarProdutoNao();
		metodos.screenShot("Evidencia Menor de idade");
		metodos.fecharNavegador();

	}

}

