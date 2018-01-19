package dto;

public class VenueSearch {
    private int cityId;
    private int sportId;

    public VenueSearch(int cityId, int sportId) {
        this.cityId = cityId;
        this.sportId = sportId;
    }

    public VenueSearch() {
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getSportId() {
        return sportId;
    }

    public void setSportId(int sportId) {
        this.sportId = sportId;
    }
}
