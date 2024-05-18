package org.ironhack.lab306.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import org.ironhack.lab306.enums.Salutation;

import java.util.Objects;


@Embeddable
public class Name {
    private String firstName;
    private String middleName;
    private String lastName;
    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('Mr', 'Ms', 'Dr', 'None')")
    private Salutation salutation;

    public Name(String firstName, String middleName, String lastName, Salutation salutation) {
        setFirstName(firstName);
        setMiddleName(middleName);
        setLastName(lastName);
        setSalutation(salutation);
    }

    public Name() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Salutation getSalutation() {
        return salutation;
    }

    public void setSalutation(Salutation salutation) {
        this.salutation = salutation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equals(firstName, name.firstName) && Objects.equals(middleName, name.middleName) && Objects.equals(lastName, name.lastName) && salutation == name.salutation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, middleName, lastName, salutation);
    }
}
