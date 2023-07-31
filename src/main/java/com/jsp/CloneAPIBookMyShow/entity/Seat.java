package com.jsp.CloneAPIBookMyShow.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jsp.CloneAPIBookMyShow.enums.SeatType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Seat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long seatId;
//SeatType
	private SeatType seatType;
	@ManyToOne
	@JoinColumn
	@JsonIgnore
	private Screen screen;
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
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", seatType=" + seatType + ", screen=" + screen + "]";
	}
	
	
}
