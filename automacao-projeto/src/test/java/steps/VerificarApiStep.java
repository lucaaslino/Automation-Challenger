package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import io.restassured.RestAssured;

public class VerificarApiStep {

	private io.restassured.response.Response response;
	private String id;

	@Dado("que eu quero criar um novo usuário")
	public void utilizando_metodo_post() {
		// Nenhuma ação específica necessária aqui
	}

	@Quando("eu faço uma requisição POST para o endpoint {string} com os seguintes dados:")
	public void enviando_post(String endpoint,
			DataTable dataTable) {
		Map<String, String> data = dataTable.asMap(String.class, String.class);

		response = RestAssured
				.given()
				.baseUri("https://reqres.in")
				.contentType("application/json")
				.body(data)
				.post(endpoint);
		
		id = response.jsonPath().get("id");
	}

	@Então("a resposta da API deve conter o código de status {int}")
	public void verificando_status(Integer statusCode) {
		assertEquals(Integer.valueOf(statusCode), Integer.valueOf(response.getStatusCode()));
	}

	@Então("a resposta deve conter os campos corretos")
	public void verificando_body_resposta() {
		assertEquals("joao", response.jsonPath().get("name"));
		assertEquals("teste", response.jsonPath().get("job"));
		assertNotNull(response.jsonPath().get("id"));
		assertNotNull(response.jsonPath().get("createdAt"));
	}
	
	@Então("a resposta da API deve conter a ID gerada")
    public void verificar_id_gerada() {
        assertNotNull(id);
    }
	
	@Quando("eu faço uma requisição GET para o endpoint users id")
    public void realizar_get() {
        String endpoint = "/api/users/" + id;

        response = RestAssured
            .given()
            .baseUri("https://reqres.in")
            .get(endpoint);
    }

}
