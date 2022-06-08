package com.kodlamaio.rentAcar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.rentAcar.business.abstracts.BrandService;
import com.kodlamaio.rentAcar.business.request.brands.CreateBrandRequest;
import com.kodlamaio.rentAcar.business.request.brands.DeleteBrandRequest;
import com.kodlamaio.rentAcar.business.request.brands.UpdateBrandRequest;
import com.kodlamaio.rentAcar.dataAccess.abstracts.BrandRepository;
import com.kodlamaio.rentAcar.entities.concretes.Brand;

//
@Service
public class BrandManager implements BrandService {
	private BrandRepository brandRepository;

	@Autowired
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}

	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		Brand brand = new Brand();
		brand.setName(createBrandRequest.getName());

		this.brandRepository.save(brand);

	}

	@Override
	public void delete(DeleteBrandRequest deleteBrandRequest) {
		int brandId = deleteBrandRequest.getId();
		this.brandRepository.deleteById(brandId);

	}

	@Override
	public void update(UpdateBrandRequest updateBrandRequest) {
		Brand brandToUpdate = getById(updateBrandRequest.getId());
		brandToUpdate.setName(updateBrandRequest.getName());
		this.brandRepository.save(brandToUpdate);

	}

	@Override
	public List<Brand> getAll() {

		return brandRepository.findAll();// listi bul
	}

	@Override
	public Brand getById(int id) {
		Brand brand = null;
		for (Brand item : getAll()) {
			brand = item;
		}
		return brand;
	}

}
