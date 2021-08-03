package JaxPowell.coronavirustrackerUS.models;

public class LocationStats {
    private String place;
    private int latestTotalCases;
    private int prevDayDiff;

    public int getPrevDayDiff() {
        return prevDayDiff;
    }

    public void setPrevDayDiff(int prevDayDiff) {
        this.prevDayDiff = prevDayDiff;
    }

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

    @Override
    public String toString() {
        return "LocationStats{" +
                "place='" + place + '\'' +
                ", latestTotalCases=" + latestTotalCases +
                '}';
    }
}
