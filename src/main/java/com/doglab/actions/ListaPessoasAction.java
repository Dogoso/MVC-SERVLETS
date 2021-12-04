package com.doglab.actions;

import java.io.IOException;

import com.doglab.models.Banco;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListaPessoasAction implements Action{

	public String exec(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		Banco banco = new Banco();
		req.setAttribute("funcionarios", banco.getFuncionarios());
		return "foward:funcionarios.jsp";
	}
	
}
