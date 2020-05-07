import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    private String fullName;
    private String phoneNumber;
    private String email;
    private Address address;

    public Person() {
    }
    // Person may not have email address

    public Person(String fullName, String phoneNumber, String email, Address address) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (isPhoneNumberValid(phoneNumber)) {
            this.phoneNumber = phoneNumber;

//            System.out.println("Phone number successfully added!");
        } else {

            System.out.println("Phone number is not valid!");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public boolean isPhoneNumberValid(String phoneNumber) {
        boolean isValid = false;

        String expression = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
        CharSequence inputStr = phoneNumber;
        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(inputStr);
        if (matcher.matches()) {
            isValid = true;
        }
        return isValid;
    }
}
