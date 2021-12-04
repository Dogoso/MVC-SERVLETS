package com.doglab.actions;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginAction implements Action{

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		return "foward:Login.jsp";
	}

}
