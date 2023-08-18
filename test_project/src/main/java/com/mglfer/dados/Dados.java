package dados;
public class Dados {
    String name;
    String tla;

    public Dados(String name, String tla, String squad) {
        this.setName(name);
        this.setTla(tla);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTla() {
        return tla;
    }
    public void setTla(String tla) {
        this.tla = tla;
    }
    @Override
    public String toString() {
        return "Dados [name=" + name + ", tla=" + tla + "]";
    }

    
}
