package com.demo2;

import java.util.Optional;

public class MobileServiceStation {
//public int getScreenWidth(SmartPhone phone) {
//	if(phone!=null) {
//		Displayfeatures displayFeatures=phone.getFeatures();
//		if(displayFeatures!=null) {
//			ScreenResol c=displayFeatures.getResol();
//			if(c!=null) {
//				return c.getwidth()
//			}
//		}
//	}
//}
//return 0;
	
	
	public int getwidth(Optional<SmartPhone>mobile) {
		return mobile.flatMap(SmartPhone::getFeatures)
				.flatMap(Displayfeatures::getResol)
				.map(ScreenResol::getWidth)
				.orElse(0);
	}
	
	public int getpixel(Optional<SmartPhone>sm) {
		return sm.flatMap(SmartPhone::getFeatures)
				.flatMap(Displayfeatures::getCamera)
				.map(Camera::getPixels)
				.orElse(0);
	}
}
