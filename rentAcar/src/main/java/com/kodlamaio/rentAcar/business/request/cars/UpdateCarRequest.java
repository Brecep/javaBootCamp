package com.kodlamaio.rentAcar.business.request.cars;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCarRequest {
	private String description;
	private double dailyPrice;
	private int brandId;
	private int colorId;
	private int id;
}
