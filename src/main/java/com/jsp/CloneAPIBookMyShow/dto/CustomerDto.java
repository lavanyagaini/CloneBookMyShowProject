package com.jsp.CloneAPIBookMyShow.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDto {
	private long customerId;
	private String customerName;
	@Min(600000001)
	@Max(999999999)
	private long customerPhone;
	private String customerEmail;
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(long customerPhone) {
		this.customerPhone = customerPhone;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	@Override
	public String toString() {
		return "CustomerDto [customerId=" + customerId + ", customerName=" + customerName + ", customerPhone="
				+ customerPhone + ", customerEmail=" + customerEmail + "]";
	}
	
	
	
}
