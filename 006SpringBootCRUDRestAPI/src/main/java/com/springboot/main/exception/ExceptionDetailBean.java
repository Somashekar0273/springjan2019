package com.springboot.main.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionDetailBean {
	
	private Date timeStamp;
	private String message;
	private String exceptionDetail;
	
	

}
