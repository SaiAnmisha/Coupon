package com.capgemini.couponfinder.PaymentService.domain;

public class Payment {
    private String address;
    private String email;
    private String city;
    private String state;
    private long zip;
    private float price;

    public Payment() {
        super();

    }

    public Payment(String address, String email, String city, String state, long zip, float price) {
        super();
        this.address = address;
        this.email = email;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price= price;
    }




}
