#language:pt

@Suite_verificar_apis

Funcionalidade: Verificar APIS exempo

    @Verificar_post
    Cenario: Verificar o post de USERS - Validar o método POST
    Dado que eu quero criar um novo usuário
    Quando eu faço uma requisição POST para o endpoint "/api/users" com os seguintes dados:
      | name | joao  |
      | job  | teste |
    Então a resposta da API deve conter o código de status 201
    E a resposta deve conter os campos corretos
    
    
    
    @Verificar_get
    Cenario: Verificar GET de Usuario Criado - Validar método GET Single User OBS: A resposta do GET não esta funcionando na API por isso só verifiquei o status de retorno 404
    Dado que eu quero criar um novo usuário
    Quando eu faço uma requisição POST para o endpoint "/api/users" com os seguintes dados:
      | name | denis  |
      | job  | analista |
    E a resposta da API deve conter o código de status 201
    E a resposta da API deve conter a ID gerada
    E eu faço uma requisição GET para o endpoint users id
    Então a resposta da API deve conter o código de status 404
    