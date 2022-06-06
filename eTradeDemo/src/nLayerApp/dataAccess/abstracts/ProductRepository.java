package nLayerApp.dataAccess.abstracts;

import java.util.List;

import nLayerApp.entities.concretes.Product;

public interface ProductRepository {
	void add(Product product);
	void delete(Product product);
	void update(Product product);
	List<Product> getAll();
	Product getById(int id);
}	
