package com.jsp.CloneAPIBookMyShow.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.jsp.CloneAPIBookMyShow.enums.ShowStatus;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class MoviewShow {
	@Id
	private long id;
	private LocalDateTime showStartTime;
	private LocalDateTime showEndTime;
	private ShowStatus showStatus;
	private  String showLocation;
	
	
	private long movieId;
	private String movieName;
    private String genre;
	private LocalTime movieDuration;
	private String movieDescription;
	private String movieLanguage;
	
	private long screenId;
	private String screeName;
	private double classicSeatPrice;
	private double goldSeatPrice;
	private double premiumSeatPrice;

	@ManyToOne
	@JoinColumn
	private Theatre theatre;

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

	public LocalTime getMovieDuration() {
		return movieDuration;
	}

	public void setMovieDuration(LocalTime movieDuration) {
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

	public Theatre getTheatre() {
		return theatre;
	}

	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}

	@Override
	public String toString() {
		return "MoviewShow [id=" + id + ", showStartTime=" + showStartTime + ", showEndTime=" + showEndTime
				+ ", showStatus=" + showStatus + ", showLocation=" + showLocation + ", movieId=" + movieId
				+ ", movieName=" + movieName + ", genre=" + genre + ", movieDuration=" + movieDuration
				+ ", movieDescription=" + movieDescription + ", movieLanguage=" + movieLanguage + ", screenId="
				+ screenId + ", screeName=" + screeName + ", classicSeatPrice=" + classicSeatPrice + ", goldSeatPrice="
				+ goldSeatPrice + ", premiumSeatPrice=" + premiumSeatPrice + ", theatre=" + theatre + "]";
	}
	
	
	
}
