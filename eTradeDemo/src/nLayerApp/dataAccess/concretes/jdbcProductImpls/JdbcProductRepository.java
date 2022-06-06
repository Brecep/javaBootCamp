package nLayerApp.dataAccess.concretes.jdbcProductImpls;

import java.util.ArrayList;
import java.util.List;

import nLayerApp.dataAccess.abstracts.ProductRepository;
import nLayerApp.entities.concretes.Product;

public class JdbcProductRepository implements ProductRepository {
	
	List<Product> products=new ArrayList<Product>();
	@Override
	public void add(Product product) {
		products.add(product);
		System.out.println("JDBC teknolojisiyle eklendi ve çalýþýyor");

	}

	@Override
	public void delete(Product product) {
		products.remove(product);
		System.out.println("JDBC ile silindi...");
	}

	@Override
	public void update(Product product) {
		Product productToUpdate = getById(product.getId());
		productToUpdate.setName(product.getName());
		productToUpdate.setCategoryId(product.getCategoryId());
		productToUpdate.setUnitPrice(product.getUnitPrice());
		System.out.println("JDBC ile güncellendi...");

	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product getById(int id) {
		Product productToFind=null;
		for (Product item : products) {
			if(item.getId()==id)
				productToFind=item;
		}
		return productToFind;
	}

}
