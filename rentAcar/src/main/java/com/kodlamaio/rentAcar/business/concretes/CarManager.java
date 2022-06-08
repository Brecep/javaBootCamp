package com.kodlamaio.rentAcar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.rentAcar.business.abstracts.CarService;
import com.kodlamaio.rentAcar.business.request.cars.CreateCarRequest;
import com.kodlamaio.rentAcar.business.request.cars.DeleteCarRequest;
import com.kodlamaio.rentAcar.business.request.cars.UpdateCarRequest;
import com.kodlamaio.rentAcar.dataAccess.abstracts.CarRepository;
import com.kodlamaio.rentAcar.entities.concretes.Brand;
import com.kodlamaio.rentAcar.entities.concretes.Car;
import com.kodlamaio.rentAcar.entities.concretes.Color;

@Service
public class CarManager implements CarService {

	private CarRepository carRepository;

	@Autowired
	public CarManager(CarRepository carRepository) {

		this.carRepository = carRepository;
	}

	@Override
	public void add(CreateCarRequest createCarRequest) {
		Car car = new Car();
		car.setDescription(createCarRequest.getDescription());
		car.setDailyPrice(createCarRequest.getDailyPrice());

		Brand brand = new Brand();
		brand.setId(createCarRequest.getBrandId());
		car.setBrand(brand);

		Color color = new Color();
		color.setId(createCarRequest.getColorId());
		car.setColor(color);

		this.carRepository.save(car);
	}

	@Override
	public void delete(DeleteCarRequest deleteCarRequest) {
		int carId = deleteCarRequest.getId();
		this.carRepository.deleteById(carId);

	}

	@Override
	public void update(UpdateCarRequest updateCarRequest) {
		Car carToUpdate = getById(updateCarRequest.getId());

		Brand brand = new Brand();
		brand.setId(updateCarRequest.getBrandId());

		Color color = new Color();
		color.setId(updateCarRequest.getColorId());

		updateCarRequest.setBrandId(brand.getId());
		updateCarRequest.setColorId(color.getId());
		updateCarRequest.setDailyPrice(carToUpdate.getDailyPrice());
		updateCarRequest.setDescription(carToUpdate.getDescription());

	}

	@Override
	public List<Car> getAll() {

		return carRepository.findAll();
	}

	@Override
	public Car getById(int id) {
		Car car = null;
		for (Car item : getAll()) {
			car = item;
		}
		return car;
	}

}
