package com.bijoymogor.trendwave.service;

import java.util.List;

import com.bijoymogor.trendwave.exception.ProductException;
import com.bijoymogor.trendwave.modal.Review;
import com.bijoymogor.trendwave.modal.User;
import com.bijoymogor.trendwave.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
