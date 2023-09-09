package com.cjude.learn.java.restfulwebservices.versioning;

public class PersonV2 {
   private  String  lastName;
   private  String firstName;

    public PersonV2(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "PersonV2{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
