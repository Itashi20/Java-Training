package com.service;

import com.model.Restaurant;

public class GuestSeerviceImpl implements GuestService {
private Restaurant restaurant;
	

	public GuestSeerviceImpl(Restaurant restaurant) {
		super();
		this.restaurant = restaurant;
	}


	@Override
	public String inRoomDining(String order) {
		 
		return restaurant.PrepareDish(order);
	}
}
