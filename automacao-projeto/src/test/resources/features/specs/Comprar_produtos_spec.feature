#language:pt

@Suite_Comprar_produtos

Funcionalidade: Realizar Compras de Produto

    @Comprar_produtos
    Cenario: Comprar Produtos específicos
    Dado esteja na pagina: "https://automationexercise.com/"
   	Quando Realizo o Login
   	E Realizo a compra de 3 Stylish Dresses
   	E Realizo a compra de 2 Beautiful Peacock Blue Cotton Linen Saree
   	E Realizo a compra de 1 Men Tshirt
   	E Verifico se os itens foram adicionados corretamente no carrinho
   	E Realizo o Pagamento
   	Então Verifico se a compra foi realizada com sucesso
   	
   	
   	@Realizar_cadastro
   	 Cenario: BONUS - Realizar Cadastro
   	 Dado esteja na pagina: "https://automationexercise.com/"
   	 Quando acesso a tela de cadastro
   	 E preencho os campos de cadastro
   	 Então verifico se o cadastro foi realizado com sucesso