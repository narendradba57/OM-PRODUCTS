package com.example.dto;

public class Order {
	private int id;
	private String title;
	private String quantity;
	private Product product;
	private int productId;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public Order() {
		
	}
	public Order(int id, String title, String quantity,Product product,int totalPrice) {
		super();
		this.id = id;
		this.title = title;
		this.quantity = quantity;
		this.product=product;
		this.totalPrice = totalPrice;
	}
	public Order(int id, String title, Product product ) {
		super();
		this.id = id;
		this.title = title;
		this.product=product;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	private int totalPrice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

}
