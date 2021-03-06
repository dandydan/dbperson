package com.dandy.core;

import java.util.Date;
import java.util.Set;

public class Person {
    int personId;

    private String firstName;

    private String middleName;

    private String lastName;

    private String suffix;

    private String title;

    private Date birthday;

    private boolean employed;

    private float gwa;

    private Gender gender;

    private Address address;

    private Set<Contact> contacts;

    private Set<Role> roles;

    public Person(){}

    public void setPersonId(int personId) {
        this.personId = personId;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public void setEmployed(boolean employed) {
        this.employed = employed;
    }
    public void setGwa(float gwa) {
        this.gwa = gwa;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
    public int getPersonId() {
        return this.personId;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getMiddleName() {
        return this.middleName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public String getSuffix() {
        return this.suffix;
    }
    public String getTitle() {
        return this.title;
    }
    public Date getBirthday() {
        return this.birthday;
    }
    public boolean getEmployed() {
        return this.employed;
    }
    public float getGwa() {
        return this.gwa;
    }
    public Gender getGender() {
        return this.gender;
    }
    public Address getAddress() {
        return this.address;
    }
    public Set<Contact> getContacts() {
        return this.contacts;
    }
    public Set<Role> getRoles() {
        return this.roles;
    }
}
