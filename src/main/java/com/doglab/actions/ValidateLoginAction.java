package com.doglab.actions;

import java.io.IOException;

import com.doglab.models.Banco;
import com.doglab.models.Usuario;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class ValidateLoginAction implements Action {

	@Override
	public String exec(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		String login = req.getParameter("login");
		String password = req.getParameter("password");
		
		Banco banco = new Banco();
		Usuario user = banco.catchUser(login, password);
		
		HttpSession session = req.getSession();
		session.setAttribute("user", login);
		System.out.println(login);
		return user != null ? "redirect:ListaPessoas" : "redirect:Login";
	}

}
