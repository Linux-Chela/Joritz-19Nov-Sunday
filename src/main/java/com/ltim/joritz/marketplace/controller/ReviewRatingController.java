package com.ltim.joritz.marketplace.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltim.joritz.marketplace.model.ReviewRatingModel;
import com.ltim.joritz.marketplace.service.ReviewRatingService;

@RestController
@RequestMapping("/marketplace")
public class ReviewRatingController {
	
	@Autowired
	ReviewRatingService reviewRatingService;
	
	
	@PostMapping("reviewrating/create")
	public ReviewRatingModel createReviewRating(@RequestBody ReviewRatingModel reviewRating) {
		System.out.println("Creating Review and Rating...");
		return reviewRatingService.createReviewRating(reviewRating);
	}
	
	@GetMapping("reviewrating/getall")
	public List<ReviewRatingModel> getAllReviewRating(){
		System.out.println("Displaying All Reviews and Ratings");
		return reviewRatingService.getAllReviewRating();
	}
	
	@GetMapping("reviewrating/getreviewrating/{rId}")
	public Optional<ReviewRatingModel> getReviewRating(int rId){
		System.out.println("Displaying Single Review and Rating");
		return reviewRatingService.getReviewRating(rId);
	}

}
