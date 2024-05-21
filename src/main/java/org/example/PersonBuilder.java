package org.example;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder() {

    }

    public PersonBuilder setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Человеку нужно имя!");
        }
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        if (surname == null || surname.isEmpty()) {
            throw new IllegalArgumentException("У человека должна быть фамилия!");
        }
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("У человека должен быть заполнен возраст");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        if (address == null || address.isEmpty()) {
            throw new IllegalArgumentException("Укажите адрес человека!");
        }
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || surname == null || age == 0 || address == null) {
            throw new IllegalStateException("Недостаточно информации, чтобы создать человека:)");
        }
        return new Person(name, surname, age, address);
    }
}