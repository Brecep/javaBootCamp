package com.kodlamaio.rentAcar.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.rentAcar.business.abstracts.ColorService;
import com.kodlamaio.rentAcar.business.request.colors.CreateColorRequest;
import com.kodlamaio.rentAcar.business.request.colors.DeleteColorRequest;
import com.kodlamaio.rentAcar.business.request.colors.UpdateColorRequest;
import com.kodlamaio.rentAcar.entities.concretes.Color;

@RestController
@RequestMapping("/api/colors")
public class ColorsController {
	private ColorService colorService;

	public ColorsController(ColorService colorService) {
		super();
		this.colorService = colorService;
	}

	@PostMapping("/add")
	public void add(@RequestBody CreateColorRequest createColorRequest) {
		this.colorService.add(createColorRequest);
	}

	@PostMapping("/update")
	public void update(@RequestBody UpdateColorRequest updateColorRequest) {
		this.colorService.update(updateColorRequest);
	}

	@PostMapping("/delete")
	public void delete(@RequestBody DeleteColorRequest deleteColorRequest) {
		this.colorService.delete(deleteColorRequest);
	}

	@GetMapping("/getall")
	public List<Color> getAll() {
		return this.colorService.getAll();
	}

	@GetMapping("getByBrandId")
	public Color getById(int id) {
		return this.colorService.getById(id);
	}
}
