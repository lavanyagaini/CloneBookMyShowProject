package com.jsp.CloneAPIBookMyShow.dto;

import com.jsp.CloneAPIBookMyShow.enums.SeatType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SeatDto {
	private long seatId;
	//SeatType
	private SeatType seatType;
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
	@Override
	public String toString() {
		return "SeatDto [seatId=" + seatId + ", seatType=" + seatType + "]";
	}
	
	
}
