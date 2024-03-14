package com.bijoymogor.trendwave.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bijoymogor.trendwave.response.ApiResponse;

@RestController
public class HomeController {

	@GetMapping("/")
	public ResponseEntity<ApiResponse> homeController(){
		
		ApiResponse res=new ApiResponse("Welcome To Trendwave", true);
		
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
}
