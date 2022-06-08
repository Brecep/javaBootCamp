package com.kodlamaio.rentAcar.business.abstracts;

import java.util.List;

import com.kodlamaio.rentAcar.business.request.colors.CreateColorRequest;
import com.kodlamaio.rentAcar.business.request.colors.DeleteColorRequest;
import com.kodlamaio.rentAcar.business.request.colors.UpdateColorRequest;
import com.kodlamaio.rentAcar.entities.concretes.Color;

public interface ColorService {
	void add(CreateColorRequest createColorRequest);//request color 
	void delete(DeleteColorRequest deleteColorRequest);
	void update(UpdateColorRequest updateColorRequest);
	List<Color> getAll();
	Color getById(int id);
}
