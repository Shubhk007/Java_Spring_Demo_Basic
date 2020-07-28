package com.spring.di;

public class avengerMovie {
	private movieReviewHelper movieReview;
	avengerMovie(movieReviewHelper movie)
	{
		movieReview= movie;
	}
	public String getMovie()
	{
		return "Avengers are good movies";
	}
	 public String fromDI()
	 {
		 return movieReview.movieReview();
	 }

}
