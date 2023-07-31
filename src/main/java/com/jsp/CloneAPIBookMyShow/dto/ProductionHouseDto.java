package com.jsp.CloneAPIBookMyShow.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductionHouseDto {
	private long productionId;
	private String productionName;
	private LocalDate establishment;
	public long getProductionId() {
		return productionId;
	}
	public void setProductionId(long productionId) {
		this.productionId = productionId;
	}
	public String getProductionName() {
		return productionName;
	}
	public void setProductionName(String productionName) {
		this.productionName = productionName;
	}
	public LocalDate getEstablishment() {
		return establishment;
	}
	public void setEstablishment(LocalDate establishment) {
		this.establishment = establishment;
	}
	@Override
	public String toString() {
		return "ProductionHouseDto [productionId=" + productionId + ", productionName=" + productionName
				+ ", establishment=" + establishment + "]";
	}
	
	
}
