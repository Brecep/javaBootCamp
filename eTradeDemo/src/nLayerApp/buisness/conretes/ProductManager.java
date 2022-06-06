package nLayerApp.buisness.conretes;

import java.util.List;

import nLayerApp.buisness.abstracts.ProductCheckService;
import nLayerApp.buisness.abstracts.ProductService;
import nLayerApp.dataAccess.abstracts.ProductRepository;
import nLayerApp.entities.concretes.Product;

public class ProductManager implements ProductService, ProductCheckService {

	private ProductRepository productRepository;

	public ProductManager(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public void add(Product product) {
		if (!checkIfProductNameExists(product.getName()) && !checkIfProductPriceZeroToSmall(product)
				&& checkIfProductCategoryIsOver(product) < 5)
			productRepository.add(product);
		else
			System.out.println("Girdiðiniz Bilgiler Hatalýdýr");
	}

	@Override
	public void delete(Product product) {
		productRepository.delete(getById(product.getId()));
	}

	@Override
	public void update(Product product) {
		productRepository.update(product);
	}

	@Override
	public List<Product> getAll() {

		return productRepository.getAll();
	}

	@Override
	public Product getById(int id) {
		Product product = productRepository.getById(id);
		return product;
	}

	@Override
	public boolean checkIfProductNameExists(String productName) {
		boolean exists = false;
		for (Product item : productRepository.getAll()) {
			if (item.getName() == productName)
				exists = true;
		}
		return exists;
	}

	@Override
	public boolean checkIfProductPriceZeroToSmall(Product productUnitPrice) {
		boolean lessThanZero = false;
		if (productUnitPrice.getUnitPrice() <= 0) {
			lessThanZero = true;
			System.out.println("Fiyat sýfýrdan küçük girilemez.");
		}
		return lessThanZero;
	}

	@Override
	public int checkIfProductCategoryIsOver(Product productCategory) {
		int counter = 0;
		for (Product item : productRepository.getAll()) {
			if (item.getCategoryId() == productCategory.getCategoryId())
				counter++;
		}
		return counter;
	}
}
