package com.kodlamaio.rentAcar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.rentAcar.entities.concretes.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer>{
	//Jpa ile crud işlemlerini kendisi hallediyor
}
