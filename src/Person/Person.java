package Person;

import Contacts.Contacts;

public class Person {
    private String firstName;
    private String lastName;
    private Contacts<String> contacts;
    private String email;

    public Person(String firstName, String lastName, Contacts<String> contacts, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contacts = contacts;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Contacts<String> getContacts() {
        return contacts;
    }

    public void setContacts(Contacts<String> contacts) {
        this.contacts = contacts;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
