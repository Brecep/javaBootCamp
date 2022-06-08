package com.kodlamaio.rentAcar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodlamaio.rentAcar.business.abstracts.ColorService;
import com.kodlamaio.rentAcar.business.request.colors.CreateColorRequest;
import com.kodlamaio.rentAcar.business.request.colors.DeleteColorRequest;
import com.kodlamaio.rentAcar.business.request.colors.UpdateColorRequest;
import com.kodlamaio.rentAcar.dataAccess.abstracts.ColorRepository;
import com.kodlamaio.rentAcar.entities.concretes.Color;

@Service
public class ColorManager implements ColorService {
	private ColorRepository colorRepository;

	@Autowired
	public ColorManager(ColorRepository colorRepository) {
		super();
		this.colorRepository = colorRepository;
	}

	@Override
	public void add(CreateColorRequest createColorRequest) {
		Color color = new Color();
		color.setName(createColorRequest.getName());
		this.colorRepository.save(color);
	}

	@Override
	public void delete(DeleteColorRequest deleteColorRequest) {
		int colorId = deleteColorRequest.getId();
		this.colorRepository.deleteById(colorId);

	}

	@Override
	public void update(UpdateColorRequest updateColorRequest) {
		Color colorToUpdate = getById(updateColorRequest.getId());
		updateColorRequest.setName(colorToUpdate.getName());

	}

	@Override
	public List<Color> getAll() {

		return colorRepository.findAll();
	}

	@Override
	public Color getById(int id) {
		Color color = null;
		for (Color item : getAll()) {
			color = item;
		}
		return color;
	}

}
