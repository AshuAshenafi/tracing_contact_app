
import java.util.ArrayList;

import java.util.Scanner;


public class ContactReportApp {
    // arraylist for all patients
    static ArrayList<Patient> allPatients = new ArrayList<>();


    public static void main(String[] args) {
        Scanner keybd = new Scanner(System.in);

        ArrayList<ContactedPerson> contactedPersons = new ArrayList<>();
        ArrayList<Location> visitedPlacesByAPatient = new ArrayList<>();
        // arraylists for one patient's symptom and people contacted
        ArrayList<Symptom> symptoms = new ArrayList<>();
        String[] symptomList = {"Fever", "Cough", "Shortness of breath or difficulty breathing", "Tiredness", "Aches", "Chills", "Sore throat", "Loss of smell", "Loss of taste", "Headache", "Diarrhea", "Severe vomiting"};
        Location placeAndDateOfContact;
        Address contactedPersonAddress;

        String contactedName = "";
        String contactedPhone = "";
        String contactedEmail = "";
        String contactedStreetName = "";
        String contactedCity = "";
        String contactedState = "";
        String dateOfContact = "";
        String cityOfContact = "";
        String stateOfContact = "";
        String contactedHouseNumber = "";


///////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////START HERE//////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////

        // Welcome note
        System.out.println("Contact Tracing Program\n" +
                "Enter a newly infected person's information: ");
        // Infected Person Information

        // prompt user to enter name:
        System.out.println("What is a patient's name? ");
        String patientName = keybd.nextLine();

        //        boolean validPhonenumber = true;                                  // validate phone
        //        while(validPhonenumber){                                          // validate phone
        System.out.println("What is a patient's phone number?  ");
        String patientPhone = keybd.nextLine();
        //        } // phone validation while loop                                  // validate phone


        //        boolean validEmail = true;                                  // validate email
        //        while(validEmail){                                          // validate email
        System.out.println("What is a patient's email? ");
        String patientEmail = keybd.nextLine();

        //        } // email validation while loop                                  // validate email


        // prompt user to enter patient's address
        System.out.println("What city does a patient live in? ");
        String patientCity = keybd.nextLine();

        System.out.println("What state does a patient live in? ");
        String patientState = keybd.nextLine();

        System.out.println("What is patient's House Number? ");
        String patientHouseNumber = keybd.nextLine();

        System.out.println("What is patient's Street Name: ");
        String patientStreetName = keybd.nextLine();

        Address patientAddress = new Address(patientHouseNumber, patientStreetName, patientCity, patientState);


        //prompt user to enter symptoms
        for (int i = 0; i < symptomList.length; i++) {
            System.out.println("Does " + patientName + " have any symptom for " + symptomList[i] + "? (y/n)");
            String userInput = keybd.nextLine();

            if (userInput.equalsIgnoreCase("y")) {
                String symptom = symptomList[i];

                System.out.println("How long has " + patientName + " had this symptom for? ");
                int numberOfDays = keybd.nextInt();
                keybd.nextLine();

                System.out.println("Please enter here if you have any additional Description? ");
                String description = keybd.nextLine();

                Symptom smpt = new Symptom(symptom, numberOfDays, description);
                // add this one symptom to arraylist
                symptoms.add(smpt);
            }
        }   // end of for symptom loops

        // prompt to enter contacted person/s
        boolean hasMoreContactedPerson = true;

        while (hasMoreContactedPerson) {

            System.out.println("\nHas " + patientName + " met or run into anyone? (y/n) ");
            String userInput1 = keybd.nextLine();

            if (userInput1.equalsIgnoreCase("y")) {


                System.out.println("What is his/her name? ");
                contactedName = keybd.nextLine();

                //        boolean validPhonenumber = true;                                  // validate phone
                //        while(validPhonenumber){                                          // validate phone
                System.out.println("What is his/her phone number? ");
                //        } // phone validation while loop                                  // validate phone
                contactedPhone = keybd.nextLine();


                //        boolean validEmail = true;                                  // validate email
                //        while(validEmail){                                          // validate email
                System.out.println("What is his/her email? ");
                contactedEmail = keybd.nextLine();

                //        } // email validation while loop                                  // validate email

                // address of contacted person
                System.out.println("Enter House Number: ");
                contactedHouseNumber = keybd.nextLine();
                //                keybd.nextLine();

                System.out.println("What Street Name does she/he live? ");
                contactedStreetName = keybd.nextLine();

                System.out.println("What city does he/her live in? ");
                contactedCity = keybd.nextLine();

                System.out.println("What state does he/her live in? ");
                contactedState = keybd.nextLine();


////////////////////////////////////////////////////////////////////////////////////////////////
                // place where they meet and or contacted
                System.out.println("What city did " + patientName + " see him/her? ");
                cityOfContact = keybd.nextLine();

                System.out.println("What state did " + patientName + " see him/her? ");
                stateOfContact = keybd.nextLine();

                // validate date entered////////////////////////////////////////////////////////////////
                System.out.println("When did " + patientName + " see him/her? (mm/dd/yyyy) ");

                dateOfContact = keybd.nextLine();

                placeAndDateOfContact = new Location(dateOfContact, cityOfContact, stateOfContact);

                contactedPersonAddress = new Address(contactedHouseNumber, contactedStreetName, contactedCity, contactedState);

                ContactedPerson cpr1 = new ContactedPerson(contactedName, contactedPhone, contactedEmail, contactedPersonAddress, placeAndDateOfContact);


                contactedPersons.add(cpr1);

            } // if condition
            else {
                hasMoreContactedPerson = false;

            }   // end of else hasmorecontactedPerson

        }   // end of hasMorecontactedPerson while() loop

        boolean visitedSomeWhere = true;
        // prompt places which a patient might visited with in the last 14 days
        while (visitedSomeWhere) {
            System.out.println("Did " + patientName + " visited anywhere in the past 14 days? (y/N) ");

            String userInput2 = keybd.nextLine();

            if (userInput2.equalsIgnoreCase("y")) {
                System.out.println("What is the name of a visited place?");
                String nameOfPlaceVisited = keybd.nextLine();

                System.out.println("Which city is " + nameOfPlaceVisited + " located in?");
                String nameOfCityVisited = keybd.nextLine();


                System.out.println("Which state is " + nameOfPlaceVisited + " located in?");
                String nameOfStateVisited = keybd.nextLine();

                System.out.println("When did " + patientName + " went to" + nameOfPlaceVisited + "? (mm/dd/yyyy)");
                String dateOfVisit = keybd.nextLine();

                Location visitedPlace = new Location(dateOfVisit, nameOfCityVisited, nameOfStateVisited, nameOfPlaceVisited);
                visitedPlacesByAPatient.add(visitedPlace);

            }   // end of "if" patient had visited a place
            else {
                visitedSomeWhere = false;
            }
        }   // end of while patient moved somewhere else


        Patient patient1 = new Patient(patientName, patientPhone, patientEmail, patientAddress, symptoms, contactedPersons, visitedPlacesByAPatient);

        allPatients.add(patient1);
        printPatientReport();


    }   // end of main() method

