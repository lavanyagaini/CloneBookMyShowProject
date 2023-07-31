package com.jsp.CloneAPIBookMyShow.dto;

import java.time.LocalDateTime;

import com.jsp.CloneAPIBookMyShow.enums.BookingStatus;
import com.jsp.CloneAPIBookMyShow.enums.SeatType;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class BookingDto {
	private long bookingId;
	private LocalDateTime bookingFromTime;
	private LocalDateTime bookingTillTime;
	private long seatId;
//	SEATTYPE
	private SeatType seatType;
//	bookingstatus
	private BookingStatus bookingStatus;
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
	public BookingStatus getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(BookingStatus bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public double getSeatprice() {
		return seatprice;
	}
	public void setSeatprice(double seatprice) {
		this.seatprice = seatprice;
	}
	@Override
	public String toString() {
		return "BookingDto [bookingId=" + bookingId + ", bookingFromTime=" + bookingFromTime + ", bookingTillTime="
				+ bookingTillTime + ", seatId=" + seatId + ", seatType=" + seatType + ", bookingStatus=" + bookingStatus
				+ ", seatprice=" + seatprice + "]";
	}
	
	
}
