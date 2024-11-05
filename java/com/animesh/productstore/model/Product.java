package com.animesh.productstore.model;

import java.util.Date;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity //This class represents an object or row in the database
@Table(name="products") //Defining the name of the table
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
    private String name;
    private double price;
    private String brand;
    private String modelNumber;
	private String color;
    private int warranty;
    private double batteryLife;
    private double rating;
    
    @Column(columnDefinition = "TEXT")//This annotation shows that the below column
    //has TEXT data type otherwise database will assume as VARCHAR
    private String imgName;
    private Date manufacturedDate;
    
    
    //default Constructor
   /* public Product() {  	
    }
    
    //Parameterized Constructor with id
    public Product(int id, String name, double price, String brand, String modelNumber, String color, int warranty,
			double batteryLife, double rating,String imgName, Date manufacturedDate) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.modelNumber = modelNumber;
		this.color = color;
		this.warranty = warranty;
		this.batteryLife = batteryLife;
		this.rating = rating;
		this.imgName = imgName;
		this.manufacturedDate = manufacturedDate;
	}
    
    //Parameterized Constructor without id
    public Product(String name, double price, String brand, String modelNumber, String color, int warranty,
    		double batteryLife, double rating,String imgName, Date manufacturedDate) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.modelNumber = modelNumber;
        this.color = color;
        this.warranty = warranty;
        this.batteryLife = batteryLife;
        this.rating = rating;
        this.imgName = imgName;
		this.manufacturedDate = manufacturedDate;
    }*/

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	public double getBatteryLife() {
		return batteryLife;
	}

	public void setBatteryLife(double batteryLife) {
		this.batteryLife = batteryLife;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getImgName() {
		return imgName;
	}

	public void setImgName(String imgName) {
		this.imgName = imgName;
	}

	public Date getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

}