    /////////////////////////////////////////////////////////////////////// phone validation method//////////////////////////////////////////////////

    // print result
    public static void printPatientReport() {
        for (int i = 0; i < allPatients.size(); i++) {
            String name = allPatients.get(i).getFullName();
            String phone = allPatients.get(i).getPhoneNumber();
            String email = allPatients.get(i).getEmail();
            String city = allPatients.get(i).getAddress().getCity();
            // Report Heading
            System.out.println("***** Contact Tracing Report *****");
            // Patient information
            System.out.println("Name: " + name + "\nPhone: " + phone + "\nEmail: " + email + "\nCity: " + city);

            // symptoms
            System.out.println("\n**\t\tSymptoms: ");
            for (int j = 0; j < allPatients.get(i).getSymptoms().size(); j++) {
                System.out.println("\t\thad " + allPatients.get(i).getSymptoms().get(j).getSymptomName() + " for " + allPatients.get(i).getSymptoms().get(j).getNumberOfDays() + " days");
            }   // end of sympton for loop

            // people who have contact with patient
            System.out.println("\n**\t\tContacts:");
            for (int j = 0; j < allPatients.get(i).getContactedPerson().size(); j++) {
                System.out.println("Name: " + allPatients.get(i).getContactedPerson().get(j).getFullName() + "\nPhone: " + allPatients.get(i).getContactedPerson().get(j).getPhoneNumber() +
                        "\nEmail: " + allPatients.get(i).getContactedPerson().get(j).getEmail() +
                        "\nAddress: \nStreet address: " + allPatients.get(i).getContactedPerson().get(j).getAddress().getHouseNumber() + " " +
                        allPatients.get(i).getContactedPerson().get(j).getAddress().getStreetName() +
                        "\t, State: " + allPatients.get(i).getContactedPerson().get(j).getLocation().getStateOfContact() +
                        "\nContacted Location: " + allPatients.get(i).getContactedPerson().get(j).getLocation().getCityOfContact()
                        + ", " + allPatients.get(i).getContactedPerson().get(j).getLocation().getStateOfContact() + "\nContacted Date: " +
                        allPatients.get(i).getContactedPerson().get(j).getLocation().getDateOfContact() + "\n");
            }   // end of contacted person for loop

            // locations visited by patient
            System.out.println("\n\n**\t\tLocations:");
            for (int j = 0; j < allPatients.get(i).getVisitedPlaces().size(); j++) {
                System.out.println("Name: " + allPatients.get(i).getVisitedPlaces().get(j).getNameOfPlaceVisited() +
                        "\t\tCity: " + allPatients.get(i).getVisitedPlaces().get(j).getCityOfContact() + "\t\tState: " + allPatients.get(i).getVisitedPlaces().get(j).getStateOfContact() + "\t\tVisit Date: " + allPatients.get(i).getVisitedPlaces().get(j).getDateOfContact() + "\n");
            }
        }
    }
}   // end of App() class
