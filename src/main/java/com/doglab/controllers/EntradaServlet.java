package com.doglab.controllers;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import com.doglab.actions.Action;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/")
public class EntradaServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		
		String actionURI = (String) req.getAttribute("URI");
		String respAction = null;
		try {
			Class<?> actionsClass = Class.forName("com.doglab.actions."+actionURI+"Action");
			Action curAction = (Action) actionsClass.getDeclaredConstructor().newInstance();
			respAction = curAction.exec(req, res);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException 
				| IllegalArgumentException | InvocationTargetException | NoSuchMethodException
				| SecurityException e) {
			throw new ServletException(e);
		}

		String[] methodURI = respAction.split(":");
		if(methodURI[0].equals("foward")) {
			RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/view/" + methodURI[1]);
			rd.forward(req, res);
		}else {
			res.sendRedirect(methodURI[1]);
		}
		
	}
	
}
