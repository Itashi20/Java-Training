package com.mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int addressId;
private String city;
private String state;
public int getAddressId() {
	return addressId;
}
public void setAddressId(int addressId) {
	this.addressId = addressId;
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
@Override
public String toString() {
	return "Address [addressId=" + addressId + ", city=" + city + ", state=" + state + "]";
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
public Address(String city, String state) {
	super();
	this.city = city;
	this.state = state;
}

}
