import java.util.Date;

public class Location {
    private String dateOfContact;
    private String cityOfContact;
    private String stateOfContact;
    private String nameOfPlaceVisited;

    public Location() {
    }

    public Location(String dateOfContact, String cityOfContact, String stateOfContact) {
        this.dateOfContact = dateOfContact;
        this.cityOfContact = cityOfContact;
        this.stateOfContact = stateOfContact;
    }

    public Location(String dateOfContact, String cityOfContact, String stateOfContact, String nameOfPlaceVisited) {
        this.dateOfContact = dateOfContact;
        this.cityOfContact = cityOfContact;
        this.stateOfContact = stateOfContact;
        this.nameOfPlaceVisited = nameOfPlaceVisited;
    }

    public String getDateOfContact() {
        return dateOfContact;
    }

    public void setDateOfContact(String dateOfContact) {
        this.dateOfContact = dateOfContact;
    }

    public String getCityOfContact() {
        return cityOfContact;
    }

    public void setCityOfContact(String cityOfContact) {
        this.cityOfContact = cityOfContact;
    }

    public String getStateOfContact() {
        return stateOfContact;
    }

    public void setStateOfContact(String stateOfContact) {
        this.stateOfContact = stateOfContact;
    }

    public String getNameOfPlaceVisited() {
        return nameOfPlaceVisited;
    }

    public void setNameOfPlaceVisited(String nameOfPlaceVisited) {
        this.nameOfPlaceVisited = nameOfPlaceVisited;
    }
}
