package com.automobiles.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bike_details")
public class Bike {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String brand;
	private int price;
	private String color;
	private int cc;
	private int mileage;
	private String noPlate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public String getNoPlate() {
		return noPlate;
	}
	public void setNoPlate(String noPlate) {
		this.noPlate = noPlate;
	}
	public Bike(int id, String brand, int price, String color, int cc, int mileage, String noPlate) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.cc = cc;
		this.mileage = mileage;
		this.noPlate = noPlate;
	}
	@Override
	public String toString() {
		return "Bike [id=" + id + ", brand=" + brand + ", price=" + price + ", color=" + color + ", cc=" + cc
				+ ", mileage=" + mileage + ", noplate=" + noPlate + "]";
	}
	
	public Bike() {
		super();
	}
	
}
