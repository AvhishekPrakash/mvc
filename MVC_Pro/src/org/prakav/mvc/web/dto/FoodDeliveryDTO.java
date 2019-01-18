package org.prakav.mvc.web.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="FOOD")
public class FoodDeliveryDTO {
	@Id
	@GenericGenerator(name="avhi", strategy ="increment")
	@GeneratedValue(generator="avhi")
	@Column
	private int fid;
	@Column
	private String foodType;
	@Column
	private String foodName;
	@Column
	private String location;
	@Column
	private int quantity;
	@Column
	private String paymentMode;
	@Column
	private double totalPrice;

	public FoodDeliveryDTO() {
		System.out.println("Created.." + this.getClass().getSimpleName());

	}

	@Override
	public String toString() {
		return "FoodDeliveryDTO [fid=" + fid + ", foodType=" + foodType + ", foodName=" + foodName + ", location="
				+ location + ", quantity=" + quantity + ", paymentMode=" + paymentMode + ", totalPrice=" + totalPrice
				+ "]";
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getPaymentMode() {
		return paymentMode;
	}
}
