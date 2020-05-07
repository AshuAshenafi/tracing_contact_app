public class Symptom {
    private String symptomName;
    private int numberOfDays;
    private String description;

    public Symptom() {
    }


    public Symptom(String symptomName, int numberOfDays, String description) {
        this.symptomName = symptomName;
        this.numberOfDays = numberOfDays;
        this.description = description;
    }

    public String getSymptomName() {
        return symptomName;
    }

    public void setSymptomName(String symptomName) {
        this.symptomName = symptomName;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
