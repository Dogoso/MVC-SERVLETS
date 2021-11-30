package com.doglab.services;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class PessoasService {

	public void showList(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		List<String> funcionarios = new ArrayList<>();
		funcionarios.add("Marcela");
		funcionarios.add("Josivaldo");
		funcionarios.add("Helena");
		funcionarios.add("Viktor");
		
		req.setAttribute("funcionarios", funcionarios);
		
		RequestDispatcher rd = req.getRequestDispatcher("/funcionarios.jsp");
		rd.forward(req, res);
	}
	
	public void registerPerson(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		String empresa = req.getParameter("nome");
		String data = req.getParameter("data");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = sdf.parse(data);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		req.setAttribute("nome", empresa);
		req.setAttribute("data", date);
		if(empresa!=null) {
			RequestDispatcher rd = req.getRequestDispatcher("sucesso.jsp");
			rd.forward(req, res);
		}else {
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.forward(req, res);
		}
	}
	
}
