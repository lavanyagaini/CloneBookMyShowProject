package com.jsp.CloneAPIBookMyShow.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TheatreDto {
	private long theatreId;
	private String theatreName;
	public long getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(long theatreId) {
		this.theatreId = theatreId;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	@Override
	public String toString() {
		return "TheatreDto [theatreId=" + theatreId + ", theatreName=" + theatreName + "]";
	}
	
	
}
