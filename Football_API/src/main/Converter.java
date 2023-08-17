
import java.io.BufferedReader;
import java.io.IOException;

public class Converter {
     public static String JsontoString(BufferedReader buffereReader) throws IOException{ // Função para converter os dados lidos em uma String.
        String resposta, jsonEmString = " ";
        while ((resposta = buffereReader.readLine()) != null){ // O loop permanecerá caso tenham linhas a serem lidas.
            jsonEmString += resposta;
        }
        return jsonEmString;
     }
}
