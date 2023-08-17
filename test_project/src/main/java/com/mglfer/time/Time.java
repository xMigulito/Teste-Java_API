package time;

public class Time {
    public String shortName;
    public int id;

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Time(String shortName, int id) {
        this.setShortName(shortName);
        this.setId(id);
    }

    

 
}
