package com.kodlamaio.rentAcar.business.abstracts;

import java.util.List;

import com.kodlamaio.rentAcar.business.request.brands.CreateBrandRequest;
import com.kodlamaio.rentAcar.business.request.brands.DeleteBrandRequest;
import com.kodlamaio.rentAcar.business.request.brands.UpdateBrandRequest;
import com.kodlamaio.rentAcar.entities.concretes.Brand;

public interface BrandService {
	void add(CreateBrandRequest createBrandRequest);// request

	void delete(DeleteBrandRequest deleteBrandRequest);

	void update(UpdateBrandRequest updateBrandRequest);

	List<Brand> getAll();

	Brand getById(int id);
}
