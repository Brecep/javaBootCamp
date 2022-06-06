package nLayerApp.entities.concretes;

public class Product {
	private int id;
	private String name;
	private double unitPrice;
	private int categoryId;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, double unitPrice, int categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.categoryId = categoryId;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int category) {
		this.categoryId = category;
	}

}
