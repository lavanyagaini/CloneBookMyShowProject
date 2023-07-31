package com.jsp.CloneAPIBookMyShow.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.jsp.CloneAPIBookMyShow.enums.Genre;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long movieId;
	private String movieName;
//	genresss
	private Genre genre1;
	private Genre genre2;
	private Genre genre3;
	@DateTimeFormat(style = "HH:mm")
	private LocalTime movieDuration;
	private String moviedescription;
	private String language;
	@ManyToOne
	@JsonIgnore
	@JoinColumn
	private ProductionHouse productionHouse;
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
	public Genre getGenre1() {
		return genre1;
	}
	public void setGenre1(Genre genre1) {
		this.genre1 = genre1;
	}
	public Genre getGenre2() {
		return genre2;
	}
	public void setGenre2(Genre genre2) {
		this.genre2 = genre2;
	}
	public Genre getGenre3() {
		return genre3;
	}
	public void setGenre3(Genre genre3) {
		this.genre3 = genre3;
	}
	public LocalTime getMovieDuration() {
		return movieDuration;
	}
	public void setMovieDuration(LocalTime movieDuration) {
		this.movieDuration = movieDuration;
	}
	public String getMoviedescription() {
		return moviedescription;
	}
	public void setMoviedescription(String moviedescription) {
		this.moviedescription = moviedescription;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public ProductionHouse getProductionHouse() {
		return productionHouse;
	}
	public void setProductionHouse(ProductionHouse productionHouse) {
		this.productionHouse = productionHouse;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", genre1=" + genre1 + ", genre2=" + genre2
				+ ", genre3=" + genre3 + ", movieDuration=" + movieDuration + ", moviedescription=" + moviedescription
				+ ", language=" + language + ", productionHouse=" + productionHouse + "]";
	}
	
	
	
}
