package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComprarProdutosPage {
	WebDriver driver;

	public ComprarProdutosPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static int qtdStylishDress;
	String sQtdStylishDress = Integer.toString(qtdStylishDress);

	public static int qtdBeautPeacock;
	String sQtdBeautPeacock = Integer.toString(qtdBeautPeacock);

	public static int qtdMenTshirt;
	String sQtdMenTshirt = Integer.toString(qtdMenTshirt);

	// Elementos Tela COMPRAS
	@FindBy(xpath = "//a[@data-product-id='4']")
	private WebElement stylishDress;

	@FindBy(xpath = "//a[@data-product-id='41']")
	private WebElement beautifulPeacock;

	@FindBy(xpath = "//a[@data-product-id='2']")
	private WebElement menTshirt;

	@FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
	private WebElement continuarCompras;

	// Elementos Tela Carrinho
	@FindBy(xpath = "//a[@href='/view_cart']")
	private WebElement pageCarrinho;

	@FindBy(xpath = "//tr[@id='product-4']/td/button[@class='disabled']")
	private WebElement qtd_cart_stylishDress;

	@FindBy(xpath = "//tr[@id='product-41']/td/button[@class='disabled']")
	private WebElement qtd_cart_beautifulPeacock;

	@FindBy(xpath = "//tr[@id='product-2']/td/button[@class='disabled']")
	private WebElement qtd_cart_menTshirt;

	public void adicionarCarrinhoStylishDress(int qtdStylishDress) {

		ComprarProdutosPage.qtdStylishDress = qtdStylishDress;
		for (int i = 0; i < qtdStylishDress; i++) {
			stylishDress.click();
			continuarCompras.click();
		}
	}

	public void adicionarCarrinhoBeautifulPeacock(int qtdBeautPeacock) {

		ComprarProdutosPage.qtdBeautPeacock = qtdBeautPeacock;
		for (int i = 0; i < qtdBeautPeacock; i++) {
			beautifulPeacock.click();
			continuarCompras.click();
		}
	}

	public void adicionarCarrinhoMenTshirt(int qtdMenTshirt) {

		ComprarProdutosPage.qtdMenTshirt = qtdMenTshirt;
		for (int i = 0; i < qtdMenTshirt; i++) {
			menTshirt.click();
			continuarCompras.click();
		}
	}

	public void acessarTelaCarrinho() {

		pageCarrinho.click();

	}

	public void verQtdStylishDress() {

		Assert.assertEquals(sQtdStylishDress, qtd_cart_stylishDress.getText());
		System.out.println("Quantidade Correta de Stylish Dress no Carrinho");
	}

	public void verQtdBeautPeacock() {

		Assert.assertEquals(sQtdBeautPeacock, qtd_cart_beautifulPeacock.getText());
		System.out.println("Quantidade Correta de Beautiful Peacock Blue Cotton Linen Saree no Carrinho");

	}

	public void verQtdMenTshirt() {

		Assert.assertEquals(sQtdMenTshirt, qtd_cart_menTshirt.getText());
		System.out.println("Quantidade Correta de Men Tshirt no Carrinho");

	}

}
