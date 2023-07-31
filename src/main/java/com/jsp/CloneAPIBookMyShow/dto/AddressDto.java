package com.jsp.CloneAPIBookMyShow.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDto {
	private long addressId;
	
	private int flatNo;
	@NotNull(message = "Area can't be null")
	@NotBlank(message = "Area cant be blank")
	private String area;
	@NotNull(message = "Landamrak can't be null")
	@NotBlank(message = "alandmark cant be blank")
	private String landmark;
	private String city;
	private String state;
	private String country;
	private long pincode;
	public long getAddressId() {
		return addressId;
	}
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	public int getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "AddressDto [addressId=" + addressId + ", flatNo=" + flatNo + ", area=" + area + ", landmark=" + landmark
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
	}
	
	
}
