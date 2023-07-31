package com.jsp.CloneAPIBookMyShow.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.jsp.CloneAPIBookMyShow.enums.TicketStatus;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ticketId;
	private double totalPrice;
//TicketStatus
	private TicketStatus ticketStatus;

	@ManyToOne
	private MoviewShow moviewShow;

	@OneToMany
	private List<Booking> bookings;

	@ManyToOne
	@JoinColumn
	private Customer customer;

	public long getTicketId() {
		return ticketId;
	}

	public void setTicketId(long ticketId) {
		this.ticketId = ticketId;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public TicketStatus getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(TicketStatus ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public MoviewShow getMoviewShow() {
		return moviewShow;
	}

	public void setMoviewShow(MoviewShow moviewShow) {
		this.moviewShow = moviewShow;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", totalPrice=" + totalPrice + ", ticketStatus=" + ticketStatus
				+ ", moviewShow=" + moviewShow + ", bookings=" + bookings + ", customer=" + customer + "]";
	}
	
	

}
