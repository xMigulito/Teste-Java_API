package footballAPI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

import conversor.Conversor;

import java.io.IOException;

public class DadosTime {
    static String apiKey = "86b75af7e2bf4665a23b91a0ff911a53";
    static int codigoSucesso = 200;

    public static void informacoes(int teamId){
        try {
            URL url = new URL("https://api.football-data.org/v2/teams/" + teamId); // Declaração da Variavel com a Url que será utilizada.
            HttpURLConnection connection = (HttpURLConnection) url.openConnection(); // Realiza o acesso ao HTTP.
            connection.setRequestMethod("GET"); // Informa o tipo de solicitação. O Get é utilizado para solicitar dados da URL utilizada.
            connection.setRequestProperty("X-Auth-Token", apiKey); // Linha utilizada para a autenticação, através da minha apiKey.

            if (connection.getResponseCode() != codigoSucesso){ // Caso o codigo seja diferente do declarado, ele irá constar um erro.
                throw new RuntimeException("HTTP error code : " + connection.getResponseCode());
            }

            BufferedReader resposta = new BufferedReader(new InputStreamReader(connection.getInputStream())); // Cria um Buffer para melhor leitura dos dados, converte os bytes em caracteres.
            String jsonEmString = Conversor.JsontoString(resposta); //Converte o JSON em String.

            Gson gson = new Gson(); // Cria uma instância, podendo ser utilizada para converter objetos Java em JSON e vice-versa.
            System.out.println(jsonEmString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}