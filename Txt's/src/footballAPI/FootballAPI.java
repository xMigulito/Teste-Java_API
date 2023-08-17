package footballAPI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;

public class FootballAPI {
    String apiKey = "86b75af7e2bf4665a23b91a0ff911a53";
    int codigoSucesso = 200;
    
    public void acess(String teamID){
    try {
        URL url = new URL("https://api.football-data.org/v2/teams/" + teamID); // Declaração da Variavel com a Url que será utilizada.
        HttpURLConnection connection = (HttpURLConnection) url.openConnection(); // Realiza o acesso ao HTTP.
        connection.setRequestMethod("GET"); // Informa o tipo de solicitação. O Get é utilizado para solicitar dados da URL utilizada.
        connection.setRequestProperty("X-Auth-Token", apiKey); // Linha utilizada para a autenticação, através da minha apiKey.
        
        if (connection.getResponseCode() != codigoSucesso){ // Caso o codigo seja diferente do declarado, ele irá constar um erro.
            throw new RuntimeException("HTTP error code : " + connection.getResponseCode());
        }

        BufferedReader resposta = new BufferedReader(new InputStreamReader(connection.getInputStream())); // Cria um Buffer para melhor leitura dos dados, converte os bytes em caracteres.
        String jsonEmString = Converter.JsontoString(resposta);

        Gson gson = new Gson(); // Cria uma instância, podendo ser utilizada para converter objetos Java em JSON e vice-versa.
        Infos infos = gson.fromJson(jsonEmString, Infos.class); // Converte a String JSON em um objeto Java

        return infos;
    } catch (IOException e) {
        e.printStackTrace();
        }
    }
}
