package nLayerApp.buisness.abstracts;

import nLayerApp.entities.concretes.Product;

public interface ProductCheckService {
	boolean checkIfProductNameExists(String productName);

	boolean checkIfProductPriceZeroToSmall(Product productUnitPrice);

	int checkIfProductCategoryIsOver(Product productCategory);
}
