package nLayerApp.dataAccess.concretes.hibernateProductImpls;

import java.util.ArrayList;
import java.util.List;

import nLayerApp.dataAccess.abstracts.ProductRepository;
import nLayerApp.entities.concretes.Product;

public class HibernateProductRepository implements ProductRepository {

	List<Product> products = new ArrayList<Product>();

	@Override
	public void add(Product product) {
		System.out.println("Hibernate ile eklendi...");
		products.add(product);
	}

	@Override
	public void delete(Product product) {
		products.remove(product);
		System.out.println("Hibernate ile silindi...");
	}

	@Override
	public void update(Product product) {
		Product productToUpdate = getById(product.getId());
		productToUpdate.setName(product.getName());
		productToUpdate.setCategoryId(product.getCategoryId());
		productToUpdate.setUnitPrice(product.getUnitPrice());
		System.out.println("Hibernate ile güncellendi...");
	}

	@Override
	public List<Product> getAll() {

		return products;
	}

	@Override
	public Product getById(int id) {
		Product productToFind = null;
		for (Product item : products) {
			if (item.getId() == id)
				productToFind = item;
		}

		return productToFind;
	}

}
