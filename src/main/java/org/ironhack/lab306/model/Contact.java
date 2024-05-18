package org.ironhack.lab306.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "contacts")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String company;

    @Embedded
    private Name name;

    public Contact(String title, String company, Name name) {
        this.title = title;
        this.company = company;
        this.name = name;
    }

    public Contact() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(id, contact.id) && Objects.equals(title, contact.title) && Objects.equals(company, contact.company) && Objects.equals(name, contact.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, company, name);
    }
}
