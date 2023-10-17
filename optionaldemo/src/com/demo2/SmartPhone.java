package com.demo2;

import java.util.Optional;

public class SmartPhone {
private long id;
private String brandName;
private String name;
private Optional<Displayfeatures> features;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getBrandName() {
	return brandName;
}
public void setBrandName(String brandName) {
	this.brandName = brandName;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Optional<Displayfeatures> getFeatures() {
	return features;
}
public void setFeatures(Optional<Displayfeatures> features) {
	this.features = features;
}
@Override
public String toString() {
	return "SmartPhone [id=" + id + ", brandName=" + brandName + ", name=" + name + ", features=" + features + "]";
}
public SmartPhone(long id, String brandName, String name, Optional<Displayfeatures> features) {
	super();
	this.id = id;
	this.brandName = brandName;
	this.name = name;
	this.features = features;
}
public SmartPhone() {
	super();
	// TODO Auto-generated constructor stub
}

}
