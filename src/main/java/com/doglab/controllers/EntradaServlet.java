package com.doglab.controllers;

import java.io.IOException;
import com.doglab.services.PessoasService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/entrada")
public class EntradaServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		String param = req.getParameter("action");
		switch(param) {
			case "PessoasCadastradas":
				PessoasService ps = new PessoasService();
				ps.showList(req, res);
				break;
		}
	}
	
}
