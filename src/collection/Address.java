package collection;

import java.util.Random;
import java.util.UUID;

public class Address {

    private String street;
    private Short number;
    private Integer postCode;
    private String city;


    public Address() {
        // invent some address data
        this.street = UUID.randomUUID().toString();
        this.number = (short) new Random(System.currentTimeMillis()).nextInt(Short.MAX_VALUE);
        this.postCode = new Random(System.currentTimeMillis()).nextInt(99999);
        this.city = UUID.randomUUID().toString();
    }


    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", postCode=" + postCode +
                ", city='" + city + '\'' +
                '}';
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Short getNumber() {
        return number;
    }

    public void setNumber(Short number) {
        this.number = number;
    }

    public Integer getPostCode() {
        return postCode;
    }

    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
