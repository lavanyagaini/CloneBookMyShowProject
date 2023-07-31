package com.jsp.CloneAPIBookMyShow.dto;

import com.jsp.CloneAPIBookMyShow.enums.TicketStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TicketDto {
	private long ticketId;
	private double totalPrice;
	//TicketStatus
	private TicketStatus ticketStatus;
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
	@Override
	public String toString() {
		return "TicketDto [ticketId=" + ticketId + ", totalPrice=" + totalPrice + ", ticketStatus=" + ticketStatus
				+ "]";
	} 
	
	
}
