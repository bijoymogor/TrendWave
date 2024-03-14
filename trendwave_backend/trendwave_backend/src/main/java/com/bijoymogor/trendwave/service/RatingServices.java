package com.bijoymogor.trendwave.service;

import java.util.List;

import com.bijoymogor.trendwave.exception.ProductException;
import com.bijoymogor.trendwave.modal.Rating;
import com.bijoymogor.trendwave.modal.User;
import com.bijoymogor.trendwave.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
