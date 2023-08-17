
public class Infos {
    String teamName;
    String abreviacao;

    public Infos(String teamName, String abreviacao) {
        this.setTeamName(teamName);
        this.setAbreviacao(abreviacao);
    }
    
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public String getAbreviacao() {
        return abreviacao;
    }
    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
    }

    @Override
    public String toString() {
        return "Infos [teamName=" + teamName + ", abreviacao=" + abreviacao + "]";
    }

    
}
