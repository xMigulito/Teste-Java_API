package time;

public class Time {
    public String shortName;

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Time(String shortName) {
        this.setShortName(shortName);;
    }

 
}
