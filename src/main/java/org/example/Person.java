package org.example;

import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    private int age;
    private String address;

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        return this.age > 0;
    }

    public boolean hasAddress() {
        return this.address != null;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public OptionalInt getAge() {
        return hasAge() ? OptionalInt.of(this.age) : OptionalInt.empty();
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (hasAge()) {
            this.age++;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
        // int result = name.hashCode();
        // result = 31 * result + surname.hashCode();
        //result = 31 * result + age;
        //  result = 31 * result + address.hashCode();
        //return result;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setName(name)
                .setSurname(surname)
                .setAge(age)
                .setAddress(address);
    }
}


