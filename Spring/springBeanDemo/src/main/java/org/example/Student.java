package org.example;


import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    int id;
    String name;
    String city;
    List<String> mobileNumbers;
    Set<String> emails;
    Map<String, String> courses;
    Address address;

    public Student() {
        super();
    }

    public Student(String name, int id, String city) {
        super();
        this.name = name;
        this.id = id;
        this.city = city;
    }

    public Student(int id, String name, String city, List<String> mobileNumbers, Set<String> emails, Map<String, String> courses, Address address) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.mobileNumbers = mobileNumbers;
        this.emails = emails;
        this.courses = courses;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getMobileNumbers() {
        return mobileNumbers;
    }

    public void setMobileNumbers(List<String> mobileNumbers) {
        this.mobileNumbers = mobileNumbers;
    }

    public Set<String> getEmails() {
        return emails;
    }

    public void setEmails(Set<String> emails) {
        this.emails = emails;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", mobileNumbers=" + mobileNumbers +
                ", emails=" + emails +
                ", courses=" + courses +
                ", address=" + address +
                '}';
    }
}
