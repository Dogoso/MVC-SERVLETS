package com.doglab.actions;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface Action {

	public String exec(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException;
	
}
