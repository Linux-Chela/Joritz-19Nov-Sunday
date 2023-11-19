package com.ltim.joritz.marketplace.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltim.joritz.marketplace.model.ReviewRatingModel;
import com.ltim.joritz.marketplace.repository.ReviewRatingRepository;

@Service
public class ReviewRatingService {
	
	@Autowired
	public ReviewRatingRepository reviewRatingRepository;
	
	public ReviewRatingModel createReviewRating(ReviewRatingModel reviewRating) {
		return reviewRatingRepository.save(reviewRating);
	}
	
	public List<ReviewRatingModel> getAllReviewRating(){
		System.out.println("Displaying All Reviews and Ratings...");
		return reviewRatingRepository.findAll();
	}
	
	public Optional<ReviewRatingModel> getReviewRating(int rId){
		System.out.println("Displaying Single Review and Rating...");
		return reviewRatingRepository.findById(rId);
	}

}
