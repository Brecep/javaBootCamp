
import nLayerApp.buisness.abstracts.ProductService;
import nLayerApp.buisness.conretes.ProductManager;
import nLayerApp.dataAccess.concretes.hibernateProductImpls.HibernateProductRepository;
import nLayerApp.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1, "Tv", 1500, 1);
		Product product2 = new Product(2, "Tv", 1000, 1);
		Product product3 = new Product(3, "Telefon", 2500, 1);
		Product product4 = new Product(4, "Masa", 150, 2);
		Product product5 = new Product(5, "Sandalye", -150, 2);
		Product product6 = new Product(6, "Halý", -250, 2);
		Product product7 = new Product(7, "Sepha", 250, 2);
		Product product8 = new Product(8, "Koltuk", 1150, 2);
		Product product9 = new Product(9, "Dolap", 2150, 2);

		ProductService productService = new ProductManager(new HibernateProductRepository());
		productService.add(product1);
		productService.add(product2);
		productService.add(product3);
		productService.add(product4);
		productService.add(product5);
		productService.add(product6);
		productService.add(product7);
		productService.add(product8);
		productService.add(product9);

		// productService.update(product5);

		for (Product item : productService.getAll()) {
			System.out.println(item.getName());
		}

	}

}
