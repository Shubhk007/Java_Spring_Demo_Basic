package com.spring.di;

public class setterClass {

	private String myName;
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}

	private IMovieReview movie;
	public setterClass() {
	}
	public void setMovie(IMovieReview movie) {
		this.movie = movie;
	}
	
	public String getMovieFortune()
	{
		return movie.movieReview();
	}
	
}
