package org.example;

public class Address {
    private String houseNo;
    private String streetName;
    private String city;
    private String state;

    public Address(String houseNo, String streetName, String city, String state) {
        this.houseNo = houseNo;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNo='" + houseNo + '\'' +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
