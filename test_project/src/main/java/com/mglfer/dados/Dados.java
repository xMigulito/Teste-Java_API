package dados;
public class Dados {
    String name;
    String shortName;
    String tla;

    public Dados(String name, String shortName, String tla, String squad) {
        this.setName(name);
        this.setShortName(shortName);
        this.setTla(tla);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getShortName() {
        return shortName;
    }
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
    public String getTla() {
        return tla;
    }
    public void setTla(String tla) {
        this.tla = tla;
    }
}
