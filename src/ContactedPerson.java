

public class ContactedPerson extends Person {
    private Location location;


    public ContactedPerson(String fullName, String phoneNumber, String email, Address address, Location location) {
        super(fullName, phoneNumber, email, address);
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
