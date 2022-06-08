package com.kodlamaio.rentAcar.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.rentAcar.business.abstracts.BrandService;
import com.kodlamaio.rentAcar.business.request.brands.CreateBrandRequest;
import com.kodlamaio.rentAcar.business.request.brands.DeleteBrandRequest;
import com.kodlamaio.rentAcar.business.request.brands.UpdateBrandRequest;
import com.kodlamaio.rentAcar.entities.concretes.Brand;

@RestController // annotationlar imza gibidir sınıf nesne özelliklerde kullanılır
@RequestMapping("/api/brands")
public class BrandsController { // endpoint bize bağlanmak isteyen kişi tarayısında

	private BrandService brandService;

	public BrandsController(BrandService brandService) {
		super();
		this.brandService = brandService;
	}

	@GetMapping("/sayHello")
	public String sayHello() {

		return "Hello Spring";
	}

	@PostMapping("/add")
	public void add(@RequestBody CreateBrandRequest createBrandRequest) {
		this.brandService.add(createBrandRequest);
	}
	@PostMapping("/update")
	public void update(@RequestBody UpdateBrandRequest updateBrandRequest) {
		this.brandService.update(updateBrandRequest);
	}
	@PostMapping("/delete")
	public void delete (@RequestBody DeleteBrandRequest deleteBrandRequest) {
		this.brandService.delete(deleteBrandRequest);
	}
	@GetMapping("/getall")
	public List<Brand> getAll() {
		return this.brandService.getAll();
	}
	@GetMapping("getByBrandId")
	public Brand getById(int id) {
		return this.brandService.getById(id);
	}
}
