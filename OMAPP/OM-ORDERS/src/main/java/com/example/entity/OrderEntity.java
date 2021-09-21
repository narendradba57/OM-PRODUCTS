package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Orders")
public class OrderEntity {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="title")
	private String title;
	@Column(name="quantity")
	private String quantity;
	@Column(name="productId")
	private int productId;
	public OrderEntity() {
		
	}
	public OrderEntity(String title, int productId,String quantity,int totalPrice) {
		super();
		this.title = title;
		this.productId=productId;
		this.quantity = quantity;
		this.totalPrice=totalPrice;
	}
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
	@Column(name="total_price")
	private int totalPrice;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
}
