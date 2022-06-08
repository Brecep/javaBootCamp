package com.kodlamaio.rentAcar.business.request.cars;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateCarRequest {
	private String description;
	private double dailyPrice;
	private int brandId;
	private int colorId;
	
	
}
