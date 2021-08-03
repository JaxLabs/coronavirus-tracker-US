package JaxPowell.coronavirustrackerUS.models;

public class LocationStats {

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    private String place;
    private int latestTotalCases;

    @Override
    public String toString() {
        return "LocationStats{" +
                "place='" + place + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
}
