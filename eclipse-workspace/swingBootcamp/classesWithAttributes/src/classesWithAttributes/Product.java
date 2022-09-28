package classesWithAttributes;

public class Product {
	public Product(int id, String name, String description, double price, int stockAmount, String color) {
		this.id = id;
		this.color = color;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
	}
	private String name,description, color, code;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	private double price;
	private int id, stockAmount;
	
}
