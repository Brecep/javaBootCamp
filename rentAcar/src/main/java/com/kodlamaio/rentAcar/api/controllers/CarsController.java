package com.kodlamaio.rentAcar.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.rentAcar.business.abstracts.CarService;
import com.kodlamaio.rentAcar.business.request.cars.CreateCarRequest;
import com.kodlamaio.rentAcar.business.request.cars.DeleteCarRequest;
import com.kodlamaio.rentAcar.business.request.cars.UpdateCarRequest;
import com.kodlamaio.rentAcar.entities.concretes.Car;

@RestController
@RequestMapping("/api/cars")
public class CarsController {

	private CarService carService;

	public CarsController(CarService carService) {
		super();
		this.carService = carService;
	}

	@PostMapping("/add")
	public void add(@RequestBody CreateCarRequest createCarRequest) {
		this.carService.add(createCarRequest);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody UpdateCarRequest updateCarRequest) {
		this.carService.update(updateCarRequest);
	}

	@PostMapping("/delete")
	public void delete(@RequestBody DeleteCarRequest deleteCarRequest) {
		this.carService.delete(deleteCarRequest);
	}

	@GetMapping("/getall")
	public List<Car> getAll() {
		return this.carService.getAll();
	}

	@GetMapping("getByBrandId")
	public Car getById(int id) {
		return this.carService.getById(id);
	}
	//3 nesne içinde insert update delete listall ve getby id 1 numaralı ver dediğinde versin
}
