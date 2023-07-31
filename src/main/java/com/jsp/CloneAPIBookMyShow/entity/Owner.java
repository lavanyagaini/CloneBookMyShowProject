package com.jsp.CloneAPIBookMyShow.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Owner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ownerId;
	private String ownerName;
	private long ownerPhoneNumber;
	private String ownerEmail;
	private String ownerPassword;

	@OneToMany(mappedBy = "owner")
	@JsonIgnore
	private List<ProductionHouse> houses;

	@OneToMany(mappedBy = "owner")
	@JsonIgnore
	private List<Theatre> theatres;

	public long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public long getOwnerPhoneNumber() {
		return ownerPhoneNumber;
	}

	public void setOwnerPhoneNumber(long ownerPhoneNumber) {
		this.ownerPhoneNumber = ownerPhoneNumber;
	}

	public String getOwnerEmail() {
		return ownerEmail;
	}

	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}

	public String getOwnerPassword() {
		return ownerPassword;
	}

	public void setOwnerPassword(String ownerPassword) {
		this.ownerPassword = ownerPassword;
	}

	public List<ProductionHouse> getHouses() {
		return houses;
	}

	public void setHouses(List<ProductionHouse> houses) {
		this.houses = houses;
	}

	public List<Theatre> getTheatres() {
		return theatres;
	}

	public void setTheatres(List<Theatre> theatres) {
		this.theatres = theatres;
	}

	@Override
	public String toString() {
		return "Owner [ownerId=" + ownerId + ", ownerName=" + ownerName + ", ownerPhoneNumber=" + ownerPhoneNumber
				+ ", ownerEmail=" + ownerEmail + ", ownerPassword=" + ownerPassword + ", houses=" + houses
				+ ", theatres=" + theatres + "]";
	}
	
	

}
