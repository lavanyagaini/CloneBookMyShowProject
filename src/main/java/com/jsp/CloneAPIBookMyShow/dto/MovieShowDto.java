package com.jsp.CloneAPIBookMyShow.dto;

import java.time.LocalDateTime;

import com.jsp.CloneAPIBookMyShow.enums.ShowStatus;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class MovieShowDto {
	private long id;
	private LocalDateTime showStartTime;
	private LocalDateTime showEndTime;
//	showstatus
	private ShowStatus showStatus;
	private  String showLocation;
	
	
	private long movieId;
	private String movieName;
    private String genre;
	private LocalDateTime movieDuration;
	private String movieDescription;
	private String movieLanguage;
	
	private long screenId;
	private String screeName;
	private double classicSeatPrice;
	private double goldSeatPrice;
	private double premiumSeatPrice;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDateTime getShowStartTime() {
		return showStartTime;
	}
	public void setShowStartTime(LocalDateTime showStartTime) {
		this.showStartTime = showStartTime;
	}
	public LocalDateTime getShowEndTime() {
		return showEndTime;
	}
	public void setShowEndTime(LocalDateTime showEndTime) {
		this.showEndTime = showEndTime;
	}
	public ShowStatus getShowStatus() {
		return showStatus;
	}
	public void setShowStatus(ShowStatus showStatus) {
		this.showStatus = showStatus;
	}
	public String getShowLocation() {
		return showLocation;
	}
	public void setShowLocation(String showLocation) {
		this.showLocation = showLocation;
	}
	public long getMovieId() {
		return movieId;
	}
	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public LocalDateTime getMovieDuration() {
		return movieDuration;
	}
	public void setMovieDuration(LocalDateTime movieDuration) {
		this.movieDuration = movieDuration;
	}
	public String getMovieDescription() {
		return movieDescription;
	}
	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}
	public String getMovieLanguage() {
		return movieLanguage;
	}
	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}
	public long getScreenId() {
		return screenId;
	}
	public void setScreenId(long screenId) {
		this.screenId = screenId;
	}
	public String getScreeName() {
		return screeName;
	}
	public void setScreeName(String screeName) {
		this.screeName = screeName;
	}
	public double getClassicSeatPrice() {
		return classicSeatPrice;
	}
	public void setClassicSeatPrice(double classicSeatPrice) {
		this.classicSeatPrice = classicSeatPrice;
	}
	public double getGoldSeatPrice() {
		return goldSeatPrice;
	}
	public void setGoldSeatPrice(double goldSeatPrice) {
		this.goldSeatPrice = goldSeatPrice;
	}
	public double getPremiumSeatPrice() {
		return premiumSeatPrice;
	}
	public void setPremiumSeatPrice(double premiumSeatPrice) {
		this.premiumSeatPrice = premiumSeatPrice;
	}
	@Override
	public String toString() {
		return "MovieShowDto [id=" + id + ", showStartTime=" + showStartTime + ", showEndTime=" + showEndTime
				+ ", showStatus=" + showStatus + ", showLocation=" + showLocation + ", movieId=" + movieId
				+ ", movieName=" + movieName + ", genre=" + genre + ", movieDuration=" + movieDuration
				+ ", movieDescription=" + movieDescription + ", movieLanguage=" + movieLanguage + ", screenId="
				+ screenId + ", screeName=" + screeName + ", classicSeatPrice=" + classicSeatPrice + ", goldSeatPrice="
				+ goldSeatPrice + ", premiumSeatPrice=" + premiumSeatPrice + "]";
	}
	
	
}
