package collection;

import java.time.LocalDate;

public class Person {

    private String firstName;
    private String surName;
    private LocalDate dob;
    private Address address;

    public Person() {
    }

    public Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.surName = lastName;
    }


    public String name() {

        String name;
        if("".equals(firstName) && "".equals(surName)) {
            name = null;
        } else {
            name = "".equals(firstName) ? null : firstName + " ";
            name += "".equals(surName) ? null : surName;
        }

        return name.trim();
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
