import dados.Dados;
import footballAPI.FootballAPI;

public class Main {
    public static void main(String[] args) {
        String teamID = "57";
        Dados dados = FootballAPI.acess(teamID);

        System.out.println(dados.getName());
        System.out.println(dados.getShortName());
        System.out.println(dados.getTla());
    }
}