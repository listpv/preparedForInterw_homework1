package ru.geekbrains;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PersonBuilder {

    private final Person person;

    public PersonBuilder setFirstName(String firstName){
        person.setFirstName(firstName);
        return this;
    }

    public PersonBuilder setLastName(String lastName){
        person.setLastName(lastName);
        return this;
    }

    public  PersonBuilder setMiddleName(String middleName){
        person.setMiddleName(middleName);
        return this;
    }

    public PersonBuilder setCountry(String country){
        person.setCountry(country);
        return this;
    }

    public PersonBuilder setAddress(String address){
        person.setAddress(address);
        return this;
    }

    public PersonBuilder setPhone(String phone){
        person.setPhone(phone);
    }


}
