package com.jsp.CloneAPIBookMyShow.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.CloneAPIBookMyShow.entity.MoviewShow;
import com.jsp.CloneAPIBookMyShow.repository.MovieShowRepo;

@Repository
public class MovieShowDao {

	@Autowired
	private MovieShowRepo repo;

	public MoviewShow addShow(MoviewShow moviewShow) {
	
		return repo.save(moviewShow);
	}

	public MoviewShow updateShow(long showId, MoviewShow moviewShow) {
	Optional<MoviewShow> optional=repo.findById(showId);
	if(optional.isPresent()) {
		moviewShow.setId(showId);
		moviewShow.setTheatre(optional.get().getTheatre());
		moviewShow.setMovieId(showId);;
		moviewShow.setMovieName(optional.get().getMovieName());
		moviewShow.setMovieLanguage(optional.get().getMovieLanguage());
		moviewShow.setMovieDescription(optional.get().getMovieDescription());
		moviewShow.setMovieDuration(optional.get().getMovieDuration());
		
		return repo.save(moviewShow);
	}
		return null;
	}

	public MoviewShow getShowById(long showId) {
	Optional<MoviewShow> optional=repo.findById(showId);
	if(optional.isPresent()) {
		return optional.get();
	}
		return null;
	}

	public MoviewShow deleteShowById(long showId) {
		
		Optional<MoviewShow> optional=repo.findById(showId);
		if(optional.isPresent()) {
			MoviewShow moviewShow=optional.get();
			repo.delete(moviewShow);
			return optional.get();
		}
			return null;
	}
}
