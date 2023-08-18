package dados;
public class Dados {
    String name;
    String tla;
    String founded;
    String clubColors;
    String venue;

    public Dados(String name, String tla, String founded, String clubColors, String venue) {
        this.setName(name);
        this.setTla(tla);
        this.setFounded(founded);
        this.setClubColors(clubColors);
        this.setVenue(venue);
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

    public String getFounded() {
        return founded;
    }

    public void setFounded(String founded) {
        this.founded = founded;
    }

    public String getClubColors() {
        return clubColors;
    }

    public void setClubColors(String clubColors) {
        this.clubColors = clubColors;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    @Override
    public String toString() {
        return "Informações:\nNome: " + name + "\nAbreviação: " + tla + "\nTime fundado em: " + founded + "\nCores do clube: " + clubColors
                + "\nEstádio: " + venue;
    }

    
    
    
}
