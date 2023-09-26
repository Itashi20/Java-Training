

package com.guest;

import com.model.AmericanRestaurant;
import com.model.IndianRestaurant;
import com.service.GuestService;
import com.service.LaunderyService;
import com.service.GuestSeerviceImpl;
import com.service.LaundaryServiceImpl;

public class guest {

	public static void main(String[] args) {
		 
		GuestService service= new GuestSeerviceImpl(new IndianRestaurant());
		System.out.println(service.inRoomDining("fries"));
		
		LaunderyService laun=new LaundaryServiceImpl();
		System.out.println(laun.isAvailable(false )+"Service Unavailable");
		
	}

}
