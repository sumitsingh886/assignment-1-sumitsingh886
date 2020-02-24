package Person;

public class Person {
    private String firstname;
    private String lastname;
    private String emailAddress;
    private StringBuilder contactNumbers = new StringBuilder();

    public static setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public static setLastName(String lastname) {
        this.LastName = lastname;
    }

    public static setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public StringBuilder getContactNumbers() {
        return contactNumbers;
    }
}
