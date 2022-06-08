package com.kodlamaio.rentAcar.business.abstracts;

import java.util.List;

import com.kodlamaio.rentAcar.business.request.cars.CreateCarRequest;
import com.kodlamaio.rentAcar.business.request.cars.DeleteCarRequest;
import com.kodlamaio.rentAcar.business.request.cars.UpdateCarRequest;
import com.kodlamaio.rentAcar.entities.concretes.Car;

public interface CarService {
	void add(CreateCarRequest createCarRequest);
	void delete(DeleteCarRequest deleteCarRequest);
	void update(UpdateCarRequest updateCarRequest);
	List<Car> getAll();
	Car getById(int id);
}
