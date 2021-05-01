package com.lior.AdoptMe.controller;

import java.util.Objects;

public class LoginPayload {
    private String email;
    private String password;

    public LoginPayload() {
    }

    public LoginPayload(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginPayload that = (LoginPayload) o;
        return Objects.equals(email, that.email) &&
                Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password);
    }

    @Override
    public String toString() {
        return "LoginPayload{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}