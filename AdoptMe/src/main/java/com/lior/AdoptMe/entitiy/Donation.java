package com.lior.AdoptMe.entitiy;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="donation")
public class Donation implements Serializable {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name="phone")
    private String phone;

    @Column(name="city")
    private String city;

    @Column(name="address")
    private String address;

    @Column(name="amount")
    private double amount;

    @CreationTimestamp
    @Column(name = "donation_date", nullable = false)
    private Date date;

    public Donation() {
    }

    public Donation(Long id, String firstName, String lastName, String email, String phone, String city, String address, double amount, Date date) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.city = city;
        this.address = address;
        this.amount = amount;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Donation donation = (Donation) o;
        return Double.compare(donation.amount, amount) == 0 &&
                Objects.equals(id, donation.id) &&
                Objects.equals(firstName, donation.firstName) &&
                Objects.equals(lastName, donation.lastName) &&
                Objects.equals(email, donation.email) &&
                Objects.equals(phone, donation.phone) &&
                Objects.equals(city, donation.city) &&
                Objects.equals(address, donation.address) &&
                Objects.equals(date, donation.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, phone, city, address, amount, date);
    }

    @Override
    public String toString() {
        return "Donation{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
