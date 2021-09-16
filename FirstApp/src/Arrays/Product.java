package Arrays;

public class Product {
	private int productID;
	private String productName;
	private int productPrice;
	public Product(int productID, String productName, int productPrice) {
		
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}
	
		
	

}
