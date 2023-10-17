package com.demo2;

import java.util.Optional;

public class MobileMain {
public static void main(String args[]) {
//	Optional <MobileServiceStation> mss=new MobileServiceStation();
//	int width=mss.getwidth(new Optional<SmartPhone>(1,"ABC","GHI",
//			new Optional<Displayfeatures>("5",new ScreenResol(10,20))));
//	System.out.println(width);
//	
//	
	
//	SmartPhone sp = new SmartPhone(1, "Apple", "iPhone 15 Pro", new DisplayFeatures(78, new ScreenResol(13,6)));
//	
//	MobileServiceStation mss = new MobileServiceStation();
//	System.out.println(mss.getScreenWidth(sp));

	
	//we cannot do these things using simple if else statementts but we have done
	//this using the concept of optional
	
	

ScreenResol resol=new ScreenResol(650,1234);
Camera cam=new Camera(123,"Convex");
Displayfeatures df=new Displayfeatures("5.0",Optional.of(resol),Optional.of(cam));
SmartPhone phone=new SmartPhone(127377,"Mango","Iphone",Optional.of(df));


MobileServiceStation station=new MobileServiceStation();
int width=station.getwidth(Optional.of(phone));
int pixel=station.getpixel(Optional.of(phone));
System.out.println(width);
System.out.println(pixel);



SmartPhone phone2=new SmartPhone(1377,"Apple","Inew",Optional.empty());
int width2=station.getwidth(Optional.empty());
System.out.println(width2);




}
}
