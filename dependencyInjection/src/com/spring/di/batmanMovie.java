package com.spring.di;

public class batmanMovie {
	private movieReviewHelper movie;
	public batmanMovie(movieReviewHelper movieHelper) {
			movie= movieHelper;
	}
	public String getMovie()
	{
		return "Batman is best";
	}
	public String fromDI()
	{
		return movie.movieReview();
	}

}
