//Name: Necati
//Surname: Koçak
//Student ID: 150120053

public class Product {
	private String productName;
	private java.util.Calendar salesDate;
	private double price;

	public Product(String sName, java.util.Calendar sDate, double price) {
		this.productName = sName;
		this.salesDate = sDate;
		this.price = price;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductName() {
		return productName;
	}

	public void setSalesDate(java.util.Calendar salesDate) {
		this.salesDate = salesDate;
	}

	public java.util.Calendar getSalesDate() {
		return salesDate;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", salesDate=" + salesDate + ", price=" + price + "]";
	}

}
