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