package com.greatlearning.assignment1.controller.response;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class MyResponse {
		
		private String message;
		private boolean status;
		private HttpStatus statuscode;
		
		public MyResponse()
		{
			message="not successful";
			status=false;
			statuscode=HttpStatus.INTERNAL_SERVER_ERROR;
		}
	
	
}
