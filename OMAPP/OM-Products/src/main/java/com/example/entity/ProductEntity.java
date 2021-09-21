package com.example.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
public ProductEntity() {
	
}
   public ProductEntity(int id, String name,int price) {
	super();
	this.id = id;
	this.price = price;
	this.name = name;
}
private int price;
	public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
	private String name;

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
}