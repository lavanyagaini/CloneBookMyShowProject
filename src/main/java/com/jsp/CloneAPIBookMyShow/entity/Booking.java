package com.jsp.CloneAPIBookMyShow.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.jsp.CloneAPIBookMyShow.enums.BookingStatus;
import com.jsp.CloneAPIBookMyShow.enums.SeatType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long bookingId;
	private LocalDateTime bookingFromTime;
	private LocalDateTime bookingTillTime;
	private long seatId;
//	SeatType
	private SeatType seatType;
//	bookingstatus
	private BookingStatus  status;
	private double seatprice;
	public long getBookingId() {
		return bookingId;
	}
	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}
	public LocalDateTime getBookingFromTime() {
		return bookingFromTime;
	}
	public void setBookingFromTime(LocalDateTime bookingFromTime) {
		this.bookingFromTime = bookingFromTime;
	}
	public LocalDateTime getBookingTillTime() {
		return bookingTillTime;
	}
	public void setBookingTillTime(LocalDateTime bookingTillTime) {
		this.bookingTillTime = bookingTillTime;
	}
	public long getSeatId() {
		return seatId;
	}
	public void setSeatId(long seatId) {
		this.seatId = seatId;
	}
	public SeatType getSeatType() {
		return seatType;
	}
	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}
	public BookingStatus getStatus() {
		return status;
	}
	public void setStatus(BookingStatus status) {
		this.status = status;
	}
	public double getSeatprice() {
		return seatprice;
	}
	public void setSeatprice(double seatprice) {
		this.seatprice = seatprice;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingFromTime=" + bookingFromTime + ", bookingTillTime="
				+ bookingTillTime + ", seatId=" + seatId + ", seatType=" + seatType + ", status=" + status
				+ ", seatprice=" + seatprice + "]";
	}
	
	

}
