import java.util.ArrayList;

public class Patient extends Person {

    private ArrayList<Symptom> symptoms;
    private ArrayList<ContactedPerson> contactedPerson;
    private ArrayList<Location> visitedPlaces;

    public Patient(String fullName, String phoneNumber, String email, Address address, ArrayList<Symptom> symptoms,
                   ArrayList<ContactedPerson> contactedPerson, ArrayList<Location> visitedPlaces) {
        super(fullName, phoneNumber, email, address);
        this.symptoms = symptoms;
        this.contactedPerson = contactedPerson;
        this.visitedPlaces = visitedPlaces;
    }

    public ArrayList<Symptom> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(ArrayList<Symptom> symptoms) {
        this.symptoms = symptoms;
    }

    public ArrayList<ContactedPerson> getContactedPerson() {
        return contactedPerson;
    }

    public void setContactedPerson(ArrayList<ContactedPerson> contactedPerson) {
        this.contactedPerson = contactedPerson;
    }

    public ArrayList<Location> getVisitedPlaces() {
        return visitedPlaces;
    }

    public void setVisitedPlaces(ArrayList<Location> visitedPlaces) {
        this.visitedPlaces = visitedPlaces;
    }
}
