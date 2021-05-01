package com.lior.AdoptMe.entitiy;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="animal")
public class Animal implements Serializable {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="animal_name")
    private String name;

    @Column(name="animal_kind")
    private String animalKind;

    @Column(name="age")
    private double age;

    @Column(name="description")
    private String description;

    @Column(name="image_url")
    private String imageUrl;

    @Column(name="contact_name")
    private String contactName;

    @Column(name="contact_phone")
    private String contactPhone;

    public Animal() {
    }

    public Animal(Long id, String name, String animalKind, double age, String description, String imageUrl, String contactName,
                  String contactPhone) {
        this.id = id;
        this.name = name;
        this.animalKind = animalKind;
        this.age = age;
        this.description = description;
        this.imageUrl = imageUrl;
        this.contactName = contactName;
        this.contactPhone = contactPhone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAnimalKind() {
        return animalKind;
    }

    public void setAnimalKind(String animalKind) {
        this.animalKind = animalKind;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(animal.age, age) == 0 &&
                Objects.equals(id, animal.id) &&
                Objects.equals(name, animal.name) &&
                Objects.equals(animalKind, animal.animalKind) &&
                Objects.equals(description, animal.description) &&
                Objects.equals(imageUrl, animal.imageUrl) &&
                Objects.equals(contactName, animal.contactName) &&
                Objects.equals(contactPhone, animal.contactPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, animalKind, age, description, imageUrl, contactName, contactPhone);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", animalKind='" + animalKind + '\'' +
                ", age=" + age +
                ", description='" + description + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", contactName='" + contactName + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                '}';
    }
}
