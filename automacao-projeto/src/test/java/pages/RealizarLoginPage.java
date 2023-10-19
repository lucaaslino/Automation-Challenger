package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.javafaker.Faker;

public class RealizarLoginPage {

	WebDriver driver;

	public RealizarLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	Faker faker = new Faker();
    String fakeEmail = faker.internet().emailAddress();
    
	// Elementos LOGIN
	@FindBy(xpath = "//a[@href='/login']")
	private WebElement pageLogin;

	@FindBy(xpath = "//input[@data-qa='login-email']")
	private WebElement campoEmail;

	@FindBy(xpath = "//input[@data-qa='login-password']")
	private WebElement campoSenha;

	// Elementos Cadastro
	@FindBy(xpath = "//input[@data-qa='signup-name']")
	private WebElement nomeCadastro;

	@FindBy(xpath = "//input[@data-qa='signup-email']")
	private WebElement emailCadastro;

	@FindBy(xpath = "//input[@id='id_gender1']")
	private WebElement radioMr;
	
	@FindBy(xpath = "//input[@data-qa='password']")
	private WebElement senhaCadastro;
	
	@FindBy(xpath = "//select[@id='days']")
	private WebElement diaNascCadastro;
	
	@FindBy(xpath = "//option[@value='6']")
	private WebElement selectDia;
	
	@FindBy(xpath = "//select[@id='months']")
	private WebElement mesNascCadastro;
	
	@FindBy(xpath = "//option[@value='June']")
	private WebElement selectMes;
	
	@FindBy(xpath = "//select[@id='years']")
	private WebElement anoNascCadastro;
	
	@FindBy(xpath = "//option[@value='2000']")
	private WebElement selectAno;
	
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement endNomeCadastro;
	
	@FindBy(xpath = "//input[@data-qa='last_name']")
	private WebElement endSobrenomeCadastro;
	
	@FindBy(xpath = "//input[@id='address1']")
	private WebElement enderecoCadastro;
	
	@FindBy(xpath = "//input[@id='state']")
	private WebElement endEstadoCadastro;
	
	@FindBy(xpath = "//input[@id='city']")
	private WebElement endCidadeCadastro;
	
	@FindBy(xpath = "//input[@id='zipcode']")
	private WebElement endCepCadastro;
	
	@FindBy(xpath = "//input[@id='mobile_number']")
	private WebElement numTelCadastro;
	
	@FindBy(xpath = "//button[@data-qa='create-account']")
	private WebElement btnCriarConta;
	
	@FindBy(xpath = "//p[contains(text(),'Congratulations! Your new account has been success')]")
	private WebElement verCadastroSucessoMsg;
	
	
	
	public void realizarLogin() {

		pageLogin.click();
		campoEmail.sendKeys("datumqatest@soprock.com");
		campoSenha.sendKeys("datum2021");
		campoSenha.sendKeys(Keys.ENTER);

	}

	public void acessarTelaCadastro() {

		pageLogin.click();
		nomeCadastro.sendKeys("Joao da Silva");
		emailCadastro.sendKeys(fakeEmail);
		emailCadastro.sendKeys(Keys.ENTER);

	}

	public void preencherCadastro() {
		
		radioMr.click();
		senhaCadastro.sendKeys("senhaforte123");
		diaNascCadastro.sendKeys("10");
		mesNascCadastro.sendKeys("June");
		anoNascCadastro.sendKeys("2000");
		endNomeCadastro.sendKeys("Joao");
		endSobrenomeCadastro.sendKeys("Da Silva");
		enderecoCadastro.sendKeys("Rua 02");
		endEstadoCadastro.sendKeys("DF");
		endCidadeCadastro.sendKeys("Brasilia");
		endCepCadastro.sendKeys("72410106");
		numTelCadastro.sendKeys("61981853337");
		btnCriarConta.click();
		
	}
	
	public void verCadastroSucesso() {

		Assert.assertEquals("Congratulations! Your new account has been successfully created!", verCadastroSucessoMsg.getText());
		System.out.println("Verificado que o cadastro foi realizado com sucesso!");

	}

}
