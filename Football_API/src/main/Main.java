
public class Main {
    public static void main(String[] args) {
        String teamid = "57";
        Infos infos = FootballAPI.acess(teamid);
        
        System.out.println("Nome do Time: " + infos.getTeamName());
        System.out.println("Abreviação: " + infos.getAbreviacao());
    }
}