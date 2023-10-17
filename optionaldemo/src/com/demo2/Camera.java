package com.demo2;

public class Camera {
private int pixels;
private String lenstype;
public int getPixels() {
	return pixels;
}
public void setPixels(int pixels) {
	this.pixels = pixels;
}
public String getLenstype() {
	return lenstype;
}
public void setLenstype(String lenstype) {
	this.lenstype = lenstype;
}
@Override
public String toString() {
	return "Camera [pixels=" + pixels + ", lenstype=" + lenstype + "]";
}
public Camera(int pixels, String lenstype) {
	super();
	this.pixels = pixels;
	this.lenstype = lenstype;
}
public Camera() {
	super();
	// TODO Auto-generated constructor stub
}

}
