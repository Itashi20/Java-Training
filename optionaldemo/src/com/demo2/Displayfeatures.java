package com.demo2;

import java.util.Optional;

public class Displayfeatures {
private String size;
private Optional<ScreenResol> resol;
private Optional<Camera>camera;
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}
public Optional<ScreenResol> getResol() {
	return resol;
}
public void setResol(Optional<ScreenResol> resol) {
	this.resol = resol;
}
public Optional<Camera> getCamera() {
	return camera;
}
public void setCamera(Optional<Camera> camera) {
	this.camera = camera;
}
@Override
public String toString() {
	return "Displayfeatures [size=" + size + ", resol=" + resol + ", camera=" + camera + "]";
}
public Displayfeatures(String size, Optional<ScreenResol> resol, Optional<Camera> camera) {
	super();
	this.size = size;
	this.resol = resol;
	this.camera = camera;
}
public Displayfeatures() {
	super();
	// TODO Auto-generated constructor stub
}



}
