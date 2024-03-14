package com.bijoymogor.trendwave.service;

import com.bijoymogor.trendwave.exception.ProductException;
import com.bijoymogor.trendwave.modal.Cart;
import com.bijoymogor.trendwave.modal.CartItem;
import com.bijoymogor.trendwave.modal.User;
import com.bijoymogor.trendwave.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
